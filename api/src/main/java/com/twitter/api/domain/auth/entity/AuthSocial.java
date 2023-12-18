package com.twitter.api.domain.auth.entity;

import com.twitter.api.domain.BaseTimeEntity;
import com.twitter.api.domain.member.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
@Getter
public class AuthSocial{
    @EmbeddedId
    private AuthId id;

    @MapsId("memberId")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Enumerated(EnumType.STRING)
    private Provider provider;

    @Column(nullable = false, length = 50, unique = true, updatable = false)
    private String socialId;

    @Column(nullable = false, length = 100, updatable = false)
    private String email;
}
