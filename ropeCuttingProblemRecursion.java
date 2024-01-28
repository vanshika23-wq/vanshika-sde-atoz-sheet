public class ropeCuttingProblemRecursion {

    public static int res(int n, int a, int b, int c, int[] memo) {
        if (n == 0) return 0;
        if (n < 0) return -1;

       // if (memo[n] != 0) {
       //     return memo[n];
     //   }

        int r = Math.max(Math.max(res(n - a, a, b, c, memo), res(n - b, a, b, c, memo)), res(n - c, a, b, c, memo));
        if (r == -1) {
     //       memo[n] = -1;
            return -1;
        }
     //   memo[n] = r + 1;
        r+=1;
        return r;
    }

    public static void main(String[] args) {
        int n = 5;
        int a = 3;
        int b = 1;
        int c = 5;

        int[] memo = new int[n + 1];
        int rope = res(n, a, b, c, memo);
        System.out.println(rope);
    }
}
