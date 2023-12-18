package com.twitter.api.domain.member.entity;

import com.twitter.api.domain.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(length = 10, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;
}