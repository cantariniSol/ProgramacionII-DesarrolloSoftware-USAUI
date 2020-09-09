## Trabajo práctico: Carga de notas de alumnos (práctica de uso de matrices)

* Implementar un programa que permita ingresar por consola en una matriz de nx4 las calificaciones de n estudiantes en 4 exámenes de una misma materia. Los exámenes se aprueban con nota >=4, la materia se aprueba con promedio de notas >=4.

* El programa debe ofrecer las siguientes opciones:

1. Cargar alumnos. Esto puede hacerse en un array list o en un array de Strings (solo pedir nombre de alumno, pensar cuál sería la diferencia entre usar un array y un array list). Cuando el usuario termina de cargar los alumnos, el programa inicializa una matriz de enteros con tantos alumnos como se hayan cargado y 4 columnas (inicialmente serán todos valores ceros).
   
2. Ingresar notas. Esta opción debe permitir el ingreso de las notas para cada alumno y examen (rellenado de la matriz). Validar nota >=0 y <= 10 (elegir una alternativa de flujo de carga, podría ser que el sistema vaya mostrando nombre de alumno y número de examen y el usuario ingrese la nota, podría ser que el usuario vaya eligiendo alumno y examen a cargar y luego ingrese la nota o alternativas similares).

3. Ver notas de estudiantes en formato tabla (donde las filas son los alumnos y las columnas los exámenes). Llamar a un método que realice esta funcionalidad. 
Ejemplo si se cargaron 3 alumnos (Juan, Mariana y Daniel) y luego se ingresaron todas las notas:

4. Ver nota final de un estudiante: El sistema pide número de estudiante y devuelve el promedio de los 4 exámenes. Llamar a un método que realice esta funcionalidad.
   
5. Ver cuántos estudiantes reprobaron un examen en particular: El sistema pide número de examen y devuelve la cantidad de estudiantes que reprobaron. Llamar a un método que realice esta funcionalidad.

6. Listar alumnos aprobados (para cada aprobado muestra nombre/nota final y total de aprobados). Llamar a un método que realice esta funcionalidad. 

7. Listar alumnos reprobados (para cada reprobado nombre/nota final y total de reprobados). Llamar a un método que realice esta funcionalidad. 

* Tener en cuenta:
>Para simplificar el ejercicio los alumnos solo se pueden cargar una vez pero las notas se pueden modificar en cualquier momento con la opción 2 del menú. 

>Para las opciones 2 a 7 deben haberse cargado los alumnos primero.
Implementar por un lado una clase (1) con un main que al ejecutarse muestre las opciones de menú. Por otro lado una clase (2) que tenga todos los métodos necesarios para realizar las funcionalidades pedidas. La clase 1 tiene que generar una instancia de la clase 2 para luego utilizar cada vez que el usuario seleccione una opción de las disponibles. 

