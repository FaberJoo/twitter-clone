package com.twitter.api.domain.tweet.entity;

import com.twitter.api.domain.BaseTimeEntity;
import com.twitter.api.domain.member.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Tweet extends BaseTimeEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(nullable = false, length = 140)
    private String content;

    @Column(nullable = false)
    @ColumnDefault("0")
    private long likeCount;

    @Column(nullable = false)
    @ColumnDefault("0")
    private long replyCount;

    @Column(nullable = false)
    @ColumnDefault("0")
    private long retweetCount;
}
