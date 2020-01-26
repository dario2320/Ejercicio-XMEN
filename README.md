# Ejercicio-XMEN

Instrucciones de Instalación y uso

1 Clonar  proyecto
2 Importar proyecto desde Eclipse o STS como Maven
3 Verificar configuracion de base de datos en el archivo application.properties
4 Generar build .jar
5 Ejecutar java -jar xmen.jar desde consola (previamente debe esta tomcat version7 instalado) o ejecutar desde IDE

Métodos
1. getStats: devuelve estadísticas. (método GET).
2. Mutant: verifica si un código es humano o mutante (método POST).

Rutas.
1. http://ec2-34-211-239-211.us-west-2.compute.amazonaws.com:8080/getStats
2. http://ec2-34-211-239-211.us-west-2.compute.amazonaws.com:8080/Mutant
