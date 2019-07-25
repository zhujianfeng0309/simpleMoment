package common.base;

/**
 * Created by ZHUJIANFENG on 2019/7/23.
 */
public class BaseException extends RuntimeException{
    private static final long serialVersionUID = 1095242212086237834L;

    protected Object errorCode;
    protected Object[] args;

    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Object[] args, Throwable cause) {
        super(message, cause);
        this.args = args;
    }

    public BaseException(String message, Object[] args) {
        super(message);
        this.args = args;
    }

    public BaseException(Object errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public BaseException(Object errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public BaseException(Object errorCode, String message, Object[] args, Throwable cause) {
        super(message, cause);
        this.args = args;
        this.errorCode = errorCode;
    }

    public BaseException(Object errorCode, String message, Object[] args) {
        super(message);
        this.args = args;
        this.errorCode = errorCode;
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public Object[] getArgs() {
        return args;
    }

    public Object getErrorCode() {
        return errorCode;
    }
}
