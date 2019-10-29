
package resp;

import java.util.LinkedHashMap;
import java.util.Map;

public enum RespCode {
    //
    INSERT_FAIL("301","添加失败"),
    INSERT_SUCCESS("300","添加成功"),
    SUCCESS("200", "success"),
    SERVER_ERROR("500", "服务器错误"),
    SERVER_DELAY_ERROR("1503", "服务器延时错误"),
    PARAM_ERROR("501", "系统参数错误"),
    FAIL("501", "fail"),
    FAIL_INVALID("502", "操作失败"),

    INPUT_PARAM_ERROR("502", "存在非法或敏感字符"),

    REG_USERNAME_REQUIRED("40001", "用户名不能为空"),
    REG_PASSWORD_REQUIRED("40002", "密码不能为空"),
    REG_MOBILE_REQUIRED("40003", "手机号不能为空"),
    REG_VALIDATECODE_REQUIRED("40004", "验证码不能为空"),
    REG_SEX_REQUIRED("40005", "性别不能为空"),
    REG_ACCOUNT_EXIST("40006", "the account has already been registered!"),
    REG_MOBILE_EXIST("40007", "此手机号已经被注册"),
    REG_MOBILE_ERROR("40008", "注册失败"),

    LOGIN_PARAM_REQUIRED("40009", "用户名或密码不能为空"),
    LOGIN_ACCOUNT_NOEXIST("40010", "the account does not have to register"),
    LOGIN_PASSWORD_ERROR("40011", "密码不正确"),

    EDIT_USERINFO_ERROR("40012", "修改失败"),
    EDIT_MOBILE_EXIST("40013", "此手机号已经被注册"),
    EDIT_MOBILE_ERROR("40014", "修改手机绑定失败"),
    DELETE_USERINFO_ERROR("40015", "删除失败"),

    REG_FINDPWD_EXIST("40016", "账户不存在"),
    REG_CONFIRMPWD_EXIST("40017", "两次密码输入不一致"),
    REG_RESETPWD_EXIST("40018", "重置密码失败"),
    REG_LOGIN_ERROR("40019", "账号或密码错误"),
    REG_CUSTOMER_ERROR("40020", "此账号已锁定，请15分钟后再试"),

    REG_SEND_SMS_VALIDATE("40021", "您今天发送验证码次数已达上限"),
    REG_SEND_SMS_VALIDATE_ERROR("40022", "验证码发送失败"),
    SMS_VALIDATE_FAILURE("40023", "短信验证码错误"),
    SMS_VALIDATE_EXPIRED("40025", "短信验证已过期"),
    SMS_VALIDATE_EXCEPTION("40026", "短信验证异常"),

    REG_AREA_REQUIRED("40027", "区号不能为空"),
    REG_LOGIN_EXPIRED("40027", "此账户已在登录"),
    REG_INVITATION_ERROR("40028", "邀请码错误"),
    REG_LOGINWAY_ERROR("40029", "登录方式参数错误"),
    REG_ACCOUNT_ERROR("40030", "账户已冻结"),
    REG_ACCOUNT_STATE_ERROR("40031", "账户非正常状态"),

    USER_TOKEN_FORBIDDEN("40032","用户令牌异常或过期,请求被禁止"),
    USER_INFO_EXCEPTION("40033","用户信息异常,请求被禁止"),

    DECDUTION_PROCESS_FAILURE("41001", "deduct process faliure"),

    ACTIVITYTOP_PARAM_REQUIRED("42001", "推荐活动主键、经度、纬度为必须"),

    ACTIVITY_PARAM_MALLID_REQUIRED("43001", "商场ID为必须"),
    ACTIVITY_PARAM_PID_REQUIRED("43002", "活动主键为必须"),

    BRAND_PARAM_MALLID_REQUIRED("44001", "商场ID为必须"),

    USER_SHOW_PARAMS_REQUIRED("45001", "pageSize和pageNum必填"),
    USER_SHOW_IMG_REQUIRED("45002", "图片不能为空"),
    USER_SHOW_CONTENT_LENGTH_REQUIRED("45003", "字数必须在2到200之间"),

    USER_ATTENTION_PARAMS_REQUIRED("46001", "参数必填"),

    USER_LETTER_PARAMS_REQUIRED("47001", "消息收件人、发件人、消息内容不能为空"),
    USER_LETTER_NOT_EXIST("47002", "该用户目前没有消息"),

    FEEDBACK_PARAMS_REQUIRED("48001", "反馈意见内容不能为空"),

    USER_ID_REQUIRED("49001", "用户ID不能为空"),
    USER_COMMENT_USERSHOWID_REQUIRED("49002", "userShowId不能为空"),
    USER_COMMENT_LENGTH_REQUIRED("49003", "字数必须在2到200之间"),
    ACTIVITYID_REQUIRED("49004", "activityId不能为空"),

    USER_WISH_PARAMS_REQUIRED("41101", "参数必填"),

    SEARCH_KEYWORDS_REQUIRED("41201", "关键字必填"),
    SEARCH_POSITION_REQUIRED("41202", "关键字必填"),

    USER_VALIDATECODE_REQUIRED("41301", "验证码必填"),
    USER_PASSWORD_REQUIRED("41302", "新密码必填"),
    USER_MOBILE_NOEXIST("41303", "此手机号未注册"),
    USER_VALIDATECODE_NOEXIST("41304", "验证码不正确，请重新输入"),
    USER_VALIDATECODE_EXPIRES("41305", "该验证码已过期，请重新获取"),

    USER_VALIDATECODE_GET("41307", "该手机号未获取验证码"),
    USER_VALIDATECODE_HASRESET("41308", "该验证码已经使用过，请重新获取"),
    USER_VALIDATECODE_ERROR("41309", "获取验证码失败"),
    USER_CURRENT_PAGE_VALIDATECODE("41310", "请在本页获取验证码"),
    USER_MOBILE_REQUIRED("41311", "手机号必填"),
    USER_RESETPASSWORD_ERROR("41312", "重置密码失败"),

    USER_REAL_NAME("42001", "请填写真实姓名"),
    USER_CARD_NO("42002", "请填写证件号码"),
    USER_CARD_IMG("42003", "请上传证件照"),
    USER_LOCK_IMG("42003", "证件照上传不完整"),

    COUPON_NUM_REQUIRED("41401", "优惠券购买张数不能为空"),
    COUPON_ADD_ERROR("41402", "领取优惠券失败"),
    COUPON_RECEIVED("41403", "优惠券已经领取"),
    COUPON_NOEXIST("41404", "优惠券已下架"),
    COUPON_USE_PARAM_REQUIRED("41405", "缺少参数userId或者couponIndividualIds"),
    COUPON_USE_ERROR("41406", "使用优惠券失败"),
    COUPON_NOT_RECEIVED("41407", "你还未领取优惠券"),
    STORE_NOEXIST("41408", "门店不存在"),
    STORE_NOT_EMPLOYEE("41409", "员工不存在"),
    USER_LATITUDE_LONGITUDE_REQUIRED("41410", "经纬度不能为空"),
    COUPON_REPEATED_USED("41411", "不能重复使用优惠券"),
    COUPON_ID_REQUIRED("41412", "优惠券ID不能为空"),
    COUPON_NOT_GETTED("41413", "啊哦，最后一张没抢到哦"),
    COUPON_INVENTORY_ZERO("41414", "优惠券已领完"),
    COUPON_INVENTORY_INSUFFICIENT("41415", "库存不足"),
    COUPON_NO_REQUIRED("41416", "优惠券编号不能为空"),
    COUPON_LIMIT_COUNT_PER_PERSON("41417", "此为限购产品"),
    COUPON_ENDDATE("41418", "商品过期已不能领取"),
    USED_TIME_NOT("41419", "优惠券的使用时间未到"),

    TRADE_AREA_ID_REQUIRED("41501", "商圈ID不能用空"),

    STARTUP_PHONETYPE_NOEXIST("41601", "图片类型不存在"),

    BRANDMALL_NOEXIST("41701", "数据不存在"),
    BRAND_ID_REQUIRED("41702", "品牌ID不能为空"),
    BRAND_NOT_EXIST("41703", "品牌不存在"),

    USER_BRAND_PARAMS_REQUIRED("41801", "userId和brandId参数不能为空"),
    USER_BRAND_EXIST("41802", "该用户已经添加过该品牌"),
    USER_BRAND_NOT_EXIST("41803", "该用户没有添加过该品牌"),

    PRODUCT_SUPPORT_ALREADY("41901", "此单品已点赞过"),
    PRODUCT_SUPPORT_NOT_CANCEL("41902", "没有可取消的点赞"),
    USER_PRODUCT_ALREADY("41903", "此单品已要过"),
    USER_PRODUCT_NOT_CANCEL("41904", "没有可取消的要单品"),

    COUPONTITLE_REQUIRED("42101", "代金券标题不能为空"),
    COUPONCODE_REQUIRED("42102", "券码不能为空"),
    BEGINDATE_REQUIRED("42103", "开始有效期不能为空"),
    ENDDATE_REQUIRED("42104", "结束有效期不能为空"),
    TEMPLATEID_REQUIRED("42105", "模板Id不能为空"),


    ADDRESSID_REQUIRED("42106", "地址Id不能为空"),
    PARAMETER_REQUIRED("42107", "参数缺失"),
    PARAMETER_FORMAT_ERROR("42108", "参数格式错误"),

    UPDATETIME("42201", "更新时间不能为空"),

    MINELLI_USERNAME_REQUIRED("60001", "姓名不能为空"),
    MINELLI_MOBILE_REQUIRED("60002", "手机号不能为空"),
    MINELLI_COUPON_ID_REQUIRED("60003", "优惠券ID不能为空"),
    MINELLI_MOBILE_DUPLICATED("60004", "该手机号已预约过"),
    MINELLI_APPOINTMENT_FAILED("60005", "预约失败，请重试"),
    MINELLI_NO_GIFT("60006", "都被抢光啦，下次请早么么哒~！"),
    MINELLI_INVALID_REQUEST("60007", "invalid request!"),


    FILES_UPLOAD_PARAMS_ERROR("80001", "文件上传参数错误!"),
    FILES_UPLOAD_SIZE_ERROR("80002", "文件超出大小限制!"),
    FILES_UPLOAD_TYPE_ERROR("80003", "文件上传类型错误!"),
    FILES_UPLOAD_FAILURE("80004", "文件上传失败!"),
    FILES_UPLOAD_SAVE_FAILURE("80005", "文件存储失败!"),
    FILES_DELETE_PARAMS_ERROR("80020", "文件删除参数错误!"),
    FILES_DELETE_FAILURE("80021", "文件删除失败!"),

    ORDER_CUSTOMER_ADDRESS_INVALID("50001", "收货地址不存在!"),
    ORDER_PRICE_IS_CHANGE("50002", "由于外币汇率问题商品价格有变动，请刷新页面后重试！"),
    ORDER_GEN_ERROR("50003", "订单支付流水生成失败,请稍后重试！"),
    ORDER_PRICE_SETTING_ERROR("50004", "商品价格设置不正确,请联系客服!"),
    ORDER_PRO_AND_STORES_ERROR("50005", "商品ID或免税店信息不正确或已无货,请联系客服!"),
    ORDER_INVALID("50006", "订单无效!"),
    ORDER_PAYING("50007", "支付处理中请耐心等待!"),
    ORDER_REPEAT_PAY("50008", "订单已支付无需重复支付!"),
    ORDER_PAYMENTINFO_MONEY_ERROR("50009", "支付流水金额格式不正确!"),
    ORDER_REFUND_ERROR("50010", "退款操作失败!"),
    ORDER_HAS_REFUND("50011", "该订单已退款,无法进行重复操作!"),

    ORDER_KD_INVALID("50100", "请使用飞购提供的发货功能在APP上预约快递取件!"),
    ORDER_KD_STORES_ERROR("50101", "您的快递还没有物流流转信息，请发货后再来扫码!"),
    ORDER_KD_DATE_ERROR("50102", "发货时间要在您的航班到达时间之后!"),
    ORDER_KD_ERROR("50104", "预约取件失败!"),

    COUPON_RECEIVE_FAIL("51000", "礼包领空，感谢您的参与!"),
    COUPON_INVALID_FAIL("51001", "优惠券无效"),
    COUPON_COUPON_TYPE_FAIL("51002", "优惠券类型无效"),
    COUPON_USE_TYPE_FAIL("51003", "优惠券使用类型无效"),
    COUPON_HAS_RECEIVED("51004", "该账户已经领取过此优惠券大礼包，分享给其它小伙伴吧!"),
    COUPON_RECEIVE_EMPTY("51005", "礼包领空，感谢您的参与!"),
    COUPON_USE_CHECK_ERROR("51006", "部分优惠券无法使用,请刷新后重新操作!"),


    SAVEVENDORFLIGHT_STATE("2001", "该航班起始时间不符合保存条件"),

    ORDER_PRICE_IS_LIMIT("50012", "没有抢到该商品 请稍后重试！"),
    ORDER_PRICE_IS_LIMIT_SELL_UP("50013", "限时购商品已售完！"),
    ADMIN_EMPTY("90001", "管理员无效"),
    ;

    private String status;
    private String message;

    RespCode(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public static Map<String, Object> getMap() {
        Map<String, Object> retMap = new LinkedHashMap<String, Object>();
        RespCode[] enumArr = RespCode.values();
        for (RespCode aEnum : enumArr) {
            retMap.put(aEnum.name(), new String[]{aEnum.getStatus(), aEnum.getMessage()});
        }
        return retMap;
    }

}
