package tech.behring.geektime.demo.domain.models;

import tech.behring.geektime.demo.domain.models.roles.Cashier;
import tech.behring.geektime.demo.domain.models.roles.CustomerService;

import java.util.Optional;

/**
 * 订单
 *
 * @author Behring.Zhao
 **/
public final class Order {
    private Column column;
    private User owner;

    public Order(Column column, User owner) {
        this.column = column;
        this.owner = owner;
    }

    public Optional<Payment> pay(Cashier cashier, CustomerService staff) {
        try {
            Payment payment = cashier.collect(column.getPrice());
            staff.tell(owner, "Payment successful.");
            return Optional.of(payment);
        } catch (Exception e){
            staff.tell(owner, "Payment failed.");
            return Optional.empty();
        }
    }
}
