package tp2;

import tp2.utils.Infraction;
import tp2.utils.Survey;

import java.util.List;

public class Guide6Solution implements Guide6 {

    @Override
    public int exercise_1_a(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    @Override
    public int exercise_1_b(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int[] a, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_d(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_e(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_g(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_h(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_i(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_1_j(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_k(int[] v, int[] w) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_2(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_3(int[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum < 0){
                return false;
            }
        }

        if (sum == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Integer> exercise_5_a(Infraction[] a) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_5_b(Infraction[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_5_c(Infraction[] infraction) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int[] exercise_6(int[] infraction) {
        int sum = 0;
        int[] s = new int[infraction.length];
        for (int i = 0; i < infraction.length; i++) {
            sum = sum + infraction[i];
            s[i] = sum;
        }
        return s;
    }

    @Override
    public double exercise_7_a(Survey[] surveys) {
        int fictionAmmount = 0;
        int womenInFiction = 0;
        for (int i = 0; i < surveys.length; i++) {
            if (surveys[i].type == 1){
                fictionAmmount++;
                if (surveys[i].sex == 2){
                    womenInFiction++;
                }
            }
        }
        return womenInFiction/((double)fictionAmmount);
    }

    @Override
    public double exercise_7_b(Survey[] surveys) {
        int ageSum = 0;
        for (int i = 0; i < surveys.length; i++) {
            ageSum += surveys[i].age;
        }
        return ageSum/(double)surveys.length;
    }

    @Override
    public int exercise_7_c(Survey[] surveys) {
        int lessThan21NoFiction = 0;
        for (int i = 0; i < surveys.length; i++) {
            if (surveys[i].age >= 21 && surveys[i].type == 2){
                lessThan21NoFiction++;
            }
        }
        return lessThan21NoFiction;
    }
}
