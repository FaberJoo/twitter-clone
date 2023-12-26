package com.twitter.api.domain.mention.entity;

import com.twitter.api.domain.member.entity.Member;
import com.twitter.api.domain.tweet.entity.Tweet;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Mention {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member mentionedMember;

    @ManyToOne
    @JoinColumn(name = "tweet_id")
    private Tweet tweet;
}
