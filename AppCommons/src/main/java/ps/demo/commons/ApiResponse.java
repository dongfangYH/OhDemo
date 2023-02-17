package ps.demo.commons;

import lombok.Data;

/**
 *
 */
@Data
public class ApiResponse<T>
{
    private T data;
    private Integer code;
    private String msg;

    public ApiResponse(T data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public ApiResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static final ApiResponse ok(Object data){
        return new ApiResponse(data, AppCode.SUCCESS);
    }

    public static final ApiResponse fail(){
        return fail(AppCode.FAIL, null);
    }

    public static final ApiResponse fail(Integer code, String msg){
        return new ApiResponse(code, msg);
    }
}
