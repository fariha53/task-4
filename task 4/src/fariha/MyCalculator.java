package fariha;
import java.math.BigInteger;
public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {

        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i == 0)
            {
                sum+=i;
            }
        }
        return sum;
    }

    @Override
    public BigInteger findFactorial(int n) {

        BigInteger factorial = BigInteger.ONE;
        for(int i=1; i<=n; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
/*
   Name: Fariha Chowdhury
   ID:2012020053
   SEC:B
   Email:cse_2012020053@lus.ac.bd
   Date:16.10.21
 */