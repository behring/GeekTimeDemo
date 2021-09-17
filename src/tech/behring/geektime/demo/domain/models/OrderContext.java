package tech.behring.geektime.demo.domain.models;

/**
 * 订单上下文
 *
 * @author Behring.Zhao
 **/
public interface OrderContext {
    interface Buyer {
        void placeOrder(Column column);

        void pay(Order order);
    }

    Buyer asBuyer(User user);
}
