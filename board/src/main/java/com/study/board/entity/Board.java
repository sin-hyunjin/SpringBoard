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

    // 게시물의 고유 식별자를 나타내는 필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 게시물의 제목을 나타내는 필드
    private String title;

    // 게시물의 내용을 나타내는 필드
    private String content;

    // 게시물에 첨부된 파일의 이름을 나타내는 필드
    private String filename;

    // 게시물에 첨부된 파일의 저장 경로를 나타내는 필드
    private String filepath;



    // 제목 필드의 getter 메서드
    public String getTitle() {
        return title;
    }

    // 제목 필드의 setter 메서드
    public void setTitle(String title) {
        this.title = title;
    }

    // 내용 필드의 getter 메서드
    public String getContent() {
        return content;
    }

    // 내용 필드의 setter 메서드
    public void setContent(String content) {
        this.content = content;
    }

    // 파일명 필드의 getter 메서드
    public String getFilename() {
        return filename;
    }

    // 파일명 필드의 setter 메서드
    public void setFilename(String filename) {
        this.filename = filename;
    }

    // 파일 경로 필드의 getter 메서드
    public String getFilepath() {
        return filepath;
    }

    // 파일 경로 필드의 setter 메서드
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}