caramelos = input("cuantos caramelos tienes ")
alumnos = input("cuantos alumnos hay ")


caramelos_numero = int(caramelos)
alumnos_numero = int(alumnos)

C_alumno = caramelos_numero // alumnos_numero

resto = caramelos_numero % alumnos_numero

print ("Cantidad de caramelos: ", caramelos)
print ("Cantidad de alumnos: ", alumnos)
print ("Cada alumno recibe: ", C_alumno)
print ("Sobran en la bolsa: ", resto)
