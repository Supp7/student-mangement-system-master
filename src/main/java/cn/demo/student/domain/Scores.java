package cn.demo.student.domain;

import cn.demo.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

/**功能描述：学生成绩实体类*/
@Data
@Entity
@Table(name = "s_student_score")
@org.hibernate.annotations.Table(appliesTo = "s_student_score",comment="学生成绩表")
public class Scores extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 所属班级
     */
    @OneToOne
    @JoinColumn(name = "gradeclass_id",referencedColumnName="id")
    private GradeClass gradeClass;

    /**
     * 学生对象
     */
    @OneToOne(targetEntity = Student.class)
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;

    /**
     * 课程对象
     */
    @OneToOne(targetEntity = Course.class)
    @JoinColumn(name = "course_id",referencedColumnName = "id")
    private Course course;

    /**
     * 学生成绩
     */
    @Column(name = "score")
    private float score;

    /**
     * 是否批改：未批改、已批改
     */
    @Column(name = "type")
    public String type;


}
