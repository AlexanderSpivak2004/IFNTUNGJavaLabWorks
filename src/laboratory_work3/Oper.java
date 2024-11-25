package laboratory_work3;

public class Oper {
    public Oper () {}

    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int dif() {
        return a - b;
    }
}
