/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo;

/**
 *
 * @author TOSHIBA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LeerArchivoTexto aplicacion1 = new LeerArchivoTexto();
    OperacionData operacion = new OperacionData();

      aplicacion1.abrirArchivo();
      operacion.agregarInformacion(aplicacion1.leerRegistros());
      
      System.out.printf("El promedio es: %f", operacion.obtenerPormedio());
      aplicacion1.leerRegistros(); // clientes.txt
      // aplicacion.leerRegistros2(); // datos.txt
      aplicacion1.cerrarArchivo();
    }
    
    }
    
