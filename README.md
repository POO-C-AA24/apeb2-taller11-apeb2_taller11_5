# Taller 11-12 (Laboratorio grupal)

## Elaboración de ejercicios sobre Polimorfismo a través de Diagramas UML
## Elaboración de ejercicios mediante código haciendo uso del concepto de Polimorfismo en Programación Orientada a Objetos

* Leer detenidamente cada problemática propuesta.
* Usar el programa **DIA-UML** _(Open source)_ para generar la representación de su solución _(modelado)_, vía diagramas de clases.
* Para cada diagrama/solución _(modelado de su solución)_, genere/agregue 2 archivos _(fuente e img: \*.dia y \*.png \*.jpeg, etc)_. No olvide titular a cada clase, con el nombre representativo del análisis/solución. Para el nombre de cada archivo use el formato: _Problema-NroProbl_NombClase_. Ejemplo **Problema-1_Trabajador**. Todos estos archivos agréguelos en el subDirectorio: **Modelos_UML**
* En el subDirectorio **Solucion_Codigo** cree un único proyecto NetBeans - _Java Aplication_ (o con el IDE de su preferencia) y en él, agregue todas las clases necesarias para la solución de cada problema _(no use paquetes aun)_. Y para facilitar la revisión, utilice para la clase base el formato _Problema-NroProbl_NombClaseBase_, y para la clase de prueba/ejecutor use _Problema-NroProbl_NombClaseEjecutor_ (Ésta última es la clase de prueba que genera/instancia con objetos cada entidad/clase y verifica su funcionalidad). 
* Respete la arquitectura **MVC**, es decir, no implemente entradas/salidas desde/hacia teclado-consola directamente en la clase base. Los datos de entrada y resultados deben ser ingresados/mostrados desde/hacia teclado-consola, en la clase de prueba/ejecutor.
* Para retornar los datos del objeto, usar el método _**toString()**_, vía cadena con formato legible. 
___

## Problema 1 - Juego de roles

En un juego de rol, se desea implementar un sistema de combate en el que participen diferentes tipos de **personajes**: **guerreros**, **magos** y **arqueros**. Cada personaje tiene atributos y habilidades únicas, así como diferentes métodos de _ataque_ y _defensa_.

El objetivo del juego es enfrentar a los personajes en batallas y determinar el ganador en función de sus habilidades, estrategias y atributos. Los **guerreros** se destacan por su fuerza y habilidades cuerpo a cuerpo, los **magos** por sus hechizos y poderes mágicos, y los **arqueros** por su precisión y habilidades a distancia.

El sistema debe permitir crear nuevos personajes de cada tipo, asignarles atributos iniciales, como _puntos de vida_ y _nivel de experiencia_, y permitirles _subir de nivel_ a medida que ganan batallas. Además, se debe implementar un algoritmo de combate que evalúe las habilidades de cada personaje y determine el resultado de la batalla.

Utilizando programación orientada a objetos, herencia y polimorfismo, implementa el sistema de combate y las clases necesarias para representar a los diferentes tipos de personajes. Asegúrate de que cada tipo de personaje tenga sus propias habilidades y métodos de ataque y defensa, y que puedan interactuar entre sí en las batallas.

> [!Note]
> Para solucionar lo anterior se debe generar lo siguiente:
> 
> - Un diagrama exclusivo que involucren las funcionalidades principales del juego.
> - Una solución en lenguaje de programación Java. Usar Polimorfismo en la solución.
> - Clase de prueba/ejecutor, que demuestre la funcionalidad del juego.


## Problema 2 - Restaurant

En un restaurant se tiene diferentes tipos de **menú** para ofrecer a los clientes. Una cuenta por pagar está compuesta por características como: _nombre del cliente, listado de todos las cartas(menú) solicitados por el cliente, valor a cancelar total, subtotal, Iva._

Los tipos de menú del restaurant son:

**Menú a la carta**

- nombre del plato
- valor del menú
- valor inicial del menú
- valor de porción de guarnición
- valor de bebida
- porcentaje adicional por servicio en relación del valor inicial del menú

**Menú del día**

- nombre del plato
- valor del menú
- valor inicial del menú
- valor de postre
- valor de bebida

**Menú de niños**

- nombre del plato
- valor del menú
- valor inicial del menú
- valor de porción de helado
- valor de porción de pastel

**Menú económico**

- nombre del plato
- valor del menú
- valor inicial del menú
- porcentaje de descuento, en referencia al valor inicial del menú

> [!Note]
> Para solucionar lo anterior se debe generar lo siguiente:
> 
> - Un diagrama exclusivo que involucren las clases de tipo Menú (usar polimorfismo)
> - Una solución en lenguaje de programación Java. Usar Polimorfismo en la solución.
> Hacer uso del método **_toString()_** para presentar toda la información posible del objeto (nombre del cliente, subtotal, iva, listado de todos los menú, valor a cancelar a total.
