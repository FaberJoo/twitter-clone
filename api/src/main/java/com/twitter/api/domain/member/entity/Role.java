package com.twitter.api.domain.member.entity;

public enum Role {
    // 관리자
    ADMIN,
    // 일반 회원
    MEMBER,
    // 일반 사용자
    USER,
    // 탈퇴 회원
    WITHDRAWAL,
    // 차단 회원
    BLOCKED,
    // 휴면 회원
    DORMANT
}
