//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 72;
        double metre = 1.69;
        int index = service.calculate(kg, metre);

        System.out.println("Индекс массы тела: " + index);

    }
}
