package tech.behring.geektime.demo.domain.models;

/**
 * 社交上下文
 *
 * @author Behring.Zhao
 **/
public interface SocialContext {
    interface Contact {
        void make(Friendship friend);

        void lose(Friendship friend);
    }

    Contact asContact(User user);
}
