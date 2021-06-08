package tp3;

import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;

import java.util.ArrayList;
import java.util.List;

public class Guide7Solution implements Guide7 {

    @Override
    public int exercise_1_a(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int[][] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][A.length-1-i];
        }
        return sum;
    }

    @Override
    public int[] exercise_1_c(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_d(int[][] A, int[] b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_e(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_f(int[][] A, int[][] B) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[][] exercise_1_g(int[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_h(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int exercise_1_i(int[][] A) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public int[][] exercise_1_j(int[][] A, int c) { throw new UnsupportedOperationException("TODO"); }

    @Override
    public boolean exercise_2_a(int[][] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][j] != A[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean exercise_2_b(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (j != i){
                    sum += Math.abs(A[i][j]);
                }
            }
            if (sum >= Math.abs(A[i][i])){
                return false;
            }
        }
        return true;
    }

    @Override
    public MatrixVectorOperation exercise_3_a_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_a_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_b_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_b_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_c_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_c_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixVectorOperation exercise_3_d_i(MatrixVectorOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_ii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_d_iii(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public MatrixMatrixOperation exercise_3_e(MatrixMatrixOperation op) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<double[]> exercise_4(List<double[]> A) {
        for (int i = 1; i < A.size(); i++) {
            double[] vector = A.get(i);
            for (int j = 0; j < i; j++) {
                double escalar = (productoInterno(A.get(j), vector)) / normaAlCuadrado(A.get(j));
                double[] newVector = vectorPorEscalar(A.get(j), escalar);
                vector = restaDeVectores(vector, newVector);
            }
            A.set(i, vector);
        }
        return A;
    }

    private double productoInterno(double[] vector1, double[] vector2){
        double sum = 0;
        for (int i = 0; i < vector1.length; i++) {
            sum += vector1[i] * vector2[i];
        }
        return sum;
    }

    private double normaAlCuadrado(double[] vector1){
        double sum = 0;
        for (int i = 0; i < vector1.length; i++) {
            sum += vector1[i] * vector1[i];
        }
        return sum;
    }

    private double[] vectorPorEscalar(double[] vector, double escalar){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] * escalar;
        }
        return vector;
    }

    private double[] restaDeVectores(double[] vector1, double[] vector2){
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] -= vector2[i];
        }
        return vector1;
    }


}