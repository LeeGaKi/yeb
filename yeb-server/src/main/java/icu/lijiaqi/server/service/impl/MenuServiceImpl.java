package icu.lijiaqi.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.lijiaqi.server.mapper.MenuMapper;
import icu.lijiaqi.server.pojo.Menu;
import icu.lijiaqi.server.service.IMenuService;
import icu.lijiaqi.server.utils.AdminUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public List<Menu> getMenusByAdminId() {
        Integer adminId = AdminUtils.getCurrentAdmin().getId();
        //获取序列化好传过来的redis中的数据
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        //从redis中获取菜单数据
        List<Menu> menus = (List<Menu>) valueOperations.get("menu" + adminId);
        //如果redis中没有就从数据库中拿
        //然后缓存到redis中
        if (CollectionUtils.isEmpty(menus)){
            menus = menuMapper.getMenusByAdminId(adminId);
            //将数据放到redis中
            valueOperations.set("menu"+adminId,menus);
        }
        return menus;
    }

    /**
     * 根据角色获取菜单列表
     * @return
     */
    @Override
    public List<Menu> getMenusWithRole() {
        return menuMapper.getMenusWithRole();
    }

    /**
     * 查询所有菜单
     * @return
     */
    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

}
