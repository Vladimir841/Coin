public class Player {
    int coin = 100;
    String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean bankrot() {
        return coin == 0;
    }
}
