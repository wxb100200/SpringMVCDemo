package com.gaussic.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by dzkan on 2016/3/8.
 */
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "nickname", nullable = false, length = 45)
    private String nickname;
    @Column(name = "password", nullable = false, length = 45)
    private String password;
    @Column(name = "first_name", nullable = true, length = 45)
    private String firstName;
    @Column(name = "last_name", nullable = true, length = 45)
    private String lastName;
    @OneToMany(mappedBy = "userByUserId",fetch = FetchType.EAGER)
    private Collection<BlogEntity> blogsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Collection<BlogEntity> getBlogsById() {
        return blogsById;
    }

    public void setBlogsById(Collection<BlogEntity> blogsById) {
        this.blogsById = blogsById;
    }
}
