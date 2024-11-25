package laboratory_work3;

public class Probal {
    public static void main(String[] args) {
        /*Розглянемо програму:
        Це незакінчена програма. Розгляньте її порядково, скажіть, що означає
        кожний оператор.В програмі є клас, що не реалізований. Реалізуйте його*/

        Oper op = new Oper();

        op.setA(6);
        op.setB(7);

        System.out.println("Sum = " + op.sum());
        System.out.println("Difference = " + op.dif());
    }
}
