//import pe.edu.upeu.OperacionesMat;
//import pe.edu.upeu.SubProgramas;
//import pe.edu.upeu.recurs.FactorialRecur;
import pe.edu.upeu.recursi.Fibonaci;
import pe.edu.upeu.util.Teclado;

public class App {
    
    public static void main(String[] args) throws Exception {
        Teclado tc=new Teclado();
        int num=tc.leer(0,"Ingrese un numero: ");

        /*SubProgramas objSP=new SubProgramas();
        objSP.funcionExponencial();*/

        /*OperacionesMat objOB=new OperacionesMat();
        objOB.operacionesBasicas();*/
   
        /*FactorialRecur objFR=new FactorialRecur();      
        /*System.out.println("Factorial Recursivo: "+objFR.recursividad(num));*/

        Fibonaci objF=new Fibonaci();
        long ti=System.currentTimeMillis();
        System.out.println("Fibonacci iterativo:"+objF.fibonaciBig(num));
        long tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti)/1000);
        
        /*ti=System.currentTimeMillis();
        System.out.println("Fibonacci recursivo:"+objF.fibonaciRecur(num));
        tf=System.currentTimeMillis();
        System.out.println("Tiempo ejecucion:"+(tf-ti)/1000);*/

    }
}
