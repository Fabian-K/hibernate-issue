package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Base {
    @Id
    String id;
    @OneToOne
    Middle middle;
}
