package tech.behring.geektime.demo.domain.models;

import java.util.List;

/**
 * 订阅上下文
 *
 * @author Behring.Zhao
 **/
public interface SubscriptionContext {
    interface Reader {
        List<Subscription> getSubscriptions();
        boolean canView(Content content);

        void transfer(Subscription subscription, User friend);
    }

    Reader asReader(User user);
}
