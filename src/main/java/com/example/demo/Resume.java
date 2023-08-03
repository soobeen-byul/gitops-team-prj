package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity // 엔터티로 지정
@Getter // 게터 메서드 대체
//@Setter
@NoArgsConstructor(access= AccessLevel.PROTECTED) //기본 생성자 생성
public class Resume {
    @Id //id 필드를 기본키로 지정
    @GeneratedValue(strategy= GenerationType.IDENTITY) //기본키 : auto increment
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="github", nullable = false)
    private String github;

    @Column(name="aboutme", nullable = false)
    private String aboutme;

    @Builder // 빌더 패턴으로 객체 생성
    public Resume(String name, String github, String aboutme){
        this.name=name;
        this.github=github;
        this.aboutme=aboutme;
    }
}
