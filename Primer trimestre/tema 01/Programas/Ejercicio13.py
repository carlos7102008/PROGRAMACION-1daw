nombre_cliente = str(input("¿Cual es tu nombre? "))
nombre_producto = str(input("¿Cual es el nombre del producto? "))
precio = float(input("Cual es el precio por unidad "))
cantidad = int(input("Cuanta cantidad has comprado "))
propina_x = input("Desea incluir propina de 2€(si/no) ")


subtotal = cantidad * precio
iva = precio * 0.21
propina_si = 0
propina_si = propina_si + ((propina_x == "si") * 2)

total = subtotal + iva + propina_si


vip = total > 30

print ( "TIQUE DE CAFETERIA")
print ("---------------------")
print ("Cliente; ", nombre_cliente)
print ("Producto; ", nombre_producto, "x",cantidad)
print ("________________________")
print ("Subtotal:" , subtotal)
print ("IVA (21%): ", iva)
print ("Propina: ", propina_si)
print ("TOTAL A PAGAR; ", total)
print ("_______________________")
print ("¿Supera el umbral VIP (>30€)?: ", vip)
