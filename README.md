# PooBasicos

Objetivo del Proyecto:
El objetivo de este proyecto es crear un sistema que simula diferentes tipos de vehículos
utilizando los principios de Programación Orientada a Objetos (POO). Deberás
implementar herencia, polimorfismo, abstracción y encapsulación en el diseño del
sistema, aplicándolos de manera adecuada para modelar las interacciones entre los objetos
del sistema.
Requisitos:
1. Clases y Jerarquía de Clases:
   ○ Crea una clase abstracta Vehiculo que tenga los siguientes atributos y
   métodos:
   ■ Atributos:
   ■ marca: String (representa la marca del vehículo).
   ■ velocidad: int (representa la velocidad del vehículo,
   inicialmente 0).
   ■ Métodos:
   ■ Un método abstracto acelerar(int incremento), que
   aumente la velocidad del vehículo.
   ■ Un método frenar(int decremento) que disminuya la
   velocidad del vehículo, sin permitir que la velocidad sea
   negativa.
   ■ Métodos getters para obtener la marca y la velocidad.
   ○ Crea al menos dos subclases que hereden de Vehiculo, por ejemplo:
   ■ Coche: Un vehículo que puede acelerar a una velocidad estándar.
   ■ Moto: Un vehículo que acelera al doble de la velocidad estándar.
   ○ Crea una interfaz Electrico que tenga el siguiente método:
   ■ cargarBateria(): Método para cargar la batería de un vehículo
   eléctrico.
   ○ Crea una subclase AutoElectrico que herede de Coche y que
   implemente la interfaz Electrico. El vehículo eléctrico debe tener una
   batería cuyo nivel de carga disminuye al acelerar y que puede ser recargada
   con el método cargarBateria().
   ○ Nueva clase Deportivo que extienda de Coche:
   ■ El Deportivo debe tener un atributo turboActivo (booleano) que
   indique si el turbo está activado o no.
   ■ La clase Deportivo debe sobreescribir el método acelerar() de
   la clase Coche de manera que:
   ■ Si el turbo está activado, la aceleración sea el doble.
   ■ Si el turbo no está activado, el comportamiento sea igual al
   de un coche normal.
2. Comportamiento del Sistema:
   ○ El sistema debe permitir que:
   ■ Un Coche puede acelerar y frenar.
   ■ Una Moto acelere el doble que un coche y pueda frenar.
   ■ Un AutoEléctrico pueda acelerar, frenar, y cargar la batería. Si la
   batería está descargada, el auto no podrá acelerar hasta que se
   recargue.
   ■ Un Deportivo debe poder activar o desactivar el turbo, y acelerar
   dependiendo del estado del mismo.
   ○ Los métodos acelerar() y frenar() deben mostrar mensajes informando
   la marca del vehículo y su velocidad actual.
3. Encapsulación:
   ○ Utiliza modificadores de acceso (como private, protected, public)
   para asegurar que los atributos están encapsulados y no sean accesibles
   directamente desde fuera de las clases.
   ○ Implementa métodos getters y setters cuando sea necesario para
   acceder o modificar los atributos de los vehículos.
4. Polimorfismo:
   ○ Implementa polimorfismo en el método acelerar(). Cada tipo de vehículo
   debe tener su propia implementación del método, y el comportamiento debe
   ser diferente según la subclase que lo invoque.
   ○ Deportivo sobreescribe acelerar() para incluir la aceleración extra si el
   turbo está activado.
5. Interfaz:
   ○ Implementa la interfaz Electrico en la clase AutoElectrico, y asegúrate
   de que los vehículos eléctricos puedan cargar su batería y afecten su
   rendimiento al acelerar.
   Requerimientos Técnicos:
   ● Lenguaje: Java
   ● Principios de POO a utilizar:
   ○ Encapsulación (modificadores de acceso, getters/setters)
   ○ Herencia (subclases que extienden de la clase base)
   ○ Polimorfismo (sobreescritura de métodos)
   ○ Abstracción (clase abstracta e interfaz)
   ● El programa debe tener una clase Main que permita crear y simular vehículos
   interactuando con ellos (acelerar, frenar, cargar batería en el caso de vehículos
   eléctricos). 