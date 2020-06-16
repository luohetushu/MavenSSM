package com.maven.test.exception;

/**
 * 用于业务层非成功情况下的返回（即成功返回结果，失败抛出异常）
 * 预约未知错误异常
 */
public class AppointUnknownException extends RuntimeException {

    public AppointUnknownException(String message) {
        super(message);
    }

    public AppointUnknownException(String message, Throwable cause) {
        super(message, cause);
    }

}
