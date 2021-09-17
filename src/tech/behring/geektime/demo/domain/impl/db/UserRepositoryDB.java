package tech.behring.geektime.demo.domain.impl.db;

import tech.behring.geektime.demo.domain.models.*;

/**
 * 用户数据库操作
 *
 * @author Behring.Zhao
 **/
public final class UserRepositoryDB implements UserRepository {
    private final DataBase dataBase;

    private SubscriptionContext subscriptionContext;
    private SocialContext socialContext;
    private OrderContext orderContext;

    public UserRepositoryDB(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public User findUserById(long id) {
        return dataBase.getUserDao().queryUserById(id);
    }

    @Override
    public SubscriptionContext inSubscriptionContext() {
        return subscriptionContext;
    }

    @Override
    public SocialContext inSocialContext() {
        return socialContext;
    }

    @Override
    public OrderContext inOrderContext() {
        return orderContext;
    }
}
