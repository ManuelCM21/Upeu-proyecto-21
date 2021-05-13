def estcondicional01():
  #Definir variables y otros
  print("--> EJERCICIO 01 <--")
  edad=0
  #Datos de entrada
  numerox=int(input("Ingrese el numero de años: "))
  #Proceso
  if numerox>=18:
    edad=("Es Apto para votar")
  else:
    edad=("No es apto para votar")
  #Datos de salida
  print("El ciudadano x:", edad)
estcondicional01()
print("")

def estSecuencial02():
  #Definir variables u otros
  print("--> EJERCICIO 02 <--")
  #Datos de entrada
  s1=int(input("Pago por hora: "))
  h2=int(input("Horas escedentes: "))
  #Proceso
  sueldosemanal=(s1*40+h2*s1*2)
  #Datos de salida
  print("El pago semanal es:", sueldosemanal)
estSecuencial02()
print("")

def estcondicional03():
  #Definir variables y otros
  print("--> EJERCICIO 03 <--")
  regalo=0
  #Datos de entrada
  dinerox=int(input("Ingrese el dinero que tiene: "))
  #Proceso
  if dinerox<=10:
    regalo=("Tarjeta")
  if dinerox>=11 and dinerox<=100:
    regalo=("Chocolates")
  if dinerox>=101 and dinerox<=250:
    regalo=("Flores")
  if dinerox>251:
    regalo=("Anillo")
  #Datos de salida
  print("Podra comprar:", regalo)
estcondicional03()
print("")

def estcondicional04():
  #Definir variables y otros
  print("--> EJERCICIO 04 <--")
  informe=""
  edadx=0
  #Datos de entrada
  nombre1=input("Ingrese el 1er nombre: ")
  d1=int(input("Ingrese su edad: "))
  nombre2=input("Ingrese el 2do nombre: ")
  d2=int(input("Ingrese su edad: "))
  nombre3=input("Ingrese el 3er nombre: ")
  d3=int(input("Ingrese su edad: "))
  #Proceso
  if d1<d2 and d1<d3:
    informe=nombre1
    edadx=d1
  if d2<d1 and d2<d3:
    informe=nombre2
    edadx=d2
  if d3<d1 and d3<d2:
    informe=nombre3
    edadx=d3
  #Datos de salida
  print("La persona menor es:", informe, "de", edadx, "años")
estcondicional04()
print("")

def estcondicional05():
  #Definir variables y otros
  print("--> EJERCICIO 05 <--")
  descuento=0
  #Datos de entrada
  costox=int(input("Indique el costo del aritculo: "))
  #Proceso
  if costox>=200:
    descuento=costox*15/100
  if costox>100 and costox<200:
    descuento=costox*12/100
  if costox<100:
    descuento=costox*10/100
  #Datos de salida
  print("El descuento del articulo es:", descuento)
estcondicional05()
print("")

def estcondicional06():
  #Definir variables y otros
  print("--> EJERCICIO 06 <--")
  edad=0
  beca=0
  promedio=0
  #Datos de entrada
  edad=int(input("Ingrese la edad: "))
  promedio=float(input("Ingrese el promedio: "))
  #Proceso
  if edad>18 and promedio>=9:
    beca=2000
  if edad>18 and promedio>=7.5:
    beca=1000
  if edad>18 and promedio<7.5 and promedio>=6.0:
    beca=500
  elif edad>18 and promedio<=5.9:
    beca=("Carta de motivacion al estudio")
  if edad<=18 and promedio>=9:
    beca=3000
  if edad<=18 and promedio<9 and promedio>=8:
    beca=2000
  if edad<=18 and promedio<8 and promedio>=6:
    beca=100
  elif edad<=18 and promedio<6:
    beca=("Carta de motivacion al estudio")
  #Datos de salida
  print("Recibirán:", beca)
estcondicional06()
print("")

def estcondicional07():
  #Definir variables y otros
  print("--> EJERCICIO 07 <--")
  lugar=0
  costo=0
  #Datos de entrada
  lugar=input("Ingrese el lugar: ")
  pk=int(input("Ingrese el precio por km: "))
  #Proceso
  if lugar=="Mexico":
    costo=pk*750*2
  if lugar=="P.V":
    costo=pk*800*2
  if lugar=="Acapulco":
    costo=pk*1200*2
  elif lugar=="Cancun":
    costo=pk*1800*2
  #Datos de salida
  print("El monto a pagar es:", costo)
estcondicional07()
print("")