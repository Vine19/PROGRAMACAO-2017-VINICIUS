package ex3;

public class Matrizes {

    public void imprimirMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int coluna = 0; coluna < matriz1.length; coluna++) {
                System.out.print(matriz1[coluna] + " ");
            }
            System.out.println();
        }
    }

    public int[][] multiplicaMatriz(int[][] matrizA, int[][] matrizB, int quantLinhas, int quantColunas) {
        int[][] matrizC = new int[quantLinhas][quantColunas];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        return matrizC;
    }
}
