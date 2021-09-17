package tech.behring.geektime.demo.domain.impl.db.dao;

import tech.behring.geektime.demo.domain.models.Subscription;
import java.util.ArrayList;
import java.util.List;

/**
 * 已订阅专栏Dao
 *
 * @author Behring.Zhao
 **/
public final class SubscriptionDao {
    public List<Subscription> querySubscriptionsByUserId(long userId) {
        return new ArrayList<Subscription>() {{
            add(new Subscription());
        }};
    }
}
