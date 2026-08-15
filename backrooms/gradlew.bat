@echo off
:: Gradle wrapper batch script for Windows
:: To use the wrapper run gradlew.bat from the project root
set DIRNAME=%~dp0
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

set DEFAULT_JVM_OPTS=-Xmx1g

"%JAVA_HOME%\bin\java" %DEFAULT_JVM_OPTS% -classpath "%APP_HOME%gradle\wrapper\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*
