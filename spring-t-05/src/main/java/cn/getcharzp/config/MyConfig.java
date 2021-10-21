package cn.getcharzp.config;

import cn.getcharzp.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User user() {
        User user = new User();
        user.setName("user name");
        return user;
    }
}
