package com.example.demo.dto;


import com.example.demo.entity.Article;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@AllArgsConstructor
@ToString
@Getter
//@Setter
@NoArgsConstructor
public class ArticleForm {

    @NotNull
    private Long id;
    @NotNull
    @Size(min=2, max=30)
    private String title;
    @NotNull
    private String content;
    @NotNull
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Article toEntity(){
        return new Article(id, title, content, author, createdDate, modifiedDate);
    }
}
