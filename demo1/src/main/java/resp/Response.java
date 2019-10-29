package resp;


import com.fasterxml.jackson.annotation.JsonInclude;
import constant.RestCodeConstants;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * 响应结果集
 *
 * @author lmx
 */
public class Response implements Serializable {

    private static final long serialVersionUID = -1692423742911333328L;

    private String status = RespCode.SUCCESS.getStatus();
    private String message = RespCode.SUCCESS.getMessage();
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data ;

    public Response() {
    }

    public Response(Object data) {
        this.data = data;
    }

    public Response(String message) {
        this.message = message;
    }

    public Response(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Response(String status, String message, Object data) {
        this.status = status;
        this.message = message;

        if(!StringUtils.isEmpty(data)){
            this.data = data;
        }else{
            this.data = null;
        }
    }

    public Response(RespCode respCode) {
        this.status = respCode.getStatus();
        this.message = respCode.getMessage();
    }

    public Response(long total, List<?> rows) {
        this.data = new TableData(total, rows);
    }

    /**
     * 成功
     */
    public static Response success() {
        return new Response();
    }

    /**
     * 成功
     */
    public static boolean isSuccess(int n) {
        return n == 1;
    }

    /**
     * 成功
     */
    public static boolean isClientSuccess(String status) {
        return status.equals(RespCode.SUCCESS.getStatus());
    }

    /**
     * 成功
     */
    public static Response success(String message) {
        return new Response(message);
    }

    /**
     * 成功
     */
    public static Response success(Object data) {
        return new Response(data);
    }

    /**
     * 成功
     */
    public static Response success(RespCode respCode) {
        return new Response(respCode.getStatus(), respCode.getMessage());
    }

    /**
     * 成功
     */
    public static Response success(RespCode respCode, Object data) {
        return new Response(respCode.getStatus(), respCode.getMessage(), data);
    }

    /**
     * 带分页
     */
    public static Response success(Long total, List<?> rows) {
        return new Response(total, rows);
    }

    /**
     * 成功
     *
     * @return 结果
     */
    public static Response success(String message, Object data) {
        return new Response(RespCode.SUCCESS.getStatus(), message, data);
    }

    /**
     * 失败
     *
     * @return 结果
     */
    public static Response fail() {
        return new Response(RespCode.FAIL.getStatus(), RespCode.FAIL.getMessage());
    }

    /**
     * 失败
     *
     * @return 结果
     */
    public static Response fail(RespCode resultEnum) {
        return new Response(resultEnum.getStatus(), resultEnum.getMessage());
    }

    /**
     * 失败
     *
     * @return 结果
     */
    public static Response fail(String status, String message) {
        return new Response(status, message);
    }

    /**
     * 失败
     *
     * @return 结果
     */
    public static Response fail(String message) {
        return new Response(RespCode.PARAM_ERROR.getStatus(), message);
    }

    /**
     * 失败
     *
     * @return 结果
     */
    public static Response fail(String message, Object data) {
        return new Response(RespCode.PARAM_ERROR.getStatus(), message, data);
    }

    /**
     * 失败
     *
     * @return 结果
     */
    public static Response fail(String respCode, String message, Object data) {
        return new Response(respCode, message, data);
    }

    /**
     * tokenError
     *
     * @return 结果
     */
    public static Response tokenError(String message) {
        return new Response(String.valueOf(RestCodeConstants.TOKEN_ERROR_CODE), message);
    }

    /**
     * tokenForbidden
     *
     * @return 结果
     */
    public static Response tokenForbiddenResponse(String message) {
        return new Response(String.valueOf(RestCodeConstants.TOKEN_FORBIDDEN_CODE), message);
    }



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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    class TableData {
        long total;
        List<?> rows;

        TableData(long total, List<?> rows) {
            this.total = total;
            this.rows = rows;
        }

        public TableData() {
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public List<?> getRows() {
            return rows;
        }

        public void setRows(List<?> rows) {
            this.rows = rows;
        }
    }

}
