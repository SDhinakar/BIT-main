public class Main {
    public static void main(String[] args) {
        // Getting two references to the singleton instance
        Samantha sairam = Samantha.getInstance();
        Samantha samantha = Samantha.getInstance();

        // Checking if both references point to the same instance
        if (sairam == samantha) {
            System.out.println("Samantha is dedicated to sairam");
        } else {
            System.out.println("Get lost");
        }

        // Calling the remuneration method on the instance
        sairam.remuneration();
    }
}
