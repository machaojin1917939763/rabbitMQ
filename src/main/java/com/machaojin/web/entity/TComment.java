package com.machaojin.web.entity;




import javax.persistence.*;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (TComment)实体类
 *
 * @author makejava
 * @since 2023-05-31 16:05:39
 */
@Entity(name = "t_comment")
public class TComment implements Serializable {
    private static final long serialVersionUID = 791963303945726046L;
    /**
     * 评论id
     */
    @Id
    private Integer id;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论作者
     */
    private String author;
    /**
     * 关联的文章id
     */
    private Integer aId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAId() {
        return aId;
    }

    public void setAId(Integer aId) {
        this.aId = aId;
    }

    @Override
    public String toString() {
        return "TComment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aId=" + aId +
                '}';
    }
}

