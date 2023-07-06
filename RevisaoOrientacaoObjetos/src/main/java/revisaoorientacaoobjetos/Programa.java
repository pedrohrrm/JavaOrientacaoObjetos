
package revisaoorientacaoobjetos;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo x, y;
        
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Entre com os valores das faces do triangulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Entre com os valores das faces do triangulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        
        double areaY = y.area();
        
        System.out.println("Área do triangulo X:" + areaX);
        System.out.println("Área do triangulo Y:" + areaY);
        
        if(areaX > areaY){
            System.out.println("Maior área é do triangulo X");
        }else{
            System.out.println("Maior área é do triangulo Y");
        }
        scanner.close();
    }

}
