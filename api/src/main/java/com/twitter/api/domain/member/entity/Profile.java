package com.twitter.api.domain.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Profile {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(nullable = false, length = 16, unique = true)
    private String name;

    @Column(nullable = false, length = 16, unique = true)
    private String nickname;

    @Column(length = 160)
    private String introduction;

    @Column
    private String thumbnailUrl;

    @Column
    private String backgroundUrl;
}
