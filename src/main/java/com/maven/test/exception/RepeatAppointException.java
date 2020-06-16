package com.maven.test.exception;

/**
 * 用于业务层非成功情况下的返回（即成功返回结果，失败抛出异常）
 * 重复预约异常
 */
public class RepeatAppointException extends RuntimeException {

    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }

}
