import java.util.Scanner;
class estcondicional08{
  static Scanner teclado=new Scanner(System.in);
  static void ejercicio08(){
    //Definir variables y otros
    System.out.println("--> EJERCICIO 08 <--");
    int numerox=0;
    char calif;
    calif='A';
    calif='B';
    calif='C';
    calif='D';
    //Datos de Entrada
    System.out.println("Ingrese el numero:"); numerox=teclado.nextInt();
    //Proceso
    if(numerox==10){
      calif='A';}
    if(numerox==9){
      calif='B';}
    if(numerox==8){
      calif='C';}
    if((numerox==7) && (numerox==6)){
      calif='D';}
    else if (numerox<=5){
      calif='F';}
      //Datos de salida
      System.out.println("La calificacion es: "+calif);}
    public static void main(String[] arg){
      ejercicio08();}
  }