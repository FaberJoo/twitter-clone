package com.twitter.api.domain.auth.entity;

import com.twitter.api.domain.member.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class AuthLocal{
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    @OneToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 75)
    private String password;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime modifiedAt;
}
