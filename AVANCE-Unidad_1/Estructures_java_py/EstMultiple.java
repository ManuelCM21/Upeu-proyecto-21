import java.util.Scanner;
class EstCondicional{
static Scanner teclado=new Scanner(System.in);

static void postulantecarreraEstMultiple(){
  //Definir variables y otros
  char areacarrera;
  String areacarreraN="";
  double notaEP=0, notaRM=0, notaRV=0, notaAB=0, notafinal=0;
  //Datos de entrada
  System.out.println("Ingrese el area de la carrera\nB=Biomedicas\nI=Ingenierias\nS=Sociales: ");
  areacarrera=teclado.next().charAt(0);
  System.out.println("Ingrese la nota de EP: ");
  notaEP=teclado.nextDouble();
  System.out.println("Ingrese la nota de RM: ");
  notaRM=teclado.nextDouble();
  System.out.println("Ingrese la nota de RV: ");
  notaRV=teclado.nextDouble();
  System.out.println("Ingrese la nota de AB:");
  notaAB=teclado.nextDouble();
  //Proceso
  switch(areacarrera){
    case 'B':{
      notafinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30);
      areacarreraN="Biomedicas";
     } break;
    case 'I':{
      notafinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15);
      areacarreraN="Ingenierias";
     } break;
    case 'S':{
      notafinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20);
      areacarreraN="Sociales";
     } break;
    default : System.out.println("La opcion que ingreso no existe! intente nuevamente....");break;
  }
  //Datos de salida
  System.out.println("El postulante obtuvo la nota:"+notafinal+" y es del area de: "+areacarreraN);
}

public static void main(String[] arg){
 // ejercicio01();
 postulantecarreraEstMultiple();
}
}