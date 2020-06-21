package indiv.hb.service;

import indiv.hb.dao.ArticleRepository;
import indiv.hb.model.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl {

    @Resource
    ArticleRepository articleRepository;

    public Article updateArticle(Article article){
        return articleRepository.save(article);
    }
}
