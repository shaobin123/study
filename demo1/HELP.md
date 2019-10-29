## 如何快速创建springBoot + mybatis+mysql 项目(数据源使用druid) 
###1.
  勾选的时候千万别选择mybatis 不然项目报错,
  运行会报错：Property ‘sqlSessionFactory’ or ‘sqlSessionTemplate’ are required
###2.加入依赖
     <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>1.2.0</version>
    </dependency>
    
    <dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
    <version>1.1.14</version>
    <scope>compile</scope>
    </dependency>
    
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
###3.mapper 在application 处进行设置 
    @MapperScan(basePackages = "com.mybatis1.demo.dao")选择要扫描的接口层
    
###4.新建application.yml文件，配置数据源
   
    spring:
      datasource:
        url: jdbc:mysql://192.168.0.231:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8
        username: test
        password: test
        driver-class-name: com.mysql.cj.jdbc.Driver #com.mysql.jdbc.Driver被弃用
        type: com.alibaba.druid.pool.DruidDataSource #使用阿里的连接池
    server:
      port: 8888
    
    # xml 跟bean  所在位置
    mybatis:
      mapper-locations: classpath:mapper/*Mapper.xml
      type-aliases-package: com.example.demo.domain

###5.日志记录
     private final Logger logger = LoggerFactory.getLogger(this.getClass());
     
###6.sql记录(CTRL+shift+alt+o)
     logging: #配置sql控制台打印
      level:
        com.example.demo.mapper : debug
        
###7.分页插件使用
     
####1 导入依赖
    <dependency>
        <groupId>com.github.pagehelper</groupId>
        <artifactId>pagehelper</artifactId>
        <version>5.1.7</version>
        <scope>compile</scope>
    </dependency>
####2 使用
    int page=1;
    int size=2;
    PageHelper.startPage(page,size);
    List<City> cities = cityMapper.getAll();
    PageInfo<City> P =new PageInfo<>(cities);
    if(StringUtils.isEmpty(cities)){
        return Response.fail("查询失败");
    }
    logger.info("查询成功");
    return Response.success(P.getTotal(),P.getList());
    
### 标签
     @JsonInclude(JsonInclude.Include.NON_NULL) 
     如果对应的字段为空,不返回 eg:
     @JsonInclude(JsonInclude.Include.NON_NULL)
     private String remark;
   #### set方法设置
     public void setRemark(String remark) {
             if(!StringUtils.isEmpty(remark)){
     
                 this.remark = remark;
             }else{
                 this.remark = null;
             }
         }
         
### json格式请求数据 @RequestBody
        public Response addUser(@RequestBody City city){
            logger.info("--------------城市添加--------------");
            return cityService.insert(city);
        }
        
#### PageHelper分页插件
       pagehelper:
         helperDialect: mysql
         reasonable: true
         supportMethodsArguments: true
         params: count=countSql
##### 整合jpa
      <!-- springdata jpa依赖 -->
      <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
      
      
####数据库连接 
 The specified database user/password combination is rejected: 
 com.mysql.cj.exceptions.InvalidConnectionAttributeException:
  The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä' is unrecognized or represents more than one time zone. 
  You must configure either the server or JDBC driver (via the serverTimezone configuration property)
   to use a more specifc time zone value if you want to utilize time zone support.
######解决方案serverTimezone=GMT%2B8