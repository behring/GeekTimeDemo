package tech.behring.geektime.demo;

import tech.behring.geektime.demo.domain.impl.db.DataBase;
import tech.behring.geektime.demo.domain.impl.db.UserRepositoryDB;
import tech.behring.geektime.demo.domain.models.*;
import tech.behring.geektime.demo.domain.models.OrderContext.Buyer;
import tech.behring.geektime.demo.domain.models.SubscriptionContext.Reader;
import tech.behring.geektime.demo.domain.models.SocialContext.Contact;

public class Main {

    public static void main(String[] args) {
        UserRepository users = new UserRepositoryDB(DataBase.getInstance());
        User user = users.findUserById(1);
        Buyer buyer = users.inOrderContext().asBuyer(user);
        Reader reader = users.inSubscriptionContext().asReader(user);
        Contact contact = users.inSocialContext().asContact(user);
    }
}