package tp4;

import tp4.utils.MatrixContainer;

public class Guide8Solution implements Guide8{

    @Override
    public double[] exercise_5_a(double[][] A, double[] b) {
        return new double[0];
    }

    // Exercise 5
    @Override
    public double[] exercise_5_b(double[][] A, double[] b) {
        int n = b.length;

        //descending step
        double aux;
        for (int k = 0; k < n; k++) {
            pivoteoParcial(A, b, k);
            aux = A[k][k];
            for (int j = k; j < n; j++) {
                A[k][j] = A[k][j]/aux;
            }
            b[k] = b[k]/aux;
            for (int i = k+1; i < n; i++) {
                aux = A[i][k];
                for (int j = k; j < n; j++) {
                    A[i][j] = A[i][j] - aux * A[k][j];
                }
                b[i] = b[i] - aux*b[k];
            }
        }


        //ascending step
        double[] x = new double[n];
        double suma;
        x[n-1] = b[n-1];
        for (int i = n-2; i >= 0; i--) {
            suma = 0;
            for (int j = i+1; j < n; j++) {
                suma = suma + A[i][j]*x[j];
            }
            x[i] = b[i] - suma;
        }
        return x;
    }

    private void pivoteoParcial(double[][] a, double[] b, int index){

        int maxRow = index;
        for (int i = index; i < a.length; i++) {
            if (a[i][index] > a[maxRow][index]){
                maxRow = i;
            }
        }
        for (int i = index; i < b.length; i++) {
            double temp = a[index][i];
            a[index][i] = a[maxRow][i];
            a[maxRow][i] = temp;
        }
        double tempB = b[index];
        b[index] = b[maxRow];
        b[maxRow] = tempB;
    }


    // Exercise 6
    @Override
    public double[] exercise_6(double[][] A, double[] b) {
        int n = b.length;

        //descending step
        double aux;
        for (int k = 0; k < n; k++) {
            aux = A[k][k];
            for (int j = k-1; j < n; j++) {
                if (j == -1){
                    j++;
                }
                A[k][j] = A[k][j]/aux;
            }
            b[k] = b[k]/aux;
            int i = k+1;
                aux = A[i][k];
                for (int j = k; j < n; j++) {
                    A[i][j] = A[i][j] - aux * A[k][j];
                }
                b[i] = b[i] - aux*b[k];
        }


        //ascending step
        double[] x = new double[n];
        double suma;
        x[n-1] = b[n-1];
        for (int i = n-2; i >= 0; i--) {
            suma = 0;
            for (int j = i+1; j < n; j++) {
                suma = suma + A[i][j]*x[j];
            }
            x[i] = b[i] - suma;
        }
        return x;
    }

    @Override
    public double[] exercise_7(double[][] A, double[] b) {
        return new double[0];
    }

    @Override
    public double[][] exercise_9(double[][] A) {
        return new double[0][];
    }


    // Exercise 10
    @Override
    public MatrixContainer exercise_10(double[][] A) {
        throw new UnsupportedOperationException("TODO");
    }

}
