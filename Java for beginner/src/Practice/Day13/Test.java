package src.Practice.Day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("u1");
        User user2 = new User("u2");
        User user3 = new User("u3");

        user1.sendMessage(user2, "1");
        user1.sendMessage(user2, "2");

        user2.sendMessage(user1, "3");
        user2.sendMessage(user1, "4");
        user2.sendMessage(user1, "5");

        user3.sendMessage(user1, "101");
        user3.sendMessage(user1, "102");
        user3.sendMessage(user1, "103");

        user1.sendMessage(user3, "201");
        user1.sendMessage(user3, "202");
        user1.sendMessage(user3, "203");

        user3.sendMessage(user1, "301");

        MessageDataBase.showDialog(user1, user3);
    }
}
