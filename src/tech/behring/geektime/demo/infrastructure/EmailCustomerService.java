package tech.behring.geektime.demo.infrastructure;

import tech.behring.geektime.demo.domain.models.User;
import tech.behring.geektime.demo.domain.models.roles.CustomerService;
import tech.behring.geektime.demo.infrastructure.thirdparty.EmailNotificationClient;

/**
 * 封装三方邮件通知服务
 *
 * @author Behring.Zhao
 **/
public final class EmailCustomerService extends EmailNotificationClient implements CustomerService {
    @Override
    public void tell(User user, String text) {

    }
}
