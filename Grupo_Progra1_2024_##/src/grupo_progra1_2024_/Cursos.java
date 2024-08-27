
package grupo_progra1_2024_;

public class Cursos {
    
    //ATRIBUTOS
    private String codigoCurso;
    private String nombre;
    private String semestre;
    
    //CONSTRUCTOR VACIO
    public Cursos() {
    }
    
    
    //CONSTRUCTOR
    public Cursos(String codigoCurso, String nombre, String semestre) {
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.semestre = semestre;
    }
    
    //METODOS GETTERS
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSemestre() {
        return semestre;
    }
    
    //METODOS SETTERS
    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
}//FIN CLASE CURSOS
