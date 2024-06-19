package cn.demo.student.service;

import cn.demo.student.domain.Student;
import cn.demo.student.service.dto.StudentQueryCriteria;
import org.springframework.data.domain.Pageable;

/**功能描述：学生信息业务接口*/
public interface IStudentService {
    /**
     * 获取学生列表数据
     * @param queryCriteria
     * @param pageable
     * @return
     */
    Object getList(StudentQueryCriteria queryCriteria, Pageable pageable);

    /**
     * 添加学生信息
     * @param student
     * @return
     */
    boolean addStudent(Student student);

    /**
     * 根据ID获取学生详情信息
     * @param id
     * @return
     */
    Student getById(Long id);

    /**
     * 更新学生信息
     * @param student
     */
    void editStudent(Student student);

    /**
     * 根据ID删除学生信息
     * @param id
     */
    void deleteById(Long id);

    /**
     * 统计学生人数
     * @return
     */
    long getCount();
}
