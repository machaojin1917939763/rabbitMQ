package com.machaojin.web.mapper;

import com.machaojin.web.entity.TComment;

import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommentMapper extends JpaRepository<TComment, Integer> {
    public List<TComment> findTCommentByAuthorNotNull();


    @Query(value = "select * from t_comment where a_id = ? limit ? , ?", nativeQuery = true)
    List<TComment> findByAIdPaged(Integer id, Integer start, Integer size);

}
