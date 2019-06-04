package pruebaestructural;

import java.util.List;
import java.util.ListIterator;

/**
<<<<<<< HEAD
 *intentando hacer git
=======
 *segunda modificacion
>>>>>>> rama1
 * @author Ivan
 */
public class CaminoBasico {

    /**
     * Conjunto de métodos de cálculo de la media de números
     */
    public CaminoBasico() {

    }

    public int numeroMayor(int a, int b, int c) {
        /*I*/ if (a > b /*1*/ && a > c /*2*/) {
            /*3*/ return a;
        } else if (c > b) /*4*/ {
            /*5*/ return c;
        } else {
            /*6*/ return b;
        }/*7*/
    }/*F*/

    /**
     * Calcula la media entera de dos números enteros. Si los números son
     * negativos devuelve 0
     *
     * @param x número entero
     * @param y número entero
     * @return número entero valor de la media redondeada
     */
    public int calculoMedia1(int x, int y) {
        /*I*/ int media = 0;
        if (x >= 0 /*1*/ && y >= 0 /*2*/) {
            /*3*/ media = Math.round((x + y) / 2);
        }/*4*/
 /*5*/ return media;
    }/*F*/

    /**
     * Calcula la media entera de dos números enteros. Si los dos números son
     * negativos lanza una excepción. Si algún número es negativo devuelve -1.
     *
     * @param x número entero
     * @param y número entero
     * @return número entero valor de la media redondeada
     * @throws IllegalArgumentException
     */
    public int calculoMedia2(int x, int y) throws IllegalArgumentException {
        /*I*/ int media = 0;
        if (x < 0 /*1*/ && y < 0 /*2*/) {
            /*3*/ throw new IllegalArgumentException();
        } else {
            if (y < 0 /*4*/ || x < 0 /*5*/) {
                /*6*/ media = -1;
            } else {
                /*7*/ media = Math.round((x + y) / 2);
            }/*8*/
        }/*9*/
 /*10*/ return media;
    }/*F*/

    /**
     * Calcula la media de una lista de números enteros con valores comprendidos
     * en un rango dado. Los números que estén fuera del rango no se consideran
     * para la media
     *
     * @param valores Lista de valores
     * @param min valor mínimo del rango
     * @param max valor máximo del rango
     * @return Valor de la media
     */
    public float calculoMedia3(List valores, int min, int max) {
        /*I*/ int suma = 0;
        int validos = 0;
        float media = 0;
        ListIterator li = valores.listIterator();
        while (li.hasNext()) /*1*/ {
            int num = (int) li.next();
            if (num >= min /*2*/ && num <= max /*3*/) {
                /*4*/ suma = suma + num;
                validos = validos + 1;
            }/*5*/
        }/*6*/
        if (validos > 0) /*7*/ {
            /*8*/ media = suma / validos;
        }/*9*/
 /*10*/ return media;
    }/*F*/
}
