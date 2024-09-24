public class Samantha {
    // Static instance variable to hold the singleton instance
    private static Samantha instance;

    // Private constructor to prevent instantiation
    private Samantha() 
    {
        System.out.println("In Samantha()");
    }

    // Static method to get the singleton instance
    public static synchronized Samantha getInstance() 
    {
        if (instance == null) 
        {
            instance = new Samantha();
        }
        return instance;
    }

    // Method to demonstrate functionality
    public void remuneration() {
        System.out.println("Samantha is charging 1000000 per hour");
    }
}
