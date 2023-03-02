public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.87, 98));

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.75, 74));

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.75, 62.3));

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.67, 47.7));

        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.65, 80));
    }
}