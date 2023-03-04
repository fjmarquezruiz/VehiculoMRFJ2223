
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        int stockActual = operativaVehiculosMarquezRuizFcoJavier2223(50);
        System.out.println("El stock actual es"+ stockActual );
    }

    private static int operativaVehiculosMarquezRuizFcoJavier2223(int cantidad) {
        VehiculoMarquezRuizFcoJavier2223 miVehiculoMarquezRuizFcoJavier2223;
        int stockActual;
        miVehiculoMarquezRuizFcoJavier2223 = new VehiculoMarquezRuizFcoJavier2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMarquezRuizFcoJavier2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMarquezRuizFcoJavier2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMarquezRuizFcoJavier2223.obtenerStock();
        return stockActual;
    }

}
    
