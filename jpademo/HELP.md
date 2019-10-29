##springboot  整合jpa  
 ###1 
    spring:
      devtools:
        restart:
          enabled: false
      datasource:
        driver-class-name: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8
        hikari:
          username: root
          password:
      jpa:
        hibernate:
          ddl-auto: update
        show-sql: true
 ###2 引入starter
      web  
      mysql 
      jpa
     lombok
