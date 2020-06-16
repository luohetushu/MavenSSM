package com.maven.test.dto;

import com.maven.test.enums.ResultCode;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

    int code;
    boolean success;
    T data;
    String error;

    public Result() {
    }

    // 成功时的构造器
    public Result(ResultCode resultCode, boolean success, T data) {
        this.code = resultCode.getCode();
        this.success = success;
        this.data = data;
    }

    // 错误时的构造器
    public Result(ResultCode resultCode, boolean success, String error) {
        this.code = resultCode.getCode();
        this.success = success;
        this.error = error;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
