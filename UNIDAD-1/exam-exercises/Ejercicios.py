def ejercicio01MCM():
  #Definir variables y otros
  print("--> EJERCICIO 01 <--")
  notaFinal=round(0.0)
  #Datos de entrada
  n1=float(input("Ingrese la 1ra nota: "))
  n2=float(input("Ingrese la 2da nota: "))
  n3=float(input("Ingrese la 2da nota: "))
  n4=float(input("Ingrese la 4ta nota: "))
  #Proceso
  notaFinal=(n1*0.2+n2*0.15+n3*0.15+n4*0.5)
  #Datos de salida
  print("La nota final del curso es:",notaFinal)
ejercicio01MCM()
print("")

def ejercicio02MCM():
  #Definir variables y otros
  print("--> EJERCICIO 02 <--")
  puntos=0
  salariomin=0
  bono=0
  #Datos de entrada
  puntos=int(input("Ingrese los puntos: "))
  salariomin=int(input("Ingrese el salario minimo: "))
  #Proceso
  if puntos>=50 and puntos<=100:
    bono=(salariomin*0.10)
  else:
    bono=("Nada, sera para la proxima")
  if puntos>=101 and puntos<=150:
    bono=(salariomin*0.40)
  elif puntos>=151:
    bono=(salariomin*0.70)
  #Datos de salida
  print("El bono que recibira es:",bono)
ejercicio02MCM()
print("")

def ejercicio03MCM():
  #Definir variables y otros
  print("--> EJERCICIO 03 <--")
  edad=0
  sexo=0
  vacuna=""
  #Datos de entrada
  edad=int(input("Ingrese la edad: "))
  sexo=input("Ingrese sexo: ")
  #Proceso
  if sexo=="mujer" or sexo=="hombre" and edad>70:
    vacuna=("Tipo C")
  if sexo=="mujer" and edad>=16 and edad<=69:
    vacuna=("Tipo B")
  elif sexo=="hombre" and edad>=16 and edad<=69:
    vacuna=("Tipo A")
  if sexo=="mujer" or sexo=="hombre" and edad<16:
    vacuna=("Tipo A")
  #Datos de salida
  print("Recibira la vacuna :", vacuna)
ejercicio03MCM()
print("")

def ejercicio04MCM():
  #Definir variables y otros
  print("--> EJERCICIO 04 <--")
  operador=0
  resultado=0
  #Datos de entrada
  operador=input("Ingrese el operador aritmetico: ")
  n1=int(input("Ingrese el 1er numero: "))
  n2=int(input("Ingrese el 2do numero: "))
  #Proceso
  if operador=="suma" or operador=="+":
    resultado=n1+n2
  if operador=="resta" or operador=="-":
    resultado=n1-n2
  elif operador=="division" or operador=="/":
    resultado=n1/n2
  if operador=="multiplicacion" or operador=="*":
    resultado=n1*n2
  elif operador=="potencia" or operador=="^":
    resultado=n1**n2
  #Datos de salida
  print("Los resultados son:", resultado)
ejercicio04MCM()
print("")
