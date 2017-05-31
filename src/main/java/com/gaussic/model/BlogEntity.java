package com.gaussic.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dzkan on 2016/3/8.
 */
@Entity
@Table(name = "blog")
public class BlogEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Column(name = "content", nullable = true, length = 255)
    private String content;
    @Column(name = "pub_date", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pubDate;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserEntity userByUserId;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }
}
