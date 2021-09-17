package tech.behring.geektime.demo.application;

import tech.behring.geektime.demo.domain.models.User;
import tech.behring.geektime.demo.domain.models.roles.CustomerService;

/**
 * 用来客户服务通知后的工作流程(例如：支付失败的原因回访)
 *
 * @author Behring.Zhao
 **/
public final class FollowUpWorkflow implements CustomerService {
    @Override
    public void tell(User user, String text) {

    }
}
