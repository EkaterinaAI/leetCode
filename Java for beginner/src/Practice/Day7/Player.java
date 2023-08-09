package src.Practice.Day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        if (stamina < MIN_STAMINA || stamina > MAX_STAMINA)
            System.out.println("Выносливость должна быть от 90 до 100");
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void run() {
        if (stamina == 0)
            return ;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }
    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные, еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("Мест в командах больше нет");
        }
    }
}
