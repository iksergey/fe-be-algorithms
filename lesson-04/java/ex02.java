import java.math.BigInteger;

public class ex02 {
    public static long powRec(long a, long b) {
        if (b == 0)
            return 1;
        else if (b % 2 == 1)
            return a * powRec(a, b - 1);
        else
            return powRec(a * a, b / 2);
    }

    public static BigInteger powWhile(BigInteger a, BigInteger b) {
        BigInteger result = new BigInteger("1");

        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                result = result.multiply(a);
            }
            a = a.multiply(a);
            b = b.divide(BigInteger.TWO);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                powWhile(new java.math.BigInteger("2"),
                        new java.math.BigInteger("10000")));
    }
}
