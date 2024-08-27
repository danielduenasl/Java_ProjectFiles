
package grupo_progra1_2024_;

import java.io.*;
import java.util.*;

public class CargarDatos {
    
    public static List<Personas> cargarPersonas(String archivo) throws IOException {
        List<Personas> personas = new ArrayList<>();
        Personas nuevaPersona;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nuevaPersona = new Personas();
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    nuevaPersona.setCui(datos[0]);
                    nuevaPersona.setNombres(datos[1]);
                    nuevaPersona.setApellidos(datos[2]);
                    nuevaPersona.setNumeroCelular(datos[3]);
                    personas.add(nuevaPersona);
                }
            }
        }
        return personas;
    }

    public static List<Cursos> cargarCursos(String archivo) throws IOException {
        List<Cursos> cursos = new ArrayList<>();
        Cursos nuevoCurso;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nuevoCurso = new Cursos();
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    nuevoCurso.setCodigoCurso(datos[0]);
                    nuevoCurso.setNombre(datos[1]);
                    nuevoCurso.setSemestre(datos[2]);
                    cursos.add(nuevoCurso);
                }
            }
        }
        return cursos;
    }

    public static List<Aulas> cargarAulas(String archivo) throws IOException {
        List<Aulas> aulas = new ArrayList<>();
        Aulas nuevaAula;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nuevaAula = new Aulas();
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    nuevaAula.setNumeroAula(datos[0]);
                    nuevaAula.setUbicacion(datos[1]);
                    nuevaAula.setCapacidadEscritorios(datos[2]);
                    aulas.add(nuevaAula);
                }
            }
        }
        return aulas;
    }

    public static List<RegistroCursos> cargarRegistrosCursos(String archivo) throws IOException {
        List<RegistroCursos> registros = new ArrayList<>();
        RegistroCursos nuevoRegistro;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nuevoRegistro = new RegistroCursos();
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    nuevoRegistro.setCui(datos[0]);
                    nuevoRegistro.setCodigoCurso(datos[1]);
                    nuevoRegistro.setNumeroAula(datos[2]);
                    nuevoRegistro.setHorarioAula(datos[3]);
                    nuevoRegistro.setFecha(datos[4]);
                    registros.add(nuevoRegistro);
                }
            }
        }
        return registros;
    }
    
}
