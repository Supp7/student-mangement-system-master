package cn.demo.student.domain;

import cn.demo.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

/**功能描述：课程信息实体类*/
@Data
@Entity
@Table(name = "s_course")
@org.hibernate.annotations.Table(appliesTo = "s_course",comment="课程信息表")
public class Course extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 课程编号
     */
    @Column(name = "course_no")
    private String courseno;

    /**
     * 课程名称
     */
    @Column(name = "course_name")
    private String coursename;

}
