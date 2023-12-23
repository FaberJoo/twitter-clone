package com.twitter.api.domain.follow.entity;

import com.twitter.api.domain.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Follow {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @ManyToOne
    @JoinColumn(name = "follower_id")
    private Member follower;

    @ManyToOne
    @JoinColumn(name = "followee_id")
    private Member followee;
}
