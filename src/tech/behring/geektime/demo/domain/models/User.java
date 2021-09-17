package tech.behring.geektime.demo.domain.models;

/**
 * 注册用户
 *
 * @author Behring.Zhao
 **/
public final class User {
    private final long id;

    public User(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
