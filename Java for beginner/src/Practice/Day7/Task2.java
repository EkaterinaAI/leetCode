package src.Practice.Day7;


public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(91);
        Player player2 = new Player(93);
        Player player3 = new Player(94);
        Player player4 = new Player(95);
        Player player5 = new Player(96);
        Player player6 = new Player(97);

        System.out.println(player1.getStamina());
        for (int i = player1.getStamina(); i > 0; i--) {
            player1.run();
        }
        System.out.println(player1.getStamina());

        Player.info();

        Player player7 = new Player(97);

        Player.info();
    }
}
