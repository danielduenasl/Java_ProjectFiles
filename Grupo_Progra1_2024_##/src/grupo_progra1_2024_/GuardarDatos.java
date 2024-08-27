
package grupo_progra1_2024_;

import java.io.*;
import java.util.*;

public class GuardarDatos {
    
    public static void guardarPersonas(String archivo, List<Personas> personas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Personas persona : personas) {
                bw.write(persona.getCui() + "," + persona.getNombres() + "," + persona.getApellidos() + "," + persona.getNumeroCelular());
                bw.newLine();
            }
        }
    }

    public static void guardarCursos(String archivo, List<Cursos> cursos) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Cursos curso : cursos) {
                bw.write(curso.getCodigoCurso() + "," + curso.getNombre() + "," + curso.getSemestre());
                bw.newLine();
            }
        }
    }

    public static void guardarAulas(String archivo, List<Aulas> aulas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Aulas aula : aulas) {
                bw.write(aula.getNumeroAula() + "," + aula.getUbicacion() + "," + aula.getCapacidadEscritorios());
                bw.newLine();
            }
        }
    }

    public static void guardarRegistros(String archivo, List<RegistroCursos> registros) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (RegistroCursos registro : registros) {
                bw.write(registro.getCui() + "," + registro.getCodigoCurso() + "," + registro.getNumeroAula() + "," + registro.getHorarioAula() + "," + registro.getFecha());
                bw.newLine();
            }
        }
    }
    
}
