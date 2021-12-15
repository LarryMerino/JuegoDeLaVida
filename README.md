
# El Juego de la vida

## Introducción

El concepto es sencillo, todo se desarrolla en un tablero de dos dimensiones donde existen células activas e inactivas
Antes de iniciar la partida, se ha de decidir dónde se quieren colacar las células activas. Un vez definida la ubicación de las células, comieza el juego.
Cada célula tiene tiene 8 células vecinas y serán estas las que determinen qué pasará en cada turno siguiendo las siguientes reglas:

1. Una célula inactiva con **exactamente 3** células vecinas activas, **se activa**.
2. Una célula activa con **2 o 3 células vecinas activas sigue activa**, de lo contrario se desactiva por soledad o superpoblación.