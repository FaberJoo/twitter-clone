package com.twitter.api.domain.media.entity;

import com.twitter.api.domain.tweet.entity.Tweet;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class TweetMedia {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @ManyToOne
    private Tweet tweet;

    @OneToOne
    private Media media;
}
