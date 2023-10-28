public class DBExecutor {
    private final DatabaseConnection database;

    public DBExecutor(DatabaseConnection database) {
        this.database = database;
    }

    public Object executeQuery(String query) {
            if (!database.getStatus()) {
                database.connect();
            }
            System.out.println("Executing query: " + query);
            return "The result";
        }
}
