package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String headerBlog;
    private String contentBlog;
    private String footerBlog;

    public Blog() {

    }

    public Blog(long id, String headerBlog, String contentBlog, String footerBlog) {
        this.id = id;
        this.headerBlog = headerBlog;
        this.contentBlog = contentBlog;
        this.footerBlog = footerBlog;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeaderBlog() {
        return headerBlog;
    }

    public void setHeaderBlog(String headerBlog) {
        this.headerBlog = headerBlog;
    }

    public String getContentBlog() {
        return contentBlog;
    }

    public void setContentBlog(String contentBlog) {
        this.contentBlog = contentBlog;
    }

    public String getFooterBlog() {
        return footerBlog;
    }

    public void setFooterBlog(String footerBlog) {
        this.footerBlog = footerBlog;
    }
}