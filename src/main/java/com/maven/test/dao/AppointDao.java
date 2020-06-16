package com.maven.test.dao;

import com.maven.test.entity.Appoint;
import org.apache.ibatis.annotations.Param;

public interface AppointDao {

    /**
     * 插入预约图书记录
     * @param bookId
     * @param studentId
     * @return 插入的行数
     */
    int insertAppoint(@Param("bookId") long bookId, @Param("studentId") long studentId);

    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     * @param bookId
     * @param studentId
     * @return
     */
    Appoint queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);

    /**
     * 通过主键查询预约图书记录，并且携带图书实体
     * @param studentId
     * @return
     */
    Appoint queryByKeyWithBooks(@Param("studentId") long studentId);

}
