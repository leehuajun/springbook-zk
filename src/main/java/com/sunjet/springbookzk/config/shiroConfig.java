//package com.sunjet.springbookzk.config;
//
//import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
//import org.apache.shiro.crypto.hash.Sha256Hash;
//import org.apache.shiro.mgt.SessionsSecurityManager;
//import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
//import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class shiroConfig {
//
//	// 配置自定义Realm
//    @Bean
//    public UserRealm userRealm() {
//        UserRealm userRealm = new UserRealm();
//        userRealm.setCredentialsMatcher(credentialsMatcher()); //配置使用哈希密码匹配
//        return userRealm;
//    }
//
//	// 配置url过滤器
//    @Bean
//    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
//        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//
//        chainDefinition.addPathDefinition("/captcha", "anon");
//        chainDefinition.addPathDefinition("/logout","anon");
//        chainDefinition.addPathDefinition("/layuiadmin/**", "anon");
//        chainDefinition.addPathDefinition("/druid/**", "anon");
//        chainDefinition.addPathDefinition("/api/**", "anon");
//        // all other paths require a logged in user
//        chainDefinition.addPathDefinition("/login","anon");
//        chainDefinition.addPathDefinition("/**", "authc");
//        return chainDefinition;
//    }
//
//    // 设置用于匹配密码的CredentialsMatcher
//    @Bean
//    public HashedCredentialsMatcher credentialsMatcher() {
//        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
//        credentialsMatcher.setHashAlgorithmName(Sha256Hash.ALGORITHM_NAME);  // 散列算法，这里使用更安全的sha256算法
//        credentialsMatcher.setStoredCredentialsHexEncoded(false);  // 数据库存储的密码字段使用HEX还是BASE64方式加密
//        credentialsMatcher.setHashIterations(1024);  // 散列迭代次数
//        return credentialsMatcher;
//    }
//
//	// 配置security并设置userReaml，避免xxxx required a bean named 'authorizer' that could not be found.的报错
//    @Bean
//    public SessionsSecurityManager securityManager() {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(userRealm());
//        return securityManager;
//    }
//   }
//————————————————
//版权声明：本文为CSDN博主「乾乾君子」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/sirchenhua/java/article/details/100200498