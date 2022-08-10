package icu.lijiaqi.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.lijiaqi.server.pojo.Department;
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
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     * @param parentId
     * @return
     */
    List<Department> getAllDepartments(Integer parentId);
    /**
     * 添加部门
     *
     * @param dep
     * @return
     */
    void addDep(Department dep);

    /**
     * 删除部门
     * @param dep
     */
    void deleteDep(Department dep);
}
