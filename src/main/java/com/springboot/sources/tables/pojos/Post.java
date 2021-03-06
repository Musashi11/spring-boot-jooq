/*
 * This file is generated by jOOQ.
*/
package com.springboot.sources.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Post implements Serializable {

    private static final long serialVersionUID = 1795543882;

    private UInteger  id;
    private String    title;
    private UInteger  userId;
    private Timestamp publishedAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean   isActive;

    public Post() {}

    public Post(Post value) {
        this.id = value.id;
        this.title = value.title;
        this.userId = value.userId;
        this.publishedAt = value.publishedAt;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.isActive = value.isActive;
    }

    public Post(
        UInteger  id,
        String    title,
        UInteger  userId,
        Timestamp publishedAt,
        Timestamp createdAt,
        Timestamp updatedAt,
        Boolean   isActive
    ) {
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isActive = isActive;
    }

    @NotNull
    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 128)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NotNull
    public UInteger getUserId() {
        return this.userId;
    }

    public void setUserId(UInteger userId) {
        this.userId = userId;
    }

    public Timestamp getPublishedAt() {
        return this.publishedAt;
    }

    public void setPublishedAt(Timestamp publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Post (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(userId);
        sb.append(", ").append(publishedAt);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(isActive);

        sb.append(")");
        return sb.toString();
    }
}
