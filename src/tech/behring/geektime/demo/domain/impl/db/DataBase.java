package tech.behring.geektime.demo.domain.impl.db;

import tech.behring.geektime.demo.domain.impl.db.dao.OrderDao;
import tech.behring.geektime.demo.domain.impl.db.dao.SubscriptionDao;
import tech.behring.geektime.demo.domain.impl.db.dao.UserDao;

/**
 * 数据库操作类
 *
 * @author Behring.Zhao
 **/
public final class DataBase {
    private static final DataBase INSTANCE = new DataBase();

    private DataBase() {
    }

    public static DataBase getInstance() {
        return INSTANCE;
    }

    public UserDao getUserDao() {
        return new UserDao();
    }

    public OrderDao getOrderDao() {
        return new OrderDao();
    }

    public SubscriptionDao getSubscriptionDao() {
        return new SubscriptionDao();
    }
}
