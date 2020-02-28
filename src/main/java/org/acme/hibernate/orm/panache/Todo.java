package org.acme.hibernate.orm.panache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Todo extends PanacheEntity {

    @Column(length = 40)
    public String name;

    public  String priority;

    public  String description;

    public boolean done;


    public Todo() {
    }

    public Todo(String name) {
        this.name = name;
    }
}
