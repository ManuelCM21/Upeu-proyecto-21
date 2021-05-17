def estcondicional10():
  #Definir variables y otros
  print("--> EJERCICIO 10 <--")
  paquete=0
  #Datos de entrada
  dinerox=int(input("Ingrese el dinero que recibirá: "))
  #Proceso
  if dinerox>=50000:
    paquete=("una television, un modular, 3 pares de zapato, 5 camisas y 5 pantalones")
  if dinerox<50000 and dinerox>=20000:
    paquete=("una grabadora, 3 pares de zapato, 5 camisas y 5 pantalones")
  if dinerox<20000 and dinerox>=10000:
    paquete=("2 pares de zapato, 3 camisas y 3 pantalones")
  elif dinerox<10000:
    paquete=("un par de zapatos, 2 camisas y 2 pantalones")
  #Datos de salida
  print("Podra comprar:", paquete)
estcondicional10()