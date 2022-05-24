# Proyecto-Paradigmas

Cumplimiento de requerimientos: 
| Requerimiento      | Estado |
| ----------- | ----------- |
| Creación Base de datos      | ✅  |
| GUI   | :x:        |
| Controlador   | 🔨        |
| CRUD mediante API REST Service   | 🔨     |
| Modulo Administrativo en Python   | :x:    |
| Unión funcional del proyecto   | :x:        |

# Explicación de actualizaciones

## Actualización 24/05/2022 -> (Generación de base de datos)

![image](https://user-images.githubusercontent.com/85517698/170147179-540737c1-d06f-490b-a348-ced6bf584f51.png)

Esta fue la base generada con Spring, por lo que ya está lista para crear la API REST service.

## Actualización 23/05/2022 -> (Explicación de creación de tabla relacional)

![image](https://user-images.githubusercontent.com/85517698/169774550-05752991-602e-4a7d-adec-552d043beb8a.png)

Esta sección de código nos ayuda a generar tablas relacionales, esta hecho sobre la clase carros y se relaciona con la clase agencias (*Es importante ver que el nombre de los id coincida para que pueda hacer la unión adecuadamente*).

## Actualización 22/05/2022 -> (Explicación de las bases del proyecto)

![image](https://user-images.githubusercontent.com/85517698/169746614-71a614fd-3295-4d3f-97a2-3a7d791181c8.png)

Importante: El App.java debe estar siempre al tope de las demás carpetas dentro de esa sección

![image](https://user-images.githubusercontent.com/85517698/169747970-33e19e42-a35c-47ae-bcad-cd6f55a7251c.png)

![image](https://user-images.githubusercontent.com/85517698/169748004-bcb5e684-3ddd-4c39-a615-3aac78455090.png)

Aqui es donde se esta creando la tabla clientes en la base de datos, las etiquetas son identificadores para el mysql par a saber si son entidades, llaves, etc.

![image](https://user-images.githubusercontent.com/85517698/169748112-2e1cc8fe-9057-4535-8b00-67af0ad86c80.png)

En este xml es donde esta el manejo de todas las dependencias que vamos a utilizar, se pueden ir actualizando desde el vscode.

![image](https://user-images.githubusercontent.com/85517698/169748186-ae126296-d89b-403a-a69f-cb8d563f2bc7.png)

En esa carpeta se encuentra el archivo application.propierties que nos ayuda a manejar todas las conexiones y demás configuraciones dentro de nuestra apliacación.

![image](https://user-images.githubusercontent.com/85517698/169748243-c0b3ca7a-2e79-48ec-9f53-0013ab6c2375.png)

Dentro de ese archivo tenemos la conexión a la base de datos y esta desglozada de esta forma: 

![image](https://user-images.githubusercontent.com/85517698/169748317-349c8f52-ce48-4970-ad67-1e8213d9afc8.png)

Esta linea indica que pasa al tiempo de compilar el programa, existen varias opciones:
- create-drop (Crear y borrar en mysql cada que compilemos el programa (idoneo en estos momentos que es de pruebas))

- create (Solo crea pero no lo borra cuando deja de estar en compliación)

- upload (Solo actualice pero no crea ni borra).

- none (No modificar nada de lo que este ya en la base, solo permite manejarla pero no mover nada).

*Esto tiene sentido debido a que es sobre el DDL y recordemos que los DDL son los que dan permisos sobre consultas, inserciones y eliminaciones. 

![image](https://user-images.githubusercontent.com/85517698/169749111-9a0f5e41-edac-485e-b5ba-6e50c46701b9.png)

Esa es la conexión a la base, en su caso solo actualicen la contraseña cada que la usen.

![image](https://user-images.githubusercontent.com/85517698/169749306-1cb38e58-5302-4712-88b7-401b44c4b81d.png)

Esto permite que en consola te muestre como van las actualizaciones en la base, no es necesario cambiar algo de momento.

![image](https://user-images.githubusercontent.com/85517698/169749383-da74eda4-7f21-487f-b694-e5ac4211f890.png)

Esta sección es para indicar en que puerto se está levantando la aplicación en caso de que haya algún error por eso.
