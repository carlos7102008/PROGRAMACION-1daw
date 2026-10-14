


/* COMENTARIOS */
/* En este programa calculamos el combustible exacto, aplicando los margenes de seguridad y el precio de ese combustible para el lanzamiento del cohete Artemis-X,  y convertimos los importes

finales a presupuestos enteros para el departamento de contabilidad.*/

public class Examen_1 {
    public static void main(String[] args) {
        
        // Constante del consumo por km. Permite decimales y no se puede cambiar el contenido de esta en todo el codigo ya que es constante  //
         final double consumo_por_km = 14.75;
         
        // Contante de la reserva de seguridad. No permite decimales y no se puede cambiar el contenido de esta en todo el codigo ya que es contante//
         final int reserva_seguridad = 500;
         
        // Declaramos la distancia que vamos a transitar . No permite decimales//
         int distanciaKM = 4804 ; 
         
        // declaramos a cuanto vale el litro. Este tipo de viriable permite decimales //

         double precioLitro = 2.35 ;
         
         
        /* Calculamos el total de litros que vamos a gastar en el viaje, multiplicando la distancia por el consumo y sumandole la reserva.
         Este tipo de variable permite decimales */
        
         double totalesLitros = (distanciaKM * consumo_por_km) + reserva_seguridad;
         
        /* Calculamos cuanto nos va a costar el viaje, multiplicando los litros totales por lo que vale el litro.
         Este tipo de viriable permite decimales */
        
         double totalExacto = totalesLitros * precioLitro;
         
         
        // Truncaos el total de litros para facilitar la contabilidad //
         int litrosOficialesComprar = (int) totalesLitros;
        // truncamos el coste total  para facilitar la contabilidad//
         int CostePresupuestado = (int) totalExacto ;
         
        // al convertir las variables tipo doubles por tipo int eliminamos los decimales  truncandolos. //
        
        // Mostramos por pantalla los datos //
         System.out.println("Consumo por km: \n " + consumo_por_km);
         System.out.println("Reserva de combustible por seguridad: \n " + reserva_seguridad);
         System.out.println("Distancia en km del viaje \n " + distanciaKM);
         System.out.println("Precio del litro de combustible \n " + precioLitro );
        
        // Mostramos los resultados totales por pantalla //
         System.out.println("Total de litros: \n " + totalesLitros);
         System.out.println("Precio total: \n" + totalExacto );
         System.out.println("Litros comprados truncados: \n " + litrosOficialesComprar );
         System.out.println("Coste total truncado \n"+ CostePresupuestado);
        
         // trabajo realizado por CARLOS MARQUEZ COZAR //
         // 13/10/2026 //
    }
}
