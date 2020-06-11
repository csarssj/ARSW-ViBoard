# ViBoard

![image](https://github.com/csarssj/ARSW-ViBoard/blob/master/img/ViBoarrd.png)

Comparte tu ideas a través de un tablero virtual colaborativo para escribir o dibujar en una pizarra virtual donde crear esquemas, compartir ideas, recopilar notas, etc.

## Descripcion

ViBoard es una sencilla herramienta de colaboración en línea que permite crear grupos virtuales, que registrándose o no el usuario  tiene la posibilidad de crear  una sala,
a la que luego es posible permitir que sus compañeros de equipo ingresen. Sus servicios incluyen una pizarra digital que admite textos y gráficos (pueden dibujarse por medio de figuras geométricas al estilo Paint de Windows),
una sala de chat basada en texto, una herramienta de gestión y alojamiento de imágenes, y lo mejor: la capacidad de conversar con los compañeros a través de audio en tiempo real.

¿En qué casos es útil ViBoard ?

- Puedes emplearlo para enseñar a organizar proyectos en grupo donde cada participante pueda colaborar de forma distintiva.

- Plantear una lluvia de ideas con alumnos para proponer eventos del centro escolar, debates sobre exámenes o propuestas para el aula.

- Trabajar de forma colaborativa entre alumnos de la misma o distintas aulas, siendo posible trabajar remotamente cada uno desde su equipo.

### NinjaMock

A continuación se muestra una maqueta de la aplicación:

Contaremos con registro e inicio de sesión dentro de la aplicación donde con solo llenar los campos el usuario podrá ingresar.

![image](https://github.com/csarssj/ARSW-ViBoard/blob/master/img/login.png)

Los usuarios registrados  en el sistema podrán crear salas donde podran compartir el nombre de la sala y la contraseña asignada con sus compañeros.

![image](https://github.com/csarssj/ARSW-ViBoard/blob/master/img/create.png)

También podrán ingresar a una sala simplemente con poner el nombre y la contraseña asignada.

![image](https://github.com/csarssj/ARSW-ViBoard/blob/master/img/login.png)

Una vez el usuario ingresa a una sala, encontrará un tablero virtual en el cual podrá escribir, dibujar, compartir imágenes y chatear a tiempo real con los 
demás miembros de la reunión.

![image](https://github.com/csarssj/ARSW-ViBoard/blob/master/img/board.png)

Adicionalmente cuenta con la opción de elegir  días y horas de la semana  para poder organizar sus próximas reuniones o actividades.

![image](https://github.com/csarssj/ARSW-ViBoard/blob/master/img/horario.png)


### Valor agregado

- Posibilidad de formar grupos con los compañeros de trabajo, alumnos para poder planear próximas reuniones.

- Creación de horarios para poder organizar próximas reuniones y actividades, asignando los días y horas específicos de cada una en tiempo real. 

### Necesidad

En tiempos de pandemia nuestras actividades contidianas se han visto afectadas, principalmente las academicas y/o laborales. Por lo tanto la tecnologia ha tomado un papel de 
vital importancia estos días. 

¿Necesitas editar un documento con tus compañeros, desde casa, sin complicaciones, de manera gratuita y no sabes qué servicio utilizar? La respuesta la encontrarás en ViBoard.
Se trata de una herramienta perfecta para trabajar de manera eficaz y colaborativa en línea.
ViBoard es una aplicación colaborativa que permite compartir, elaborar y expresar ideas a través de un tablero virtual. Permite la interacción entre maestros, alumnos y
grupos de trabajos. Permite compartir una pizarra, en la cual todo el equipo podrá realizar sus aportes en forma de dibujo, nota, texto o imágenes.

## Historias de usuario
- Crear una sala  *COMO* Usuario *QUIERO* Crear una sala *PARA* poder realizar mis reuniones.
- Criterios de aceptación:
		- Al ingresar los datos se debe crear la sala.
		- Al hacer clic se redirige a la página para crear la sala.
		- La sala debe estar disponible para el resto de usuarios apenas se crea.
		- Por sala no pueden haber más de 8 personas.
- Ingresar a una sala *COMO* Usuario *QUIERO* Ingresar a una sala *PARA* poder realizar las reuniones de mi equipo.
- Criterios de aceptación:
		- Al hacer clic se redirige a la página para crear.
		- Ingresar por medio del nombre y la contraseña de una sala.
		- No es posible que el mismo usuario esté en diferentes salas.
		
- Dibujar en el tablero: *COMO* Usuario *QUIERO* Dibujar en el tablero *PARA* poder explicar y plantear ideas. 
- Criterios de aceptación:
		- Tiene que ser en tiempo real.
		- Al hacer clic poder dibujar en el tablero.
		- Se podrá editar el color y el tamaño del lápiz.
		- Se podrá borrar lo dibujado.
- Escribir en el tablero *COMO* Usuario *QUIERO* Escribir en el tablero *PARA* poder compartir ideas concretas con mi equipo.
- Criterios de aceptación:
		- Al hacer clic poder escribir en el tablero.
		- Se podrá editar el color y el tamaño de la letra.
		- Se podrá borrar lo escrito.
		- Tiene que ser en tiempo real.
- Adjuntar imágenes en el tablero *COMO* Usuario *QUIERO* Adjuntar imágenes en el tablero *PARA* poder mostrar ilustraciones de mis ideas.
- Criterios de aceptación:
		- Debe aparecer el icono en la barra inferior de la pantalla.
		- Tienen que ser importadas del pc del usuario.
		- Se pueden mover a cualquier lugar del tablero. 
- Adjuntar notas en el tablero *COMO* Usuario *QUIERO* Adjuntar notas en el tablero *PARA* poder mostrar ideas relevantes.
- Criterios de aceptación:
		- Debe aparecer el icono en la barra inferior de la pantalla.
		- Al hacer clic se debe agregar una nota en la pantalla.
		- Se puede escribir encima de las notas.
		- Se pueden mover a cualquier lugar del tablero.
		
- Conversar en el Chat online *COMO* Usuario *QUIERO* Conversar en el chat *PARA* establecer comunicación con los demás miembros del equipo.
- Criterios de aceptación:
		- Mostrar el chat a tiempo real en pantalla.
		- Enviar mensajes a tiempo real.
## Construido en

* [Maven](https://maven.apache.org/) - Dependency Management


## Control de versiones 

[Github](https://github.com/) para el versionamiento.

## Authors

[César González](https://github.com/csarssj) 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
