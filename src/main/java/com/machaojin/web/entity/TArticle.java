package com.machaojin.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (TArticle)实体类
 *
 * @author makejava
 * @since 2023-05-31 16:05:38
 */
@Entity(name = "t_article")
public class TArticle implements Serializable {
    private static final long serialVersionUID = -33167818997640135L;
    /**
     * 文章id
     */
    @Id
    private Integer id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

