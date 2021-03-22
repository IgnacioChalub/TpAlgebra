package Tp1;

public class Guide1RecursiveSolution implements Guide1{

    @Override
    public int exercise_1_f(int n) {
        if(n==0){
            return 0;
        }
        return n*n*n + exercise_1_f(--n);
    }

    @Override
    public int exercise_2_a(int n){
        if(n==0){
            return 1;
        }
        return n*exercise_2_a(--n);
    }

    @Override
    public int exercise_3(int n) {
        int zeros = 0;
        String numberString = (String) Integer.toString(n);
        int index = 0;
        return excersie_3(numberString, zeros, index);
    }

    private int excersie_3(String numberString, int zeros, int index){
        if(index==numberString.length()){
            return zeros;
        }
        if(numberString.charAt(index)=='0') {
            zeros++;
        }
        index++;
        return excersie_3(numberString,zeros,index);
    }

    @Override
    public boolean exercise_6_b_i(int n) {
        if(n == 2){
            return true;
        }else if(n%2 == 0){
            return false;
        }
        int index = 3;
        return exercise_6_b_i(n, index);
    }

    private boolean exercise_6_b_i(int n, int index) {
        if(index == n){
            return true;
        }
        if(n%index == 0){
            return false;
        }
        index++;
        return exercise_6_b_i(n,index);
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        int index = coefs.length-1;
        int counter = coefs[index];
        return exercise_8(coefs, n, --index, counter);
    }

    private int exercise_8(int[] coefs, int n, int index, int counter) {
        if(index == -1){
            return counter;
        }
        counter = counter*n + coefs[index];
        index--;
        return exercise_8(coefs, n, index, counter);
    }


}
