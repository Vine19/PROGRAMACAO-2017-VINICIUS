package ex3;

public class Ex3 {

    public static void main(String[] args) {

        int[][] matrizA = new int[2][2];
        matrizA[0][0] = 4;
        matrizA[1][0] = 3;
        matrizA[0][1] = 2;
        matrizA[1][1] = 1;

        int[][] matrizB = new int[2][2];
        matrizB[0][0] = 8;
        matrizB[1][0] = 6;
        matrizB[0][1] = 4;
        matrizB[1][1] = 2;

        Matrizes matrizes = new Matrizes();
        System.out.println("Matriz A");
        matrizes.imprimirMatriz(matrizA);

        System.out.println("Matriz B");
        matrizes.imprimirMatriz(matrizB);

        int[][] matrizResultante = new int[2][2];
        matrizResultante = matrizes.multiplicaMatriz(matrizA, matrizB, 2, 2);

        System.out.println("Resultado das multiplicações de matriz: ");
        matrizes.imprimirMatriz(matrizResultante);
    }
}
