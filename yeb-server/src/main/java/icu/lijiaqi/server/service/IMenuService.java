package icu.lijiaqi.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.lijiaqi.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
public interface IMenuService extends IService<Menu> {
    /**
     * 通过用户id获取菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();

    /**
     * 根据角色获取菜单列表
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
