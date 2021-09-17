package tech.behring.geektime.demo.domain.impl.network;

import tech.behring.geektime.demo.domain.impl.db.DataBase;

/**
 * 访问网络接口获取数据
 *
 * @author Behring.Zhao
 **/
public final class API {
    private static final API INSTANCE = new API();

    private API() {
    }

    public static API getInstance() {
        return INSTANCE;
    }
}
