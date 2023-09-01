package me.songjaegeun.springbootdeveloper.dto;

import lombok.Getter;
import me.songjaegeun.springbootdeveloper.domain.Article;

@Getter
public class ArticleListViewResponse { // view에 전달하는 객체

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
