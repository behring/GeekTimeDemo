package tech.behring.geektime.demo.infrastructure;

import tech.behring.geektime.demo.domain.models.Payment;
import tech.behring.geektime.demo.domain.models.roles.Cashier;
import tech.behring.geektime.demo.infrastructure.thirdparty.BankPaymentClient;

/**
 * 封装三方网银支付服务
 *
 * @author Behring.Zhao
 **/
public final class BankPaymentCashier extends BankPaymentClient implements Cashier {
    @Override
    public Payment collect(long price) {
        return null;
    }
}
