package com.maven.test.dao;

import com.maven.test.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    /**
     * 根据 图书id 获取单本图书
     * @param bookId 图书id
     * @return
     */
    Book queryById(@Param("bookId") long bookId);

    /**
     * 获取指定条数图书
     * @param offset  查询起始位置
     * @param limit   查询条数
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 书本预约之后，减少对应图书馆藏
     * @param bookId  图书id
     * 让 mybatis 的 update 操作的返回值是受影响的行数，修改数据库链接配置为：增加 useAffectedRows=true
     * @return 返回受影响的行数
     */
    int reduceNum(@Param("bookId") long bookId);

}
