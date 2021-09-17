package tech.behring.geektime.demo.domain.models;

import java.util.List;

/**
 * 专栏
 *
 * @author Behring.Zhao
 **/
public final class Column {
    private List<Content> contents;
    private long price;

    public long getPrice() {
        return price;
    }
}
