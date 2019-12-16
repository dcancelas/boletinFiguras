package boletinfiguras;

import java.util.Scanner;

public class boletinFiguras {

    public static void main(String[] args) {
        System.out.println(
                "\n-----FIGURAS-----"+
                "\n 1. Triángulo"+
                "\n 2. Pirámide"+
                "\n-----------------");
        Figuras figura = new Figuras();
        Scanner sc = new Scanner(System.in);
            System.out.print("Selecciona una opción: ");
                int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Introduce la altura del triángulo: ");
                        int atriangulo = sc.nextInt();
                    figura.triangulo(atriangulo);
                    break;
                case 2:
                    System.out.print("Introduce la altura de la pirámide: ");
                    int apiramide = sc.nextInt();
                    figura.piramide(apiramide);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            sc.close();
    }
}
