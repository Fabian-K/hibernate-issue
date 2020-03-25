package org.example;

import org.hibernate.testing.junit4.BaseCoreFunctionalTestCase;
import org.junit.Test;

public class TestCase extends BaseCoreFunctionalTestCase {

    @Override
    protected Class[] getAnnotatedClasses() {
        return new Class[]{
                Base.class,
                Middle.class,
                Target.class,
        };
    }

    @Test
    public void issue() {
        openSession().createQuery("SELECT b FROM Base b where b.middle.target.field = :value", Base.class)
                .setParameter("value", "value")
                .getResultList();
    }
}
