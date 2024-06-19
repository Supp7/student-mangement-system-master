package cn.demo.student.service;

import cn.demo.student.domain.Teacher;
import cn.demo.student.service.dto.TeacherQueryCriteria;
import org.springframework.data.domain.Pageable;

/**功能描述：教师信息业务接口*/
public interface ITeacherService {

    /**
     * 获取教师列表数据
     * @param queryCriteria
     * @param pageable
     * @return
     */
    Object getList(TeacherQueryCriteria queryCriteria, Pageable pageable);

    /**
     * 添加教师信息
     * @param teacher
     * @return
     */
    boolean addTeacher(Teacher teacher);

    /**
     * 获取教师信息
     * @param id
     * @return
     */
    Teacher getById(Long id);

    /**
     * 更新教师信息
     * @param teacher
     */
    void editTeacher(Teacher teacher);

    /**
     * 根据ID删除教师信息
     * @param id
     */
    void deleteById(Long id);

    /**
     * 统计教师个数
     * @return
     */
    long getCount();
}
