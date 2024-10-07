import entities.Triangle;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
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

        //Chamando o metodo de calculo
         areaX = x.area();
         areaY = y.area();


        System.out.println("Area do triangulo X: " + areaX);
        System.out.println("Area do triangulo Y: " + areaY);

        if(areaX > areaY){
            System.out.println("Largura area: X " +  areaX);
        } else {
            System.out.println("Largura area: Y " + areaY);
        }
    }
}