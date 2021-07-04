package com.example.projectii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class Class extends Base {

    @Column(name = "className")
    private String className;

    @Column(name = "termName")
    private String termName;

    @Column(name = "termCode")
    private String termCode;

    @Column(name = "amount")
    private int amount;


    public void setClassName(String className) {
        this.className = className;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getClassName() {
        return className;
    }

    public String getTermName() {
        return termName;
    }

    public String getTermCode() {
        return termCode;
    }

    public int getAmount() {
        return amount;
    }
}
