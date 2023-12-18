package com.twitter.api.domain.auth.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AuthId implements Serializable {
    private String memberId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthId)) return false;
        AuthId authId = (AuthId) o;
        return memberId.equals(authId.memberId);
    }

    @Override
    public int hashCode() {
        return memberId.hashCode();
    }
}
