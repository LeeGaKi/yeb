package icu.lijiaqi.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.lijiaqi.server.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
@Repository
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id或者权限列表
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
