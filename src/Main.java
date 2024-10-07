import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     double xA, xB, xC, yA, yB,yC;
     double p;
     double areaX, areaY ;
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os valores do triangulo X:");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Entre com os valores do triangulo Y:");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        p = (xA + xB + xC) / 2.0;
        areaX = Math.sqrt(p *(p-xA) * (p-xB) * (p-xC));

        p = (yA + yB + yC) / 2.0;
        areaY = Math.sqrt(p *(p-yA) * (p-yB) * (p-yC));

        System.out.println("Area do triangulo X : %.4f%n" + areaX);
        System.out.println("Area do triangulo Y : %.4f%n" + areaY);

        if(areaX > areaY){
            System.out.println("Largura area: X " +  areaX);
        } else {
            System.out.println("Largura area: Y " + areaY);
        }
    }
}