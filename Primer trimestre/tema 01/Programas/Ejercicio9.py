nombre = input( "dime tu nombre " )  
ano = input ( "dime tu Año de nacimiento " )
altura = input( "dime tu altura en metros " )  



edad_actual = 2026


ano_entero = int(ano)
altura_decimal = float(altura)

edad = edad_actual - ano_entero 

print("tu nombre es", nombre, "y es tipo", type(nombre))
print("tu edad es", edad,"y es tipo: ",type(ano_entero))
print("tu altura es", altura,"y es tipo: ",type(altura_decimal))
