package com.codegym.blog.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Locale;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne(targetEntity =Category.class)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

    private String header;
    private String content;
    private String footer;
    private LocalDate date;

    public Blog() {
    }

    public Blog(Integer id, String name, Category category, String header, String content, String footer, LocalDate date) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.header = header;
        this.content = content;
        this.footer = footer;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate setDate(LocalDate date) {
        return this.date = date;
    }
}
