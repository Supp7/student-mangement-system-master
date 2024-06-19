package cn.demo.student.service;

import cn.demo.student.domain.Scores;
import cn.demo.student.service.dto.ScoresQueryCriteria;

import cn.demo.student.vo.EchartsSeriesModel;
import cn.demo.student.vo.RegisterScoresModel;
import org.springframework.data.domain.Pageable;
import java.util.HashMap;
import java.util.List;

/**功能描述：成绩管理业务接口*/
public interface IScoresService {

    /**
     * 获取成绩列表
     * @param queryCriteria
     * @param pageable
     * @return
     */
    Object getList(ScoresQueryCriteria queryCriteria, Pageable pageable);

    /**
     * 登记班级学科成绩
     * @param scoresModel
     * @return
     */
    void registerScores(RegisterScoresModel scoresModel);

    /**
     * 更新成绩
     * @param scores
     */
    void editScores(Scores scores);

    /**
     * 删除成绩
     * @param id
     */
    void deleteById(Long id);

    /**
     * 统计班级科目成绩
     * @param courseId
     * @param gradeClassId
     * @return
     */
    List<EchartsSeriesModel> getScoreCensus(Long courseId, Long gradeClassId);

    /**
     * 班级学科成绩对比
     * @param courseId
     * @return
     */
    HashMap<String, Object> getScoresContrastCensus(Long courseId);

    /**
     * 所有学科成绩对比
     * @return
     */
    HashMap<String, Object> getAllSubjectScoreContrast();
}
