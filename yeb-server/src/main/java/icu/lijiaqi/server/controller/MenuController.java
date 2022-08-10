package icu.lijiaqi.server.controller;


import icu.lijiaqi.server.pojo.Menu;
import icu.lijiaqi.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
@RestController
@RequestMapping("/system/cfg")
public class MenuController {
    @Autowired
    private IMenuService iMenuService;
    @ApiOperation(value = "通过用户id获取菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenusByHrId(){
        return iMenuService.getMenusByAdminId();
    }
}
