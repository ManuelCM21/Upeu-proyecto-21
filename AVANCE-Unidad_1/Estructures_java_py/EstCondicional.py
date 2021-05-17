def estCondicional01():
  #Definir variables u otros
  montoP=0
  #Datos de entrada
  cantidadx=int(input("Ingrese cantidad de lapices: "))
  #Proceso
  if cantidadx>=1000:
    montoP=cantidadx*0.80
  else:
    montoP=cantidadx*0.90
  #Datos de salida
  print("El monto a pagar es:", montoP)
estCondicional01()