package kr.co.chunjae.controller;

import kr.co.chunjae.dto.CommentDTO;
import kr.co.chunjae.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/comment")
@Log4j2
public class CommentController {

    private final CommentService commentService;

    /*@PostMapping(value = "/save")
    @ResponseBody
    public List<CommentDTO> save(@RequestBody @ModelAttribute CommentDTO commentDTO) {
        log.info("commentDTO={}", commentDTO);
        commentService.save(commentDTO);
        // 해당 게시글에 작성된 댓글 리스트를 가져옴
        List<CommentDTO> commentDTOList = commentService.findAll(commentDTO.getBoardId());
        return commentDTOList;
    }*/

    @PostMapping(value = "/save")
    @ResponseBody
    public List<CommentDTO> save(@ModelAttribute String req) {
        log.info("req={}", req);
        return null;
    }
}
