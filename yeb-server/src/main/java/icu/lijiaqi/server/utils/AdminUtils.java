package icu.lijiaqi.server.utils;

import icu.lijiaqi.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author:LeeGaki
 * @date:2022/5/6
 */
public class AdminUtils {

    /**
     * 获取当前登录操作员
     *
     * @return
     */
    public static Admin getCurrentAdmin() {
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
