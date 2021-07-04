package com.example.projectii.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "createBy")
    private String createBy;

    @Column(name = "createDate")
    private Date createDate;

    public long getId() {
        return id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
