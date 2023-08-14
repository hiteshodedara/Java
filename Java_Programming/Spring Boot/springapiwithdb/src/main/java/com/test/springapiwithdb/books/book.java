package com.test.springapiwithdb.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.hibernate.dialect.MySQL8Dialect;
import org.hibernate.dialect.MySQLDialect;

@Entity
@Table(name="booktable")
public class book {
    MySQLDialect
    @id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String author;

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public book() {
    }

    public book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
