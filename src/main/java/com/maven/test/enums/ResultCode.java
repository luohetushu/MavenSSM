package com.maven.test.enums;

public enum ResultCode {

    NULL_VALUE(401, "参数为空或者参数有误"),
    SUCCESS(200, "返回成功");

    int code;
    String codeInfo;

    ResultCode(int code, String codeInfo) {
        this.code = code;
        this.codeInfo = codeInfo;
    }

    public int getCode() {
        return code;
    }

    public String getCodeInfo() {
        return codeInfo;
    }
}
