package tech.behring.geektime.demo.domain.impl.db;

import tech.behring.geektime.demo.domain.models.*;

import java.util.List;
import java.util.Optional;

/**
 * 订单上下文DB获取数据
 *
 * @author Behring.Zhao
 **/
public final class OrderContextDB implements OrderContext {
    private final DataBase dataBase;

    public OrderContextDB(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Buyer asBuyer(User user) {
        return new BuyerImpl(user);
    }

    private final class BuyerImpl implements Buyer {
        private final User user;
        private List<Order> orders;
        private List<Payment> payments;

        public BuyerImpl(User user) {
            this.user = user;
        }

        public List<Order> getOrders() {
            return orders;
        }

        public List<Payment> getPayments() {
            return payments;
        }

        @Override
        public void placeOrder(Column column) {
            Optional<Order> orderOpt = createOrder(new Order(column, user));
            orderOpt.ifPresent(order -> orders.add(order));
        }

        @Override
        public void pay(Order order) {
            if(getOrders().contains(order)) {
                Optional<Payment> paymentOpt = order.pay(null, null);
                paymentOpt.ifPresent(payment -> payments.add(payment));
            }
        }

        private Optional<Order> createOrder(Order order) {
            return dataBase.getOrderDao().insert(order) > 0 ? Optional.of(order) : Optional.empty();
        }
    }
}
