public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double bmi = service.calculate(90, 1.84);

        System.out.println("Индекс массы тела:" + bmi);
    }
}