public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        float growth = 1.65f;
        float theWeight = 57;
        float bmiRelust = index.calculate(growth, theWeight);
        System.out.println("Индекс массы тела составляет: " + bmiRelust);
    }
}