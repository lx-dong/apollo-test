package my;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lx-dong on 2019/6/3.
 */
@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Bean
    public MyConfigBean myConfigBean() {
        return new MyConfigBean();
    }

    @Bean
    public MyConfigBean2 myConfigBean2() {
        return new MyConfigBean2();
    }
}
