public class CHAPTER3_Algorithms_DP {
    /*
    * In this chapter we implement the algorithms of dynamic programming which are in the book*/

    /*
    * Algorithm 3.1
    * Binomial Coefficient Using Divide-and-Conquer
    * Outputs: bin, the binomial coefficient bin(n,k) = n! / k! (n-k)!
    * */
    public static int binomial(int n , int k){
        int[][] B = new int[n+1][k+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= Math.min(i,k); j++) {
                if (j==0 || i==j)
                    B[i][j] = 1;
                else
                    B[i][j] = B[i-1][j-1] + B[i-1][j];
            }
        }
        return B[n][k];
    }

    public static void main(String[] args) {
        int res = binomial(5,3);
        System.out.println(res);
    }
}
