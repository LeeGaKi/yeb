package icu.lijiaqi.server.config.security;

import icu.lijiaqi.server.pojo.Menu;
import icu.lijiaqi.server.pojo.Role;
import icu.lijiaqi.server.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import java.util.Collection;

/**
 * @author:LeeGaki
 * @date:2022/5/4
 * 根据请求的url分析请求所需的角色
 */
@Component
public class CustomFilter implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private IMenuService iMenuService;

    /**
     *  Ant匹配规则
     */
    AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        //object就是请求的url
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        for (Menu menu : iMenuService.getMenusWithRole()) {
            //判断url与判断地址是否匹配
            if (antPathMatcher.match(menu.getUrl(),requestUrl)){
                String[] strings = menu.getRoles().stream().map(Role::getName).toArray(String[]::new);
                return SecurityConfig.createList(strings);
            }
        }
        //没有匹配的url默认登录即可访问
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
