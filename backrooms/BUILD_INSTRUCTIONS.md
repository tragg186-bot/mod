BUILD_INSTRUCTIONS (Windows 11)
================================

Requisitos previos
- JDK 21 instalado y configurado en PATH.
- (Opcional) Gradle instalado globalmente para generar wrapper; no es obligatorio si quieres usar gradlew después de generarlo.

1) Comprobar Java
-----------------
Abra PowerShell o CMD y ejecute:
> java -version

Salida esperada (ejemplo):
java version "21" 2024-09-XX
Java(TM) SE Runtime Environment...

Si la versión no es 21, instala JDK 21 y actualiza JAVA_HOME y PATH.

2) Comprobar Gradle (opcional)
------------------------------
Si tienes Gradle instalado globalmente:
> gradle --version

Si no tienes Gradle instalado localmente, generaremos el wrapper en el paso siguiente.

3) Generar Gradle Wrapper (si no existe)
----------------------------------------
Si no existe `gradlew.bat` y `gradle/wrapper/gradle-wrapper.properties`, ejecuta (PowerShell o CMD) en la raíz del proyecto (donde está build.gradle):

> gradle wrapper --gradle-version 9.5

Esto generará `gradlew`, `gradlew.bat` y la carpeta gradle/wrapper con `gradle-wrapper.properties` y `gradle-wrapper.jar`.

Nota: Si deseas forzar la distribución URL que entregué, asegúrate que gradle-wrapper.properties contiene:
distributionUrl=https\://services.gradle.org/distributions/gradle-9.5-bin.zip

4) Ejecutar build (Windows)
---------------------------
En PowerShell (en la raíz del proyecto):

> .\gradlew.bat build --refresh-dependencies

Observaciones:
- `--refresh-dependencies` puede ayudar a forzar la descarga de mappings/looms si hay cambios.
- Si el build falla con errores sobre mappings (Yarn), verifica el mensaje: suele indicar qué artifact falta o qué versión no existe.

5) Ejecutar cliente de desarrollo (opcional)
--------------------------------------------
Para arrancar la runs de desarrollo:

> .\gradlew.bat runClient

Esto arrancará el cliente de Minecraft con el mod cargado en el entorno de desarrollo (si la configuración de run está correcta).

6) Si hay errores de mappings
-----------------------------
Si ves errores indicando que `net.fabricmc:yarn:1.21.1+build.X:v2` no existe:
- Abre https://maven.fabricmc.net/net/fabricmc/yarn/ y comprueba qué builds de `1.21.1+build.*` están disponibles.
- En build.gradle cambia la línea:
  def yarn_mappings = '1.21.1+build.3'
  por la build que exista en el repo, por ejemplo:
  def yarn_mappings = '1.21.1+build.4'
- Vuelve a ejecutar:
  .\gradlew.bat build --refresh-dependencies

7) Verificación final
---------------------
Si el build finaliza correctamente encontrarás el JAR en:
> build\libs\backrooms-0.1.0.jar

Copia ese JAR en la carpeta `mods\` de tu instalación Fabric 1.21.1 (cliente o servidor) junto con Fabric Loader 0.15.11 y Fabric API 0.116.15+1.21.1 instalados.

8) Registro de problemas
------------------------
Si el build falla, copia aquí el bloque de error completo (preferiblemente el stacktrace con `--stacktrace`) y lo analizaré y te indicaré correcciones.

Comandos útiles para depuración:
- .\gradlew.bat build --refresh-dependencies --stacktrace
- .\gradlew.bat dependencies (para listar dependencias resueltas)
