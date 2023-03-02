public class BmiService {
    public int calculate(double meter, double kilogram) {
        int bmi = (int) (kilogram / (meter * meter));
        return bmi;
    }
}
