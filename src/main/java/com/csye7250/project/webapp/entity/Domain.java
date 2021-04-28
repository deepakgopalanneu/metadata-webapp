package com.csye7250.project.webapp.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Domain {

    @Id
    @Column(name="DBName")
    private String dbName;
    @Column(name="DomainName")
    private String domainName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "DBName", insertable = false, updatable = false)
    private List<Node> nodeList = new ArrayList<>();



    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
