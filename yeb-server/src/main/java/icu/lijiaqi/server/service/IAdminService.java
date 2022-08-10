package icu.lijiaqi.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.lijiaqi.server.pojo.Admin;
import icu.lijiaqi.server.pojo.RespBean;
import icu.lijiaqi.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 根据用户id或者权限列表
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 登录方法
     * @param username
     * @param password
     * @param request
     * @param code
     * @return
     */
    RespBean login(String username, String password, String code,HttpServletRequest request);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);

    /**
     * 获取所有操作员
     *
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(String keywords);
    /**
     * 更新操作员角色
     *
     * @param adminId
     * @param rids
     * @return
     */
    RespBean updateAdminRole(Integer adminId, Integer[] rids);

    /**
     * 更新用户密码
     *
     * @param oldPass
     * @param pass
     * @param adminId
     * @return
     */
    RespBean updateAdminPassword(String oldPass, String pass, Integer adminId);
}
