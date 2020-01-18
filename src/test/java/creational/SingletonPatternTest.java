package creational;

import org.junit.Test;
import creational.singleton.DatabaseConnection;

public class SingletonPatternTest {

    /**
     * OUTPUT:
     * Creating new database connection
     * Creating database table...
     * Using already existing connection
     * Adding new record...
     */
    @Test
    public void singletonPattern() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.createTable();

        DatabaseConnection.getInstance().addRecord();
    }
}
