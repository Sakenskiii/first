import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("*Система определения ммоль/ или мг/дл*");
        System.out.println("Введите свой ммоль:");
        double mmol = new Scanner(System.in).nextDouble();
        System.out.println("");
        System.out.println("*Ваш мг/дл:" +  (mmol/ 0.0555));
        System.out.println("");
        System.out.println("Введите ваш мг/дл:");
        double mgdl = new Scanner(System.in).nextDouble();
        System.out.println("");
        System.out.println("*Ваш ммоль/л:" + mgdl/ 18.018);
    }
}
