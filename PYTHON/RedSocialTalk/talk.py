import S4Red as Red
#modulo que permite consultar si un archivo existe:
import os

Red.mostrar_bienvenida()
nombre = Red.obtener_nombre()
print('Hola ', nombre, ", bienvenido a Talk")

#verificamos si el archivo existe
if Red.existe_archivo(nombre+".user"):
    #Si existe se muestran los datos por pantalla:
    print('Leyendo los datos del usuario ', nombre, ' desde archivo.')
    (nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos,estado, muro) = Red.lectura_archivo(nombre)
    
    
else: 
    #Si el usuario no existe, se piden los datos como soliamos hacer
    print()
    (edad, ciudad_actual, origen, genero, num_celular, estatura_m,estatura_cm, amigos) = Red.obtener_datos()
    estado = ""
    muro = []

#En ambos casos, al llegar aqui ya conocemos los datos del usuario    

Red.mostrar_perfil(nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos)
Red.mostrar_mensaje(nombre, None, estado)
print("Ya podemos preguntar, recordar y calcular datos. Esperamos que disfrutes con Mi Red")
print("--------------------------------------------------")

opcion = 1
while opcion != 0:
    # Mostramos el menu
    opcion = Red.opcion_menu()

    #Codigo para la opcion 1. Publicar un mensaje.
    if opcion == 1:
        estado = Red.obtener_mensaje()
        Red.publicar_mensaje(nombre, amigos, estado, muro)

    #Codigo para la opcion 2. Publicar un mensaje a un grupo de personas.
    elif opcion == 2:
        Red.mostrar_muro(muro)

    #Codigo para la opcion 3. Publicar los datos del perfil del usuario.
    elif opcion == 3:
        Red.mostrar_perfil(nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos)

    #Codigo para la opcion 4. Actualizar los datos del perfil del usuario.
    elif opcion == 4:
        (edad, ciudad_actual, origen, genero, num_celular, estatura_m,estatura_cm, amigos,muro) = Red.obtener_datos()
        Red.mostrar_perfil(nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos)
    elif opcion == 5:
        nuevo_nombre = input("¿A que perfil quieres cambiar?")
        (nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos,estado,muro) = Red.cambiar_usuario(nuevo_nombre)
    elif opcion == 6:
        Red.agregar_amigo(amigos)
    elif opcion == 7:
        Red.mostrar_ultimos_estados(amigos)

    elif opcion == 0:
        Red.escribir_archivo(nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos,estado,muro)

print("Gracias por usar Mi Red. ¡Hasta pronto!")