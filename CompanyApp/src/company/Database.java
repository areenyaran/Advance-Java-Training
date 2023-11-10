package company;

public class Database implements DatabaseConnection {
    private static Database database = null;
    private final String url;
    private Boolean status;

    private Database(String url) {
        status = false;
        this.url = url;
    }

    public static Database getInstance(String url) {
        if (database == null) {
            synchronized (Database.class) {
                if (database == null) {
                    database = new Database(url);
                }
            }
        }
        return database;
    }

    @Override
    public void connect() {
        if (!status) {
            System.out.println("Connecting...");
            try {
                Thread.sleep(2000);
                this.status = true;
            } catch (Exception e) {
                System.err.println(e);
                this.status = false;
            }
            System.out.println("Connected!");
        }
    }

    String getUrl() {
        return url;
    }

    public Boolean getStatus() {
        return status;
    }
}
