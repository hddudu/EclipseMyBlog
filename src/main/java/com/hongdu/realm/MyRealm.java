package com.hongdu.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.hongdu.entity.Blogger;
import com.hongdu.service.BloggerService;

/**
 * 自定义Realm
 * @author dudu
 *
 */
public class MyRealm extends AuthorizingRealm{

    @Resource//注入实例
    private BloggerService bloggerService;
    
    /**
     * 为当前的登陆的用户授予角色和权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 验证当前登陆用户
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        //获取用户名
        String userName = (String) token.getPrincipal();
        Blogger blogger = bloggerService.getByUserName(userName);
        if(blogger != null) {
            SecurityUtils.getSubject().getSession().setAttribute("currentUser", blogger);
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(blogger.getUserName(), blogger.getPassword(), "XXX");
            return authcInfo;
        } else {
            return null;
        }
    }

    
}
