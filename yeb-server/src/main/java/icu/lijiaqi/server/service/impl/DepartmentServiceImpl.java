package icu.lijiaqi.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.lijiaqi.server.mapper.DepartmentMapper;
import icu.lijiaqi.server.pojo.Department;
import icu.lijiaqi.server.pojo.RespBean;
import icu.lijiaqi.server.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 获取所有部门
     *
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments(-1);
    }

    /**
     * 添加部门
     *
     * @param dep
     * @return
     */
    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
        if (1 == dep.getResult()) {
            return RespBean.success("添加成功！", dep);
        }
        return RespBean.error("添加失败!");
    }

    /**
     * 删除部门
     *
     * @param id
     * @return
     */
    @Override
    public RespBean deleteDep(Integer id) {
        Department dep = new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if (-2 == dep.getResult()) {
            return RespBean.error("该部门下还有子部门，删除失败!");
        }
        if (-1 == dep.getResult()) {
            return RespBean.error("该部门下还有员工，删除失败!");
        }
        if (1 == dep.getResult()) {
            return RespBean.success("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

}
