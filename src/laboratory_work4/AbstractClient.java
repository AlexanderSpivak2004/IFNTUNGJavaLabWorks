package laboratory_work4;

public abstract class AbstractClient {
    public static final String BANK_NAME = "AlexanderSpivakBank";
    private static int count = 0;
    private int id;

    public AbstractClient() {
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public static int getInstanceCount() {
        return count;
    }

    abstract public String printInfo();

    abstract public String printInfoUpperCase();
}
