package com.maven.test.dao;

import com.maven.test.BaseTest;
import com.maven.test.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDaoTest extends BaseTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void testInsertStudent(){
        Student student1 = new Student();
        student1.setName("Ghost");
        student1.setSex("男");
        int insert1 = studentDao.insertStudent(student1);
        System.out.println("insert1 = " + insert1);
        Student student2 = new Student();
        student2.setName("Poppy");
        student2.setSex("女");
        int insert2 = studentDao.insertStudent(student2);
        System.out.println("insert2 = " + insert2);
    }

    @Test
    public void testDeleteStudent(){
        long sid1 = 1000016;
        int delete1 = studentDao.deleteStudent(sid1);
        System.out.println("delete1 = " + delete1);
        long sid2 = 1000017;
        int delete2 = studentDao.deleteStudent(sid2);
        System.out.println("delete2 = " + delete2);
    }

}
