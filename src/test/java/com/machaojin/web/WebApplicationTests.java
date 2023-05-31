package com.machaojin.web;

import com.machaojin.web.entity.TComment;
import com.machaojin.web.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class WebApplicationTests {


    @Resource
    private CommentMapper commentMapper;
    @Test
    void contextLoads() {
        //完成查询Author不为空的记录
        List<TComment> tCommentByAuthorNotNull = commentMapper.findTCommentByAuthorNotNull();
        System.out.println(tCommentByAuthorNotNull);
    }

    @Test
    void insert(){
        TComment comment = new TComment();
        comment.setAuthor("马超金");
        comment.setAId(2);
        comment.setContent("很好很精彩");
        comment.setId(6);
        commentMapper.save(comment);
    }

    @Test
    void selectLimited(){
        List<TComment> limited = commentMapper.findByAIdPaged(1, 1, 5);
        System.out.println(limited);
    }

}
