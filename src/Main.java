import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите курс рубля:");
        double rubCourse = scanner.nextDouble();
        System.out.println("Количество входных рублей:");
        double rubCount = scanner.nextDouble();
        System.out.println("Вы можете купить "+ convert(rubCourse,rubCount)+" yen.");
    }
    static double convert(double rubCourse, double count){
        return count/rubCourse;
    }
}