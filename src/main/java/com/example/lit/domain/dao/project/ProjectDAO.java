package com.example.lit.domain.dao.project;

import com.example.lit.domain.vo.Criteria;
import com.example.lit.domain.vo.SearchDTO;
import com.example.lit.domain.vo.project.ProjectDTO;
import com.example.lit.domain.vo.project.ProjectVO;
import com.example.lit.mapper.project.ProjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProjectDAO {
    private final ProjectMapper projectMapper;
    //    프로젝트 목록 가져오기
    public List<ProjectVO> getList(Criteria criteria, String category){ return projectMapper.getList(criteria, category); }
    //    프로젝트 등록
    public void register(ProjectVO projectVO){ projectMapper.insert(projectVO);}
    //    프로젝트 상세보기
    public ProjectVO read(Long projectNumber){ return projectMapper.get(projectNumber); }
    //    프로젝트 상세보기(리뷰작성용)
    public ProjectDTO getForReview(Long projectNumber, Long userNumber){
        return projectMapper.getForReview(projectNumber, userNumber);
    };
    //    프로젝트 삭제
    public boolean remove(Long projectNumber){ return projectMapper.delete(projectNumber) != 0; }
    //    프로젝트 전체 개수
    public int getTotal(){ return projectMapper.getTotal(); }
    //    프로젝트 검색
    public List<ProjectDTO> searchProject(SearchDTO searchDTO){ return projectMapper.searchProject(searchDTO); }
    //  프로젝트 승인(상태변경)
    public void changeStatus(Long projectNumber, Long status){
        projectMapper.changeStatus(projectNumber, status);
    }
    // 프로젝트 상태로 토탈 가져오기
    public int getTotalByStatus(Long status){ return projectMapper.getTotalByStatus(status); }

}
