
# DDS - Que me pongo iteración II
>**Requerimientos**:
https://docs.google.com/document/d/10j6XB9zIhl5xox2xBEDEFsgPmueHMkyvLSHcLxl_27Y/edit#
## Diagrama de Clases
![Diagrama de Clases](./classDiagram/diagramIteracionII.png)
## Consideraciones
Las prendas siguen siendo **inmutables**, para poder tener un borrador de la prenda que se va creado de a poco, se utiliza
`BorradorPrenda` que es un **_Builder_** con los mismos parámetros de la clase Prenda, esta por el requiriemento de ir
creando de a poco no es inmutable, una vez que se configurar podemos crear la prenda completa, como no se va a crear una
prenda sin el `BorradorPrenda`, podemos sacar las validaciones de los parámetros validos de `Prenda` y dejarlas en el
_**Builder**_.

La `Prenda` conoce su `Trama`, es responsabilidad de quien crea la prenda(`BorrdorPrenda`) que esta este relacionada correctamente.

Un `Uniforme` se crea con un _**FactoryMethod**_, para cada tipo de uniforme que se necesite se creará un clase que extienda
a `UniformeFactory` y se encargue de configurar los parámetros correctos para las prendas del `Uniforme`.

# DDS - Que me pongo iteración I
>**Requerimientos**:
https://docs.google.com/document/d/1k1f-9AuIohlBGB2soSNePJ6jLxM37_tZeSD-hW_esIQ/edit#
## Diagrama de Clases
![Diagrama de Clases](./classDiagram/diagramIteracionI.png)
## Consideraciones

El conjunto de Materiales, Tipos y Categorias a modelar es finito y no se espera que varie demasiado en el tiempo,
esto nos permite abstraer estas entidades como Enum.

En el caso particular del TipoPrenda, al definirlas las asociamos a la su categoria correspondiente; el tipo y la
están fuertemente acoplados, el tipo no puede cambiar de categoria en tiempo de ejecucion y viceversa. Desde el punto
de vista de la prenda, solo hace falta que conozca su tipo de prenda.

Decido no definir una clase color y optar por la Clase color de java.awt.Color, esta permite instanciar colores mediante
RGB o algunos colores predefinidos(BLACK, WHITE, BLUE...)

Al momento de crear una prenda, se valida que los atributos esenciales no sean nulos, fallando en el caso de que asi sea.
