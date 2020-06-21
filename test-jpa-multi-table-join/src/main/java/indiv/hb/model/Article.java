package indiv.hb.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;

@Entity
@Table(name = "article")
public class Article {

    @Id
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    public Article() {
        this.id = 1L;
        this.title = "";
        this.content = "";
    }

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
