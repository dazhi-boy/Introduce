package dazhi.admin.util;

public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result build() {
        return new Result();
    }

    public static Result ok(String msg) {
        return new Result(200, msg, null);
    }

    public static Result ok(String msg, Object data) {
        return new Result(200, msg, data);
    }

    public static Result error(String msg) {
        return new Result(500, msg, null);
    }

    public static Result error(String msg, Object data) {
        return new Result(500, msg, data);
    }

    private Result() {
    }

    private Result(Integer status, String msg, Object data) {
        this.code = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
