package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board) {

        boardRepository.save(board);
    }
    public List<Board> boardList() {
//      findAll() -> List를 그대로 반환해준다.
        return boardRepository.findAll();

    }
}
