package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;

@Entity
@IdClass(MiddleId.class)
public class Middle {
    @Id
    String key;
    @Id
    @OneToOne
    Target target;
}
