edad = input("Cuantos años tienes ")
estudiante = input("Eres estudiante(responda si o no) ")
compra = input("Cuanto a sido el precio de tu compra ")

edad_numero = int(edad)
compra_n = int(compra)
mayor = edad_numero >= 65
es_estudiante = estudiante == "si"

gasto = compra_n > 50

descuento = mayor or (es_estudiante and gasto)


print ("edad:", edad)
print ("¿es estudiante?", es_estudiante)
print ("Precio de la compra:", compra)
print("¿Se te aplica el descuento?:", descuento)
