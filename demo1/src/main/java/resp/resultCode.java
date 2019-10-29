package resp;

import java.util.LinkedHashMap;
import java.util.Map;

public enum resultCode {

    SUCCESS("200","success"),
    FAIL("501", "fail"),
    SERVER_ERROR("500", "服务器错误"),
    INSERT_FAIL("300","添加失败");

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    private resultCode(String status, String message) {
        this.status = status;
        this.message = message;
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
