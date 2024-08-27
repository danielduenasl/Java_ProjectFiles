
package grupo_progra1_2024_;

import java.io.*;
import java.util.*;
public class EscribirArchivo {
    
    public static void main(String[] args) {
        escrituraArchivo();
    }//FIN PSVM
    
    //METODO ESCRITURA EN EL ARCHIVO
    public static void escrituraArchivo(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\n\tDIGITA EL NOMBRE DEL ARCHIVO A ABRIR: ");
        String nombreArchivo = entrada.nextLine();
        
        try{
            
            FileWriter escritura = new FileWriter(nombreArchivo);
            System.out.print("\n\tDIGITA EL TEXTO DEL ARCHIVO: ");
            String textoArchivo = entrada.nextLine();
            escritura.write(textoArchivo);
            escritura.close();
            
        }catch(IOException e){
            System.out.print("\n\tOCURRIO UN ERROR AL ESCRIBIR EN EL ARCHIVO. "+e.getMessage()+"\n");
        }
        
    }//FIN METODO escrituraArchivo
}//FIN CLASE ESCRIBIR ARCHIVO
