package com.library.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Book {

    private int id;
    private String title;
    private String isbn;
    private String description;
    private LocalDate publicationDate;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    //Constructores
    public Book(){}

    public Book(String title){
        this.title = title;
    }

    public Book(String title, String isbn, String description, LocalDate date){
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.publicationDate = date;
    }

    //Getters & setters


    public int getId() {
        return this.id;
    }

    /*public void setId(int id) {
        this.id = id; ---> no se debería poder cambiar!
    }*/

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public LocalDateTime getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    //equals y HashCode
    


}
    //Constructores
    //Getters & setters
    //equals y HashCode