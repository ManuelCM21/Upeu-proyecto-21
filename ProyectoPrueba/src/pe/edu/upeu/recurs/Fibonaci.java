package pe.edu.upeu.recurs;

import java.math.BigInteger;

public class Fibonaci {
    
    public long fibonaci(int numFinal){
        long numAnt=0, numNue=1,numTem=0,contador=1;
        while(contador<numFinal){
          numTem=numNue;
          numNue=numAnt+numNue;
          numAnt=numTem;     
          contador++;
        }
        return numNue;
    } 

    public BigInteger fibonaciBig(int numFinal){
        BigInteger numAnt=new BigInteger("0"), numNue=new BigInteger("1"),numTem=new BigInteger("0");
        long contador=0;
        while(contador<numFinal){
          numTem=numNue;
          numNue=numAnt.add(numNue);
          numAnt=numTem;     
          contador++;
        }
        return numNue;
    }

    public long fibonaciRecur(int numero){
        if (numero>1) {
            return fibonaciRecur(numero-1)+fibonaciRecur(numero-2);
        }
        return numero;
    }

}
