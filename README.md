# Section3.2

# Flowchart
<img width="723" height="542" alt="Repositorios" src="https://github.com/user-attachments/assets/0e328dc6-4755-4c8a-962f-6d619c595e41" />

# Classes diagram
<img width="591" height="376" alt="RepositoriosClasess" src="https://github.com/user-attachments/assets/de3940b8-3f2c-497b-afc5-ca1c0f4c123b" />


# Pseudocode
INICIO

    CREAR lectorDeEntrada
    DECLARAR repo
    DECLARAR opcion, accion, dato, id

    MOSTRAR "Bienvenido al sistema de repositorios!"

    REPEAT
        MOSTRAR "Seleccione el tipo de repositorio:"
        MOSTRAR "1. Repositorio en Memoria"
        MOSTRAR "2. Repositorio SQL"
        MOSTRAR "3. Salir"
        
        LEER opcion

        SEGÚN opcion HACER

            CASO "1":
                repo ← nuevo RepositorioEnMemoria

                REPEAT
                    MOSTRAR "Selecciona una acción:"
                    MOSTRAR "1. Guardar"
                    MOSTRAR "2. Leer"
                    MOSTRAR "3. Eliminar"
                    MOSTRAR "4. Salir"
                    
                    LEER accion

                    SEGÚN accion HACER

                        CASO "1":
                            MOSTRAR "Ingresa el dato a guardar:"
                            LEER dato
                            repo.guardar(dato)
                        FIN CASO

                        CASO "2":
                            MOSTRAR "Ingresa el ID a leer:"
                            LEER id
                            resultado ← repo.leer(id)
                            MOSTRAR "Dato leído: " + resultado
                        FIN CASO

                        CASO "3":
                            MOSTRAR "Ingresa el ID a eliminar:"
