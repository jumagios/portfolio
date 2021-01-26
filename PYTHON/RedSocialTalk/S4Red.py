import os
def mostrar_bienvenida():
    print("Bienvenido a ... ")
    print("              \n"
       "                     \__   __/(  ___  )( \      | \    \ \n"
       "                        | |   | (___) || |      |  (_/ / \n"
       "                        | |   |  ___  || |      |   _ (  \n"
       "                        | |   | (   ) || |      |  ( \ \ \n"
       "                        | |   | )   ( || (____/\|  /  \ \\\n"
       "                        )_(   |/     \|(_______/|_/    \/\n")

def obtener_nombre():
    nombre = input("Cual es tu nombre de usuario?")
    return nombre

def obtener_edad():
    nacimiento = int(input("Para preparar tu perfil, dime en que año naciste."))
    while nacimiento < 1900 or nacimiento > 2020:
        print("Error este año no esta permitido")
        nacimiento = int(input("Para preparar tu perfil, dime en que año naciste."))
    edad = 2020-nacimiento
    return edad

def obtener_ciudad_actual():
    ciudad_actual = input("¿Donde estas viviendo actualmente?")
    return ciudad_actual

def obtener_origen():
    origen = input("¿Donde naciste?")
    return origen

def obtener_genero():
    genero = input("¿Cual es tu genero? [M=Masculino o F=Femenino]")
    while genero !='M' and genero !='F':
        print('Error')
        genero = input("¿Cual es tu genero? [M=Masculino o F=Femenino]")
    return genero

def obtener_celular():
    num_celular = int(input("¿Cual es tu numero de celular?"))
    return num_celular

def obtener_estatura():
    estatura = float(input("Contame mas de vos, para agregar a tu perfil. ¿Cuanto mides? Dimelo en metros."))
    metros = int(estatura)
    centimetros = int( (estatura - metros)*100 )
    return (metros, centimetros)

def obtener_lista_amigos():
    linea = input("Muy bien. Finalmente, escribe una lista con los nombres de tus amigos, separados por una ',': ")
    amigos = linea.split(",")
    return amigos

def obtener_datos():
    e = obtener_edad()
    c = obtener_ciudad_actual()
    o = obtener_origen()
    g = obtener_genero()
    cel = obtener_celular()
    (em, ec) = obtener_estatura()
    la = obtener_lista_amigos()
    return (e, c, o, g, cel, em, ec, la)

def mostrar_perfil(nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos):
    print("Muy bien, ", nombre, ". Estos son los datos de tu perfil:")
    print("-------------------------------------------------")
    print("Nombre:  ", nombre)
    print("Edad:    ", edad)
    print("Vives en:", ciudad_actual)
    print("Eres de: ", origen)
    print("Sexo:    ", genero)
    print("Celular: ", num_celular)
    print("Estatura:", estatura_m, "m y", estatura_cm, "cm")
    print("Amigos:  ", len(amigos))
    print("-------------------------------------------------")

def opcion_menu():
    print("Acciones disponibles:")
    print("  1. Escribir un mensaje")
    print("  2. Mostrar mi muro")
    print("  3. Mostrar los datos de perfil")
    print("  4. Actualizar el perfil de usuario")
    print("  5. Cambiar de usuario")
    print("  6. Agregar amigo nuevo")
    print("  7. Mostrar ultimos estados de mis amigos")
    print("  0. Salir")
    opcion = int(input("Ingresa una opcion: "))
    while opcion < 0 or opcion > 7:
        print("No conozco la opcion que has ingresado. Intentalo otra vez.")
        opcion = int(input("Ingresa una opcion: "))
    return opcion

def obtener_mensaje():
    mensaje = input("Ahora vamos a publicar un mensaje. ¿Que piensas hoy? ")
    return mensaje

def mostrar_mensaje(origen, destinatario, mensaje):
    print("--------------------------------------------------")
    if destinatario == None:
        print(origen, "dice:", mensaje)
    else:
        print(origen, "dice:", "@"+destinatario, mensaje)
    print("--------------------------------------------------")

#Muestra los mensajes recibidos
def mostrar_muro(muro):
     print("------ MURO ("+str(len(muro))+" mensajes) ---------")
     for mensaje in muro:
         print(mensaje)
     print("--------------------------------------------------")

#Publica un mensaje en el timeline personal y en el de los amigos
def publicar_mensaje(origen, amigos, mensaje, muro):
    print("--------------------------------------------------")
    print(origen, "dice:", mensaje)
    print("--------------------------------------------------")
    #Agrega el mensaje al final del timeline local
    muro.append(mensaje)
    #Agrega, al final del archivo de cada amigo, el mensaje publicado
    for amigo in amigos:
        if existe_archivo(amigo+".user"):
            archivo = open(amigo+".user","a")
            archivo.write(origen+":"+mensaje+"\n")
            archivo.close()

def lectura_archivo(nombre):
    archivo_usuario = open(nombre+".user", "r")
    nombre = archivo_usuario.readline().strip('\n') 
    edad = int(archivo_usuario.readline())
    estatura = float(archivo_usuario.readline())
    estatura_m = int(estatura)
    estatura_cm = int( (estatura - estatura_m)*100 )
    genero = archivo_usuario.readline().strip('\n')
    origen = archivo_usuario.readline().strip('\n') 
    ciudad_actual = archivo_usuario.readline().strip('\n')
    amigos = archivo_usuario.readline()
    num_celular = int(archivo_usuario.readline())
    estado = archivo_usuario.readline()
    #Lee el 'muro'. Esto es, todos los mensajes que han sido publicados en el timeline del usuario.
    muro = []
    mensaje = archivo_usuario.readline().rstrip()
    while mensaje != "":
        muro.append(mensaje)
        mensaje = archivo_usuario.readline().rstrip()
    #Una vez que hemos leido los datos del usuario no debemos olvidar cerrar el archivo
    archivo_usuario.close()
    return (nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos,estado,muro)

def escribir_archivo(nombre,edad,ciudad_actual,origen,genero,num_celular,estatura_m,estatura_cm,amigos,estado,muro):
    print("Has decidido salir. Guardando perfil en ",nombre+".user")
    archivo_usuario = open(nombre+".user","w")
    archivo_usuario.write(nombre+"\n")
    archivo_usuario.write(str(edad)+"\n")
    archivo_usuario.write(str(estatura_m + estatura_cm/100)+"\n")
    archivo_usuario.write(genero+"\n")
    archivo_usuario.write(origen+"\n")
    archivo_usuario.write(ciudad_actual+"\n")
    archivo_usuario.write(str(amigos)+"\n")
    archivo_usuario.write(str(num_celular)+"\n")
    #archivo_usuario.write(estado+"\n")
     #Escribe el 'timeline' en el archivo, a continuaciÃ³n del Ãºltimo estado
    for mensaje in muro:
        archivo_usuario.write(mensaje+"\n")
    #Una vez que hemos escrito todos los datos del usuario en el archivo, no debemos olvidar cerrarlo
    archivo_usuario.close()
    print("Archivo",nombre+".user","guardado")

def cambiar_usuario(nombre):
    if existe_archivo(nombre+".user"):
       return lectura_archivo(nombre)
    

def existe_archivo(ruta):
    return os.path.isfile(ruta)

def agregar_amigo(amigos):
    amigo_nuevo = input('Escribi el nombre de tu amigo:')
    amigos.append(amigo_nuevo)

def mostrar_ultimos_estados(amigos):
    for amigo in amigos:
        archivo = open(amigo+".user","r")
        for i in range(10):
            linea = archivo.readline().rstrip()
        print(amigo+":", linea)
    archivo.close()
