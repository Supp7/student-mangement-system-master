package cn.demo.student.repository;

import cn.demo.student.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**系统用户信息持久层*/
public interface SysUserRepository extends JpaRepository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {
    /**
     * 根据登录名查找用户信息
     * @param username
     * @return
     */
    SysUser findByusername(String username);
}
