class Coin {
    public static void main(String[] args) {
        Player one = new Player("Teodor");
        Player two = new Player("Alex");

        int count = 0;

        while (true) {
            if (coin()) {
                one.balance++;
                two.balance--;
            } else {
                one.balance--;
                two.balance++;
            }
        
            if (one.balance == 0 || two.balance == 0) {
                break;
            }

            count++;
        }

        if (one.balance == 0) {
            System.out.println("The coin was flipped: " + count);
            System.out.println("Win " + two.name);
       } else {
            System.out.println("The coin was flipped: " + count);
            System.out.println("Win " + one.name);
       }

}
    public static boolean coin() {
        if (Math.random() > 0.5) {
            return true;
        } else {
            return false;
        }
    }
}

