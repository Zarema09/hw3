//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.4, 5.3, -3.2, -7.6, 3.2, 1.3, 2.6, -8.9, 9.6, -5.8, 3.9, -7.1, 4.0, 8.1, 8.4, 8.6};
        boolean negative = false;
        double sum = 0;
        int counter = 0;
        for (double number : numbers) {
            if (negative && number > 0) {
                sum += number;
                counter++;
            }
            if (number < 0 ){
                negative = true;
            }
        }
        double average = sum / counter;
        System.out.println(average);
    }
}
