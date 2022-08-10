package icu.lijiaqi.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.lijiaqi.server.pojo.AdminRole;
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
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
    /**
     * 更新操作员角色
     *
     * @param adminId
     * @param rids
     * @return
     */
    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);

}
