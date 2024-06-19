package cn.demo.student.service;

import cn.demo.student.domain.SysUser;
import cn.demo.student.service.dto.UserQueryCriteria;
import cn.demo.student.vo.ModifyPwdModel;
import org.springframework.data.domain.Pageable;

/**功能描述：系统用户业务接口*/
public interface ISysUserService {

    /**
     * 登录
     * @param sysUser
     * @return
     */
    SysUser login(SysUser sysUser);

    /**
     * 获取用户列表数据
     * @param queryCriteria
     * @param pageable
     * @return
     */
    Object getList(UserQueryCriteria queryCriteria, Pageable pageable);

    /**
     * 添加用户信息
     * @param sysUser
     * @return
     */
    boolean addUser(SysUser sysUser);

    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    SysUser getById(Long id);

    /**
     * 更新用户信息
     * @param sysUser
     * @return
     */
    void editUser(SysUser sysUser);

    /**
     * 根据ID删除用户信息
     * @param id
     */
    void deleteById(Long id);

    /**
     * 更新个人密码
     * @param modifyPwdModel
     */
    boolean updatePwd(ModifyPwdModel modifyPwdModel);
}
