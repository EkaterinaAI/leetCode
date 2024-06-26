package src.Practice.Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubsribed(User user) {
        for(User currentUser : subscriptions) {
            if (currentUser.getUserName().equals(user.getUserName()))
                return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubsribed(user) && user.isSubsribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDataBase.addNewMessage(this, user, text);
    }

    public String toString(){
        return userName;
    }
}
