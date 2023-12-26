package com.twitter.api.domain.media.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Media {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(nullable = false, length = 100)
    private String url;

    @Enumerated
    private MediaType type;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
