# Lab03 - Clases de equivalencia
## Hecho por : Juan Camilo Ortiz Medina

## Ejercicio “Registraduría”

### Compilar el proyecto
>mvn package
![Compilar](https://i.imgur.com/Jm3nhJP.png)

### Comando para ejecutar pruebas unitarias
>mvn test
>mvn -Dtest=TestApp1 test
![Pruebas](https://i.imgur.com/Jm3nhJP.png)

### Finalizar el ejercicio

### Pruebas Unitarias
![PruebasUnitarias](https://i.imgur.com/HJSNT84.png)


## Ejercicio "Descuento de tarifas"
### Adicionar una librería personalizada al repositorio local de maven
> mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar
![LibreriaPersonalizada](https://i.imgur.com/erw1syY.png)

### Problemas con el codigo
### Caso 1 : No esta teniendo en cuenta la tarifa base negativa.
![Prueba1](https://i.imgur.com/iZ73gX8.png)

### Caso 2 : No esta teniendo en cuenta los dias de antelacion negativos.
![Prueba2](https://i.imgur.com/A3cSrkx.png)

### Caso 3 : Cuando la edad es negativa se esta haciendo descuento del 5% a la tarifa.
![Prueba3](https://i.imgur.com/JMc2la4.png)

### Conclusion: Al hacer las pruebas unitarias, hay pruebas que fallan y teniendo en cuenta las 3 observaciones anteriores se concluye que hay errores en el codigo.
