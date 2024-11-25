package laboratory_work10;

public class Cube {
    private static int count = 0;
    private int id;
    private int sideLength;
    private String color;

    Cube() {
        count++;
        this.id = count;
    }

    Cube(int sideLength, String color) {
        this();
        setSideLength(sideLength);
        setColor(color);
    }

    public int getId() {
        return id;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "id=" + id +
                ", sideLength=" + sideLength +
                ", color='" + color + '\'' +
                '}';
    }
}
