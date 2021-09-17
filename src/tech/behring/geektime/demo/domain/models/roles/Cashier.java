package tech.behring.geektime.demo.domain.models.roles;

import tech.behring.geektime.demo.domain.models.Payment;


/**
 * 角色化三方支付系统(如: 网银系统)
 *
 * @author Behring.Zhao
 **/
public interface Cashier {
    Payment collect(long price);
}
