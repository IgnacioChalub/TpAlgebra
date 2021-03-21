public class Guide1IterativeSolution implements Guide1{

    public int exercise_1_f(int n) {
        int totalSum = 0;
        for (int i = 0; i <= n; i++) {
            totalSum = totalSum + i*i*i;
        }
        return totalSum;
    }

    @Override
    public int exercise_2_a(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }

    @Override
    public int exercise_3(int n) {
        int zeros = 0;
        String numberString = (String) Integer.toString(n);
        for (int i = 0; i < numberString.length(); i++) {
            if(numberString.charAt(i) == '0'){
                zeros++;
            }
        }
        return zeros;
    }

    @Override
    public boolean exercise_6_b_i(int n) {
        if(n == 2){
            return true;
        }else if(n%2 == 0){
            return false;
        }
        //el unico numero primo par es el 2
        for (int i = 3; i < n; i+=2) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        int counter = coefs[coefs.length-1];
        for (int i = coefs.length-2; i >= 0; i--) {
           counter = counter*n + coefs[i];
        }
        return counter;
    }


}
