package org.example;

import java.io.Serializable;

public class MiddleId implements Serializable {
    String key;
    String target;

    public MiddleId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiddleId id = (MiddleId) o;

        if (this.key != null ? !this.key.equals(id.key) : id.key != null) return false;
        return target != null ? target.equals(id.target) : id.target == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        return result;
    }
}
