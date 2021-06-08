package tp3Test;

import org.junit.Test;
import tp3.Guide7;
import tp3.Guide7Solution;
import tp3.utils.Matrix;
import tp3.utils.MatrixMatrixOperation;
import tp3.utils.MatrixVectorOperation;
import tp3.utils.Vector;
import tp3Test.utils.Guide6Helpers;
import tp3Test.utils.SkipRule;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Guide7Test extends SkipRule {
    Guide7 guide7 = new Guide7Solution();

    @Test
    public void exercise_1_b() {
        assertEquals(7, guide7.exercise_1_b(new int[][]{{2, 3}, {4, 5}}));
        assertEquals(1, guide7.exercise_1_b(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertEquals(34, guide7.exercise_1_b(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
    }

    @Test
    public void exercise_2_a() {
        assertTrue(guide7.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide7.exercise_2_a(new int[][]{{1, 0, 1}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide7.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 0, 1}}));
    }

    @Test
    public void exercise_2_b() {
        assertTrue(guide7.exercise_2_b(new int[][]{{4, -2, 1}, {1, -4, 2}, {-1, 2, 4}}));
        assertFalse(guide7.exercise_2_b(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}));
        assertFalse(guide7.exercise_2_b(new int[][]{{4, -2, 1}, {1, -4, 2}, {-1, 2, 3}}));
    }

    @Test
    public void exercise_3_a_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 2, 3}, {9, 5, 6}, {9, 9, 9}}), new Matrix(new int[][]{{1, 2, 3}, {9, 5, 6}, {9, 9, 9}}));
        assertEquals(new Matrix(new int[][]{{2, 4, 6}, {0, 10, 12}, {0, 0, 18}}), guide7.exercise_3_a_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 12);
        assertTrue(op1.getCounter() > 0);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new Matrix(new int[][]{{1, 1, 1, 1}, {9, 1, 1, 1}, {9, 9, 1, 1}, {9, 9, 9, 1}}), new Matrix(new int[][]{{2, 2, 2, 2}, {9, 2, 2, 2}, {9, 9, 2, 2}, {9, 9, 9, 2}}));
        assertEquals(new Matrix(new int[][]{{3, 3, 3, 3}, {0, 3, 3, 3}, {0, 0, 3, 3,}, {0, 0, 0, 3}}), guide7.exercise_3_a_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 20);
        assertTrue(op2.getCounter() > 0);
    }

    @Test
    public void exercise_4() {
        ArrayList<double[]> vectors1 = new ArrayList<>(Arrays.asList(new double[]{2, 2, 0}, new double[]{1, 1, 1}));
        List<double[]> result1 = guide7.exercise_4(vectors1);
        orthogonal_test(result1);

        ArrayList<double[]> vectors2 = new ArrayList<>(Arrays.asList(new double[]{0, 0, 1, 1}, new double[]{0, 1, 1, 0}, new double[]{1, 1, 0, 0}));
        List<double[]> result2 = guide7.exercise_4(vectors2);
        orthogonal_test(result2);

        ArrayList<double[]> vectors3 = new ArrayList<>(Arrays.asList(new double[]{1, 3}, new double[]{-1, 2}));
        List<double[]> result3 = guide7.exercise_4(vectors3);
        orthogonal_test(result3);
    }

    private void orthogonal_test(List<double[]> result) {
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                double actual = Guide6Helpers.dotProduct(result.get(i), result.get(j));
                assertEquals(0.0, actual, 0.1);
            }
        }
    }

}