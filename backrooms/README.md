# Backrooms Vol 2 - FASE 1 (Scaffold)

Resumen:
Scaffold inicial para el mod "Backrooms Vol 2" (Minecraft 1.21.1, Fabric, Java 21). Contiene entrypoints, configuración de build y estructura de paquetes para continuar con las fases posteriores.

Requisitos:
- JDK 21 (Java 21)
- Gradle (si no usas wrapper)
- Windows 11 (instrucciones en BUILD_INSTRUCTIONS.md) o Linux/macOS
- Fabric Loader y Fabric API en el entorno de ejecución para testing (será necesario instalar Fabric Loader 0.15.11 y Fabric API 0.116.15+1.21.1 en tu cliente/servidor para correr el mod)

Archivos principales:
- build.gradle
- settings.gradle
- gradle.properties
- gradle/wrapper/gradle-wrapper.properties
- src/main/java/... (entrypoints y ModRegistry)
- src/main/resources/fabric.mod.json
- src/main/resources/assets/backrooms/lang/en_us.json
- config/backrooms/*.json (configuración externa — la carpeta config/ está fuera del JAR por diseño)

Assets:
- Este scaffold no incluye texturas, modelos ni sonidos. Añade assets en assets/backrooms/ en fases posteriores y registra los recursos antes de referenciarlos en lang.

BUILD STATUS: NOT VERIFIED
