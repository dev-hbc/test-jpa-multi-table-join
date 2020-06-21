package indiv.hb.controller;

import indiv.hb.model.Article;
import indiv.hb.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    ArticleServiceImpl articleService;

    /**
     * Save info from request to sqlite
     * @throws IOException
     */
    @RequestMapping(value = "/{articleId}/{title}/{content}", method = RequestMethod.GET)
    public ResponseEntity<Article> getSpaceReservations(@PathVariable Long articleId, @PathVariable String title, @PathVariable String content){

        Article article = new Article(articleId, title, content);
        Article responseArticle = articleService.updateArticle(article);
        return new ResponseEntity<Article>(responseArticle, HttpStatus.OK);
    }
}
