import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     double p;
     double areaX, areaY;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com os valores do triangulo X:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entre com os valores do triangulo Y:");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        p = (x.a + x.b + x.c) / 2.0;
        areaX = Math.sqrt(p *(p-x.a) * (p-x.b) * (p-x.c));
        p = (y.a + y.b + y.c) / 2.0;
        areaY = Math.sqrt(p *(p-y.a) * (p-y.b) * (p-y.c));

        System.out.println("Area do triangulo X : " + areaX);
        System.out.println("Area do triangulo Y : " + areaY);

        if(areaX > areaY){
            System.out.println("Largura area: X " +  areaX);
        } else {
            System.out.println("Largura area: Y " + areaY);
        }
    }
}