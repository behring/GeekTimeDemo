package tech.behring.geektime.demo.domain.models;

/**
 * 注册用户
 *
 * @author Behring.Zhao
 **/
public interface UserRepository {
    User findUserById(long id);

    SubscriptionContext inSubscriptionContext();

    SocialContext inSocialContext();

    OrderContext inOrderContext();
}
