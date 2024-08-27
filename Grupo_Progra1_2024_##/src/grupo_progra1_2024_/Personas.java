
package grupo_progra1_2024_;

public class Personas {
    
    //ATRIBUTOS
    private String cui;
    private String nombres;
    private String apellidos;
    private String numeroCelular;

    //CONSTRUCTOR VACIO
    public Personas() {
    }
    
    
    //CONSTRUCTOR
    public Personas(String cui, String nombres, String apellidos, String numeroCelular) {
        this.cui = cui;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCelular = numeroCelular;
    }
    
    //METODOS GETTERS
    public String getCui() {
        return cui;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }
    
    //METODOS SETTERS
    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
}//FIN CLASE PERSONA
