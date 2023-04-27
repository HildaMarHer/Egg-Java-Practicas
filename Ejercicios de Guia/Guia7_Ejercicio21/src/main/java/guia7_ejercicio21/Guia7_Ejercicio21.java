package guia7_ejercicio21;

/**
 *
 * @author Hilda Martinez
 */
public class Guia7_Ejercicio21 {

    public static void main(String[] args) {
        // matriz M de 10x10
        int[][] m = new int[10][10];
        // matriz P de 3x3
        int[][] p = new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 1}};

        // inicializar la matriz M con valores aleatorios entre 1 y 9
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        // buscar la submatriz P en la matriz M
        boolean encontrado = false;
        for (int i = 0; i < m.length - 2; i++) {
            for (int j = 0; j < m[0].length - 2; j++) {
                boolean coincide = true;
                for (int k = 0; k < p.length; k++) {
                    for (int l = 0; l < p[0].length; l++) {
                        if (m[i + k][j + l] != p[k][l]) {
                            coincide = false;
                            break;
                        }
                    }
                    if (!coincide) {
                        break;
                    }
                }
                if (coincide) {
                    System.out.println("La matriz P está contenida en la matriz M en la fila " + (i + 1) + " y columna " + (j + 1));
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La matriz P no está contenida en la matriz M");
        }
    }

}
