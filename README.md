DDS - Que me pongo iteración I

## Diagrama de Clases
![Diagrama de Clases](http://www.plantuml.com/plantuml/png/XL9FQ-f043zdFiNWIHycyAuFNp1D8rYiaQYNNiesBY8asR2xmPRYT--O7LDZXLwoEpk_-VqPCZLMQDkK1UI5C0OZsyXgfpx1MnoCdQmqLIB4kZqDUBdGUw7Tyz2zZk04icfAV1PMweCeN9Sedf9eEKO4BzucMGedp-5YmkqL8JlWAiesoUjwkqgoUPgvaMZn4ZscvpktvylPTpkAusITKhacMlRUqMqEjN85Mhg2rtU69PSSCbQ5qY7cvqDIHl0Ub2fGxBMah6rts7unfwminXfEy2OHvfUQuEBDM2roo_PcT5NwuvxBNCjkjQsPSUTqzC-z4zybhAYiA5J5V2ZVBG7CRohu7ojvl78_x2_t71201tm_l4B2pHOdVbFxhDTDxDInegd1to3uCy1sQz1HECQRPK7FCVOb-xqW2F5-ewcfvTH-s0om3qOUPfESWtzycDAtAOil)
## Consideraciones
Las prendas no pueden tener atributos vacíos, el proceso de creación de una prenda se puede complicar debido a la cantidad de atributos, para mantener consistencia podemos emplear algún patrón creacional que abstraiga la creación de estos objetos y nos los entregue listos para usar.

El uso del patrón debe permitir que la configuracion de la prenda tenga sentido, no debe existir una prenda "Remera" de tipo "Calzado"

Decido utilizar el patrón *Factory Method*, que me permite separar la creación de una prenda del los objetos que usen a las prendas, teniendo una clase que extienda a *PrendaFactory* para obtener una prenda y mantener una coherencia con el tipo y categoría de prenda, ejemplo *PantaloFactory* tiene categoría *ParteSuperior* y tipo Pantalón.

¿Qué es una prenda válida para un atuendo? Aquella que se obtiene mediante un *factory*, o una prenda cuyo tipo no exista aún en el atuendo(no quisiera tener dos prendas inferiores en el atuendo?, pero si podría tener más de un accesorio?).