package com.maven.test.dto;

import com.maven.test.entity.Appoint;
import com.maven.test.enums.AppointStateEnum;

/**
 * 封装预约执行结果
 */
public class AppointExecution {

    private long bookId; // 图书id
    private int state;  //预约执行结果状态
    private String stateInfo; // 预约执行结果状态信息

    private Appoint appoint;  //预约成功对象

    public AppointExecution() {
    }

    //预约失败构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum){
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //预约成功构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appoint appoint){
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appoint = appoint;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appoint getAppoint() {
        return appoint;
    }

    public void setAppoint(Appoint appoint) {
        this.appoint = appoint;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appoint=" + appoint +
                '}';
    }
}
