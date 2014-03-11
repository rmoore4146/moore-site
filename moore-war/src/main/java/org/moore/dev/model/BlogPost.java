package org.moore.dev.model;

import java.util.Date;

/**
 * user: ryan.moore@sparcedge.com
 * date: 3/9/14
 */
public class BlogPost {

    private String author;
    private String text;
    private Date date;
    private String title;

    public BlogPost(String title, String text) {
        this.title = title;
        this.text = text;
        this.author = "Ryan Moore";
        this.date = new Date();
    }

    public BlogPost() {}

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
