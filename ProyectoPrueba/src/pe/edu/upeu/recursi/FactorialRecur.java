package pe.edu.upeu.recursi;

import java.math.BigInteger;

public class FactorialRecur {
    
    public long factorial(int n) {
        long resultF=1;
        if (n>1) {
            for (int i=1; i<=n; i++) {
                resultF*=i;
            }
        }
        return resultF;
    }

    public BigInteger recursividad(int n) {
        BigInteger resultF=new BigInteger("1");
        if (n>1) {
            for(int i=1; i<=n; i++){
            resultF=resultF.multiply(new BigInteger(String.valueOf(i)));
        }
    }
    return resultF;
}
}