dinero = int(input("Cuanto dinero quieres sacar? "))

Billete_50 = dinero // 50
sobrante = dinero % 50

Billete_20 = sobrante // 20
sobrante = sobrante % 20

Billete_10 =  sobrante // 10
sobrante = sobrante % 10

Billete_5 = sobrante // 5
sobrante = sobrante % 6


Moneda_1 = sobrante // 1
sobrante = sobrante % 1


print ("Billete 50€: ", Billete_50)
print ("Billete 20€: ", Billete_20)
print ("Billete 10€: ", Billete_10)
print ("Billete 5€: ", Billete_5)
print ("Moneda 1€: ", Moneda_1)
