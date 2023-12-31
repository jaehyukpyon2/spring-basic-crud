package kr.co.chunjae.repository;

import kr.co.chunjae.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
@Log4j2
public class BoardRepository {

    private final SqlSessionTemplate template;

    public int save(BoardDTO boardDTO) {
        return template.insert("Board.save", boardDTO);
    }

    public List<BoardDTO> findAll() {
        return template.selectList("Board.findAll");
    }

    public BoardDTO findById(Long id) {
        return template.selectOne("Board.findById", id);
    }

    public void updateHits(Long id) {
        template.update("Board.updateHits", id);
    }

    public void delete(Long id) {
        template.delete("Board.delete", id);
    }

    public void update(BoardDTO boardDTO) {
        template.update("Board.update", boardDTO);
    }

    public List<BoardDTO> pagingList(Map<String, Integer> pagingParams) {
        return template.selectList("Board.pagingList", pagingParams);
    }

    public int boardCount() {
        return template.selectOne("Board.boardCount");
    }
}
