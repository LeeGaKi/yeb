package icu.lijiaqi.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.lijiaqi.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
@Repository
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
     Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
