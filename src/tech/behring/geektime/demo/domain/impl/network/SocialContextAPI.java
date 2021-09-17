package tech.behring.geektime.demo.domain.impl.network;

import tech.behring.geektime.demo.domain.impl.db.DataBase;
import tech.behring.geektime.demo.domain.models.Friendship;
import tech.behring.geektime.demo.domain.models.SocialContext;
import tech.behring.geektime.demo.domain.models.SubscriptionContext;
import tech.behring.geektime.demo.domain.models.User;

/**
 * 社交上下文API获取数据
 *
 * @author Behring.Zhao
 **/
public final class SocialContextAPI implements SocialContext {
    private final API api;

    public SocialContextAPI(API api) {
        this.api = api;
    }

    @Override
    public Contact asContact(User user) {
        return new ReaderImpl(user);
    }

    private final class ReaderImpl implements SocialContext.Contact {
        private final User user;

        public ReaderImpl(User user) {
            this.user = user;
        }

        @Override
        public void make(Friendship friend) {

        }

        @Override
        public void lose(Friendship friend) {

        }
    }
}
