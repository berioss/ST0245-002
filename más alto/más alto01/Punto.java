/**
 * La clase Punto tiene la intención de coordenadas en el espacio y calcular su distancia.
 * 
* @author Mauricio Toro, Andrés Páez
 * @version 1
 */

 clase pública Punto {

    doble privado  x, y;

    /**
     * Se inicializan los atributos de clase
     */
    punto público (doble x, doble y) {

    }

    /**
     * Método para obtener la variable global x.
     *
     * @return eje coordenado x
     */
    público doble x() {

    }

    /**
     * Método para obtener la variable global y.
     *
     * @return eje coordenado y
     */
    público doble y() {

    }

    /**
 * Método para la radio polar, en este caso se obtiene por medio del teorema de pitágoras.
     * 
     *
     * @return radio polar
     *
     * @see <a href"http://mathworld.wolfram.com/PolarCoordinates.html"> Ver más <a/>
     */
    
    público doble radiopolar() {

    }


    /**
     * Método para obtener el ángulo polar, en este caso se puede obtener por medio de la tangente inversa.
     * 
     *
     * @return angulo polar
     *
     * @see <a href"http://mathworld.wolfram.com/PolarCoordinates.html"> Ver más <a/>
     */
    público doble anguloPolar() {

    }

    /**
 * Método para la distacia euclidiana. La distacia
 * euclidiana o euclídea es la distancia "ordinaria" (que se mediría con una regla) 
     * dos puntos de un espacio euclídeo, la cual se deduce a partir del teorema de Pitágoras.
     * En otras palabras es halla el radio polar a la diferencia entre los dos puntos.
     *
     *
     *
     * @return distancia euclidiana (radio polar a la diferencia de dos puntos)
     *
     * @param otro Este parámetro referencia hace a otro Punto en el espacio con es cual desea
 * la habitación del Punto desde el cual fue llamado.
     * @see <a href"http://mathworld.wolfram.com/Distance.html"> Ver más <a/>
     */
  
    doble  distanciaEuclidianapública (Punto otro) {
        
    }
}
