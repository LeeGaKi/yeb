package icu.lijiaqi.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.lijiaqi.server.mapper.MenuRoleMapper;
import icu.lijiaqi.server.pojo.MenuRole;
import icu.lijiaqi.server.pojo.RespBean;
import icu.lijiaqi.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {
    @Autowired
    private MenuRoleMapper menuRoleMapper;
    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        // 1. 删除该角色的所有菜单
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid", rid));

        // 如果传过来的 mids 为空，即真的要删除所有
        if (null == mids || 0 == mids.length) {
            return RespBean.success("更新成功！");
        }

        // 2. 如果 mids 不为空，则批量插入
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        if (result == mids.length) {
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败!");
    }
}
