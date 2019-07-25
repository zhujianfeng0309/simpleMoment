package common.util;

import common.base.BaseException;

/**
 * Created by ZHUJIANFENG on 2019/7/23.
 */
public class SystemException extends BaseException {
    private static final long serialVersionUID = 427394729472912343L;

    public SystemException() {
        super();
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Object[] args, Throwable cause) {
        super(message, args, cause);
    }

    public SystemException(String message, Object[] args) {
        super(message, args);
    }

    public SystemException(Object errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }

    public SystemException(Object errorCode, String message) {
        super(errorCode, message);
    }

    public SystemException(Object errorCode, String message, Object[] args, Throwable cause) {
        super(errorCode, message, args, cause);
    }

    public SystemException(Object errorCode, String message, Object[] args) {
        super(errorCode, message, args);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }
}
