package tech.behring.geektime.demo.domain.impl.db;

import tech.behring.geektime.demo.domain.models.Content;
import tech.behring.geektime.demo.domain.models.Subscription;
import tech.behring.geektime.demo.domain.models.SubscriptionContext;
import tech.behring.geektime.demo.domain.models.User;

import java.util.List;

/**
 * 订阅上下文DB获取数据
 *
 * @author Behring.Zhao
 **/
public final class SubscriptionContextDB implements SubscriptionContext {
    private final DataBase dataBase;

    public SubscriptionContextDB(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Reader asReader(User user) {
        return new ReaderImpl(user);
    }

    private final class ReaderImpl implements Reader {
        private final User user;
        private final List<Subscription> subscriptions;

        public ReaderImpl(User user) {
            this.user = user;
            subscriptions = dataBase.getSubscriptionDao().querySubscriptionsByUserId(user.getId());
        }

        @Override
        public List<Subscription> getSubscriptions() {
            return subscriptions;
        }

        @Override
        public boolean canView(Content content) {
            return false;
        }

        @Override
        public void transfer(Subscription subscription, User friend) {

        }
    }
}
