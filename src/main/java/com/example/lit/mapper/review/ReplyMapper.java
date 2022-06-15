package com.example.lit.mapper.review;

import com.example.lit.domain.vo.Criteria;
import com.example.lit.domain.vo.review.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
    //댓글 추가
    public void insert(ReplyVO replyVO);
    //댓글 삭제
    public int delete(Long replyNumber);
    //댓글 수정
    public int update(ReplyVO replyVO);
    //댓글 목록
    public List<ReplyVO> getList(Criteria criteria,Long reviewNumber);
    //댓글 개수
    public int getTotal(Long reviewNumber);
}
