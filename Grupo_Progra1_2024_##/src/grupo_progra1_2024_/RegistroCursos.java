
package grupo_progra1_2024_;

public class RegistroCursos {
    
    //ATRIBUTOS
    private String cui;
    private String codigoCurso;
    private String numeroAula;
    private String horarioAula;
    private String fecha;
    
    //CONSTRUCTOR VACIO
    public RegistroCursos() {
    }
    
    
    //CONSTRUCTOR
    public RegistroCursos(String cui, String codigoCurso, String numeroAula, String horarioAula, String fecha) {
        this.cui = cui;
        this.codigoCurso = codigoCurso;
        this.numeroAula = numeroAula;
        this.horarioAula = horarioAula;
        this.fecha = fecha;
    }
    
    //METODOS GETTERS
    public String getCui() {
        return cui;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getNumeroAula() {
        return numeroAula;
    }

    public String getHorarioAula() {
        return horarioAula;
    }

    public String getFecha() {
        return fecha;
    }
    
    //METODOS SETTERS
    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setNumeroAula(String numeroAula) {
        this.numeroAula = numeroAula;
    }

    public void setHorarioAula(String horarioAula) {
        this.horarioAula = horarioAula;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}//FIN CLASE REGISTRO CURSOS
