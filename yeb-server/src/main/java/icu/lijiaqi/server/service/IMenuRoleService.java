package icu.lijiaqi.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.lijiaqi.server.pojo.MenuRole;
import icu.lijiaqi.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
