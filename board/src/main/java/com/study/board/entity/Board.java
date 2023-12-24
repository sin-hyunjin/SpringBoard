package com.study.board.entity;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


// DB테이블 이름과 같게 하는게 좋다
@Entity
@Data
public class Board {
    @Id // primarykey를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql , mariadb  IDENTITY가 알아서 처리해줌
    private Integer id;
    private String title;
    private String content;
}
