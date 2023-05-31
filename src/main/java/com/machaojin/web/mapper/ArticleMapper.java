package com.machaojin.web.mapper;

import com.machaojin.web.entity.TArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleMapper extends JpaRepository<TArticle,Integer> {
}
