
import java.math.BigInteger;
public class  KombinatorikFormel {
    public static BigInteger fakuliteat(double  n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger kombinatorik(double  n, double  k) {
        BigInteger N = fakuliteat(n);
        BigInteger K = fakuliteat(k).multiply(fakuliteat(n - k));
        return N.divide(K);

    }

    public static void main (String[]args ){
        double  n = 110;
        double  k = 3;
        BigInteger mouglichkeiten=kombinatorik(n, k);
        System.out.println("n!/ ((n-k)!* k!) = " +mouglichkeiten);
    }

}
