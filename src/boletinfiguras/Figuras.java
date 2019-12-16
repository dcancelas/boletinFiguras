package boletinfiguras;

public class Figuras {

    public void triangulo(int altura) {
        System.out.println("");
        int ancho = 1;
        for (int i = 0; i < altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print("a");
            }
            System.out.println("");
            ancho++;
        }
    }
    public void piramide(int altura) {
        System.out.println("");
        int ancho = 1;
        int espacio = (altura - 1);
        for (int i = 0; i < altura; i++) {
            for (int k = espacio; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ancho; j++) {
                System.out.print("a");
            }
            for (int k = espacio; k > 0; k--) {
                System.out.print(" ");
            }
            System.out.println("");
            ancho = (ancho + 2);
            espacio--;
        }
    }
}
