package org.example;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Target {
    @Id
    String id;
    String field;
}
