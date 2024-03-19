public class BmiService {
    public int calculate(int kg, double metre) {
        double result = kg / Math.pow(metre, 2);

        return (int) result;
    }
}
