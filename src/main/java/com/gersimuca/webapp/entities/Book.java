package com.gersimuca.webapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "book_entity")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbook")
    private Long idBook;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "img_url")
    private String imageUrl;

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
