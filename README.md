
#DDS - Que me pongo iteración II
>**Requerimientos**:
https://docs.google.com/document/d/10j6XB9zIhl5xox2xBEDEFsgPmueHMkyvLSHcLxl_27Y/edit#
## Diagrama de Clases
![Diagrama de Clases](./classDiagram/diagramIteracionII.png)
## Consideraciones
La prenda conoce su trama, es responsabilidad de quien crea la prenda que esta este relacionada correctamente.

Los uniformes tienen una referencia a Prenda por cada prenda que deben tener, 

Los uniformes se crean con un FactoryMethod para cada tipo de uniforme que se necesite en la Clase UniformeFactory

#DDS - Que me pongo iteración I
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
