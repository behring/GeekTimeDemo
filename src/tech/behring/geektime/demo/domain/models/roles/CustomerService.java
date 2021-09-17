package tech.behring.geektime.demo.domain.models.roles;

import tech.behring.geektime.demo.domain.models.User;

/**
 * 角色化三方通知系统(如: 邮件通知)
 *
 * @author Behring.Zhao
 **/
public interface CustomerService {
    void tell(User user, String text);
}
