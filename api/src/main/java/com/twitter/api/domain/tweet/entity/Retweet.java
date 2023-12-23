package com.twitter.api.domain.tweet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Retweet {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @ManyToOne
    private Tweet tweet;

    @ManyToOne
    private Tweet retweet;
}
