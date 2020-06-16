package com.maven.test.dao;

import com.maven.test.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {

    /**
     * 根据实体类对象插入对应数据
     * @param student
     * @return
     */
    int insertStudent(@Param("student") Student student);

    /**
     * 根据 sid 删除数据
     * @param studentId
     * @return
     */
    int deleteStudent(@Param("studentId") long studentId);

}
