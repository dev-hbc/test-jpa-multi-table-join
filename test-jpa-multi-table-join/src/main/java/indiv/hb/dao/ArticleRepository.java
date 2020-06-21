package indiv.hb.dao;

import indiv.hb.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ArticleRepository extends CrudRepository<Article, Long> {

//    @Transactional
//    @Modifying
//    @Query(value = "insert into article(id, title, content) values (:id, :title, :content)", nativeQuery = true)
//    public void insertArticle(@Param("id") Long id, @Param("title") String title, @Param("content") String content);
}