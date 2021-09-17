package tech.behring.geektime.demo.domain.impl.db.dao;

import tech.behring.geektime.demo.domain.models.User;

/**
 * 用户表Dao
 *
 * @author Behring.Zhao
 **/
public final class UserDao {
    public User queryUserById(long id) {
        return new User(id);
    }
}
