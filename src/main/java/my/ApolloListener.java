package my;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by lx-dong on 2019/6/3.
 */
@Component
public class ApolloListener {
    @Resource
    private MyConfigBean myConfigBean;
    @Resource
    private MyConfigBean2 myConfigBean2;

    @PostConstruct
    private void init() {
        System.out.println("============init myConfigBean:" + myConfigBean.toString());
    }

    @ApolloConfigChangeListener
    public void onChange(ConfigChangeEvent changeEvent) {
        System.out.println("Changes for namespace " + changeEvent.getNamespace());
        for (String key : changeEvent.changedKeys()) {
            ConfigChange change = changeEvent.getChange(key);
            System.out.println(String.format("Found change - key: %s, oldValue: %s, newValue: %s, changeType: %s", change.getPropertyName(), change.getOldValue(), change.getNewValue(), change.getChangeType()));
        }

        System.out.println("===========onChange myConfigBean:" + myConfigBean.toString());
    }


    @Scheduled(fixedDelay = 10000)
    public void monitor() {
        System.out.println("============monitor myConfigBean:" + myConfigBean.toString());
        System.out.println("============monitor myConfigBean2:" + myConfigBean2.toString());
    }

}
