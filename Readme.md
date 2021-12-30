# ENUNCIADOS

## Reto 1.16: App_v1.0

Con la llegada de la transformación digital, todos los usuarios buscan información en internet de sus tiendas de confianza, pero muchas de ellas no están disponibles por los altos costos que requiere anunciar sus productos en estos sitios. Por eso es necesario hacer aplicaciones sencillas y de bajo costo, al alcance de pequeñas empresas, emprendimientos y de los usuarios.

Para lograrlo vamos a comenzar a desarrollar una primera versión de una App móvil que muestre una tienda de Festejos, cuyos productos se puedan visualizar a través de una primera pantalla con una interfaz gráfica que presente los datos de forma agradable a los usuarios. Para lograrlo este primer diseño de pantalla debe contener:

1. Una barra de tareas con logo de la tienda, y mínimo 3 opciones de menú:

Por ejemplo: Productos, Servicios, Sucursales.

2. Layout, que permita la inserción de imágenes y listas.

3. Botones, cajas de texto, etiquetas y mensajes de texto.

4. Un logo personalizado de acceso a la App desplegado en el dispositivo móvil y que le de identidad a la App.

Cada objeto visual, incluyendo el fondo de pantalla deberá contener los colores empresariales elegidos para el diseño, y los cuales deben estar reflejados en el archivo colors.xml, al igual que el estilo del texto.

Para la verificación de su funcionamiento, cada objeto visual cliqueable debe lanzar un mensaje de texto que indique que futura función se implementará en la siguiente versión (Reto 2).

La calificación es manual y a la plataforma se subirá el ejecutable (APK) y el código de la aplicación.


### Dificultad

Instrucciones
Instrucciones para la calificación automática

Para la evaluación del reto, deberás subir el proyecto comprimido en un archivo de máximo 5mb. No incluir librerias.
Adicionalmente, en el validador de código, deberás copiar y pegar el código de la clase MainActivity.java.


## Reto 2.16: App_v2.16

En esta segunda versión de la App para la pequeña empresa de Festejos, el equipo de diseñadores y programadores han decidido mejorar la interfaz gráfica de usuario con nuevas y mejores técnicas de presentación de la información y de navegación. Para ello han acordado en equipo realizar una serie de mejoras en cuanto a los menús y dinámica de las pantallas, para empezar a agregar nuevas funcionalidades a la App, entre ellas el uso de base de datos. En este caso, preparan la app con diferentes diseños entre los cuales deben decidir cuál es el más apropiado para presentar los productos de Festejos que ofrece la tienda.

Estas nuevas funcionalidades y el diseño están alineadas con las estrategias comerciales y de negocio de la tienda. Las cuales ayudaran a sus dueños a mejorar las ventas y la visibilidad de la empresa. Por lo tanto, debe ir conectado secuencialmente con la primera versión de la App y con las siguientes versiones.

### Dificultad

Instrucciones
Instrucciones para la calificación automática

Reto 2.16: App_v2.0
Dando continuidad con el reto 1, se aprovecha la GUI mejorándola con otros conceptos de interfaz
gráfica explicados durante el módulo 2. Con estos nuevos conceptos de diseño y manejo de GUI se
esperan las siguientes mejoras en la App:
1. Despliegue de menús personalizados como el menú lateral usando Navigation Drawer y
Fragments para mejorar la experiencia de presentación de la información y navegación a
los usuarios.
2. Navegación entre pantallas usando Intent y pasando datos entre pantallas usando
putExtra.
3. Usar Layout para alojar listas y tablas que luego se utilizaran en la siguiente versión.
4. Usar toolbar personalizada o prediseñada que mejore tareas que requiera hacer el usuario
de forma rápida, por ejemplo, buscar, agregar favoritos, u otras utilidades.
5. La tabla o lista en la pantalla deberá contener imágenes de ejemplo de los productos de la
tienda de Festejos junto con texto informativo sobre estos productos.
Para la evaluación del reto, deberás subir el proyecto comprimido en un archivo de máximo 5mb. No incluir librerias.
Adicionalmente, en el validador de código, deberás copiar y pegar el código de la clase MainActivity.java.


## Reto 3.16: App_v3.16

Para mejorar la experiencia de usuario con la app se ha decidido agregar una pantalla de inicio que presente la imagen corporativa de la pequeña empresa de Festejos, mientras en segundo plano la app de forma automática actualiza y trae los productos que estarán disponibles para el usuario. Esto le dará un aspecto más empresarial y resaltará más el nombre de la empresa aumentando el grado de recordación ante los clientes. Además, la app en su versión 3, podrá ofrecer a sus clientes la posibilidad de almacenar sus productos favoritos en el teléfono, de manera que cuando no tenga conexión a internet aun podrá revisar los precios y características de los productos que le ha gustado.

Para ello se le ha adicionado en esta nueva versión un menú en la barra de tareas que le permite al cliente navegar entre pantallas para agregar estos productos. Debido a la buena demanda de productos gracias al desarrollo de la app, la empresa ha decidido continuar agregándole más funcionalidades a la App. Por lo que en las siguientes versiones veremos más funcionalidades que ayudan a mejorar las ventas de productos y servicios de la tienda de Festejos.

### Dificultad

Instrucciones
Instrucciones para la calificación automática

Reto 3.16: App_v3.0
Tomando los conceptos de procesamiento en segundo plano (background), es necesario crear una
pantalla inicial para preparar la aplicación para conectarse a internet y traer los datos de los
productos que se mostraran en pantalla una vez se actualicen desde la nube (Reto 5). Sin
embargo, en este reto se debe proyectar el diseño para que en el reto 5 ya este todo integrado.
Con estos nuevos conceptos de diseño y manejo de GUI se esperan las siguientes mejoras en la
App:
1. Agregar a la app del reto 2 una pantalla de inicio llamada "splash", que se queda en
ejecución mientras prepara en segundo plano los datos de los productos que mostrará al
usuario. Mientras lo hace mostrará una imagen animada representativa de la tienda de
Festejos por al menos 5 segundos, junto con una barra de progreso.
2. Hacer uso de mensajes de notificaciones, diálogos prediseñados y personalizados, cuando
la app lo requiera según el contexto de funcionamiento previamente diseñado.
3. Mostrar la tabla o lista en la pantalla con imágenes de ejemplo que muestre la base de
datos SQLite como almacenamiento de algunos datos o productos favoritos del cliente, en
donde se evidencie que guarda, borra, y actualiza estos productos.
4. El diseño debe estar pensado para el siguiente reto 5 el cual traerá los productos de la
tienda desde la base de datos en la nube y mostrará las sucursales en un mapa de
geolocalización de sus sucursales.
Para la evaluación del reto, deberás subir el proyecto comprimido en un archivo de máximo 5mb. No incluir librerias.
Adicionalmente, en el validador de código, deberás copiar y pegar el código de la clase MainActivity.java.

## Reto 4.16: App_v4.16

Debido a la gran acogida del uso de la app por parte de los clientes, y el notable aumento de las ventas, la empresa de Festejos ha decidido aprovechar las ventajas que le brinda la tecnología, para adicionar una nueva funcionalidad a la app, la cual consiste en brindarle a sus clientes mayor comodidad ofreciendo sus productos en nuevas sucursales en diferentes puntos de la ciudad. En este caso si el cliente está en su trabajo o en cualquier otro lugar fuera de su casa, podrá contar con una tienda de confianza cerca de su ubicación.

Al darle la posibilidad a los clientes de ubicar las sucursales de la tienda, mejorando su cobertura, también mejoran algunos de sus servicios, como es la entrega de productos a domicilio. Abaratando costos de transporte y recortando tiempos de entrega.

### Dificultad

Instrucciones
Instrucciones para la calificación automática

Reto 4.16: App_v4.0
En esta versión se agrega a la App la funcionalidad de ubicación de sucursales de la tienda de
Festejos. Para lograrlo, es necesario crear una pantalla nueva que contenga un mapa con la
ubicación de las sucursales. Para adicionar esta funcionalidad se deben hacer las siguientes mejoras:
1. Usar la librería OpenStretMap de Geolocalización y mapas.
2. Usar una nueva pantalla con un MapView y un fragment o cualquier otro objeto adecuado
para el manejo de mapas.
3. Mostrar a través de etiquetas de marcas las diferentes ubicaciones de las sucursales de cada
tienda de Festejos.
4. Usar un diseño de menú adecuado para el manejo del mapa en la barra de tareas o en
cualquier otro sitio de acuerdo con el diseño de la app.
Para la evaluación del reto, deberás subir el proyecto comprimido en un archivo de máximo 5mb. No incluir librerias.
Adicionalmente, en el validador de código, deberás copiar y pegar el código de la clase MainActivity.java.

## Reto 5.16: App_v5.16

La empresa de Festejos ahora necesita conectar todas sus sucursales y llevar un registro de los productos disponibles e ir actualizándose según como se mueva el inventario. Para ello ha decidido contratar los servicios de una nube para almacenar y gestionar sus datos (Oracle Cloud). En este caso para iniciar, decide usarla como PaaS, creando una base de datos en SQL.

Esto le permite a la app mostrar a sus clientes los productos disponibles a sus clientes a través de una interfaz gráfica amigable, intuitiva y de fácil navegación. De esta misma forma los clientes pueden calificar el servicio y los productos, o radicar alguna queja o reclamo guardándose directamente en la nube, la cual será consultada posteriormente por la administración de la tienda.

### Dificultad

Instrucciones
Instrucciones para la calificación automática

Reto 5.16: App_v5.0
Este reto 5, integra por último la funcionalidad de conectarse a una base de datos externa.
Aprovechando el conocimiento del clico 3, se usará una base de datos en Oracle Cloud. Su
consulta desde la APP móvil se realizará con el protocolo REST, visto en el ciclo 3. Para integrar
esta funcionalidad se debe mejorar la versión anterior de la App de la siguiente manera:
1. Crear en Oracle Cloud (PaaS), una instancia APEX con una base de datos SQL a partir de
script, con controladores REST (GET, POST, PUT y DELETE).
2. Realizar previamente pruebas de la URL obtenida usando postman.
3. Usar la librería Volley de Android para hacer consultas CRUD de la base de datos en la
nube usando los controladores de la API REST.
4. Visualizar en la lista o tabla previamente dispuesta en versiones anteriores de la app, los
datos obtenidos desde la nube. Entre ellos el cargue de imágenes de los productos de la
tienda de Festejos.
Para la evaluación del reto, deberás subir el proyecto comprimido en un archivo de máximo 5mb. No incluir librerias.
Adicionalmente, en el validador de código, deberás copiar y pegar el código de la clase MainActivity.java.
