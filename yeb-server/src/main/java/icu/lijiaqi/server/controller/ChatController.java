package icu.lijiaqi.server.controller;

import icu.lijiaqi.server.pojo.Admin;
import icu.lijiaqi.server.service.IAdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:LeeGaki
 * @date:2022/5/12
 */
@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "获取所有操作员")
    @GetMapping("/admin")
    public List<Admin> getAllAdmins(String keywords) {
        return adminService.getAllAdmins(keywords);
    }
}