package me.songjaegeun.springbootdeveloper.repository;

import me.songjaegeun.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
