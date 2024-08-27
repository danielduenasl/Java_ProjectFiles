
package grupo_progra1_2024_;

public class Aulas {
    
    //ATRIBUTOS
    private String numeroAula;
    private String ubicacion;
    private String capacidadEscritorios;
    
    //CONSTRUCTOR VACIO
    public Aulas() {
    }
    
    
    //CONSTRUCTOR
    public Aulas(String numeroAula, String ubicacion, String capacidadEscritorios) {
        this.numeroAula = numeroAula;
        this.ubicacion = ubicacion;
        this.capacidadEscritorios = capacidadEscritorios;
    }
    
    //METODOS GETTERS
    public String getNumeroAula() {
        return numeroAula;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCapacidadEscritorios() {
        return capacidadEscritorios;
    }
    
    //METODOS SETTERS
    public void setNumeroAula(String numeroAula) {
        this.numeroAula = numeroAula;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCapacidadEscritorios(String capacidadEscritorios) {
        this.capacidadEscritorios = capacidadEscritorios;
    }
    
}//FIN CLASE AULAS
