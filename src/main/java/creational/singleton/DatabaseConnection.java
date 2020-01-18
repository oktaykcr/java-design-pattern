package creational.singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            System.out.println("Creating new database connection");
            return instance = new DatabaseConnection();
        }
        System.out.println("Using already existing connection");
        return instance;
    }

    public void createTable() {
        System.out.println("Creating database table...");
    }

    public void addRecord() {
        System.out.println("Adding new record...");
    }
}
