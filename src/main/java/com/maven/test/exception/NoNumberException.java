package com.maven.test.exception;

/**
 * 用于业务层非成功情况下的返回（即成功返回结果，失败抛出异常）
 * 库存不足异常
 */
public class NoNumberException extends RuntimeException {

    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
