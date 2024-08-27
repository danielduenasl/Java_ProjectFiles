
package grupo_progra1_2024_;

import java.io.IOException;
import java.util.*;

public class Grupo_Progra1_2024_ {  
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        
        String archivoPersonas = "C:\\Users\\PC\\Downloads\\Grupo_Progra1_2024_##\\Grupo_Progra1_2024_##\\src\\grupo_progra1_2024_\\Personas.txt";
        String archivoCursos = "C:\\Users\\PC\\Downloads\\Grupo_Progra1_2024_##\\Grupo_Progra1_2024_##\\src\\grupo_progra1_2024_\\Cursos.txt";
        String archivoAulas = "C:\\Users\\PC\\Downloads\\Grupo_Progra1_2024_##\\Grupo_Progra1_2024_##\\src\\grupo_progra1_2024_\\Aulas.txt";
        String archivoRegistroCursos = "C:\\Users\\PC\\Downloads\\Grupo_Progra1_2024_##\\Grupo_Progra1_2024_##\\src\\grupo_progra1_2024_\\registrocursos.txt";
        
        List<Personas> personas = new ArrayList<>();
        List<Cursos> cursos = new ArrayList<>();
        List<Aulas> aulas = new ArrayList<>();
        List<RegistroCursos> registroCursos = new ArrayList<>();
        
        personas = CargarDatos.cargarPersonas(archivoPersonas);
        cursos = CargarDatos.cargarCursos(archivoCursos);
        aulas = CargarDatos.cargarAulas(archivoAulas);
        registroCursos = CargarDatos.cargarRegistrosCursos(archivoRegistroCursos);
              
        boolean validacion = false; 
        
        do{
            System.out.print("\n\t----------------------------------------");
            System.out.print("\n\t-------------Bienvenidos----------------");
            System.out.print("\n\t----------------------------------------");
            System.out.print("\n\t1. Realizar un nuevo registro de persona. ");
            System.out.print("\n\t2. Mostrar registro de personas. ");
            System.out.print("\n\t3. Consultar un registro de persona. ");
            System.out.print("\n\t4. Realizar un nuevo registro de cursos. ");
            System.out.print("\n\t5. Mostrar registro de cursos. ");
            System.out.print("\n\t6. Consultar un registro de cursos.  ");
            System.out.print("\n\t7. Realizar un nuevo registro de aulas. ");
            System.out.print("\n\t8. Mostrar registro de aulas. ");
            System.out.print("\n\t9. Consultar un registro de aulas. ");
            System.out.print("\n\t10. Realizar un registro de asignatura. ");
            System.out.print("\n\t11. Mostrar registro de asignatura. ");
            System.out.print("\n\t12. Consultar registro de asignatura. ");
            System.out.print("\n\t13. Salir del programa. ");
            System.out.print("\n\tSeleccione una opcion: ");
            int opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    personas = registroPersona(personas);
                    GuardarDatos.guardarPersonas(archivoPersonas, personas);
                    break;
                    
                case 2: 
                    mostrarPersonas(personas);
                    break; 
                    
                case 3:
                    consultarPersona(personas, archivoPersonas);
                    break; 
                    
                case 4:
                    cursos = registroCurso(cursos);
                    GuardarDatos.guardarCursos(archivoCursos, cursos);
                    break; 
                    
                case 5:
                    mostrarCursos(cursos);
                    break; 
                    
                case 6:
                    consultarCurso(cursos, archivoCursos);
                    break;
                    
                case 7:
                    aulas = registroAulas(aulas);
                    GuardarDatos.guardarAulas(archivoAulas, aulas);
                    break;
                    
                case 8:
                    mostrarAulas(aulas);
                    break; 
                    
                case 9:
                    consultarAulas(aulas, archivoAulas);
                    break;
                    
                case 10:
                    registroCursos = registroAsignatura(registroCursos);
                    GuardarDatos.guardarRegistros(archivoRegistroCursos, registroCursos);
                    break;
                    
                case 11:
                    mostrarAsignaturas(registroCursos);
                    break;
                    
                case 12:
                    consultarAsignatura();
                    break;
                    
                case 13:
                    System.out.print("\n\tHAS SALIDO DEL PROGRAMA. \n");
                    validacion = true; 
                    break; 
                    
                default: 
                    System.out.print("\n\tNUMERO DE OPCION NO VALIDA. \n");
                    break; 
            }//FIN SWITCH
            
            
        }while(!validacion);
        
    }//FIN METODO MAIN 
    
    private static List<Personas> registroPersona(List<Personas> personas){
        
        Scanner entrada = new Scanner(System.in);
        Personas nuevaPersona = new Personas();
        
        System.out.print("\n\tIngrese el CUI: ");
        nuevaPersona.setCui(entrada.nextLine());
        System.out.print("\n\tIngrese el nombre: ");
        nuevaPersona.setNombres(entrada.nextLine());
        System.out.print("\n\tIngrese el apellido: ");
        nuevaPersona.setApellidos(entrada.nextLine());
        System.out.print("\n\tIngrese el numero de telefono: ");
        nuevaPersona.setNumeroCelular(entrada.nextLine());
        
        //boolean validacion = validarcui(nuevaPersona.getcui());
        //if validacion == true
        
        personas.add(nuevaPersona);
        
        return personas;
    }//FIN METODO registroPersona
    
    private static void mostrarPersonas(List<Personas> personas){
        
        System.out.println("Personas:");
            for (Personas persona : personas) {
                System.out.println(persona.getCui() + ", " + persona.getNombres() + ", " + persona.getApellidos() + ", " + persona.getNumeroCelular());
            }
        
    }//FIN METODO mostrarPersonas
    
    private static void consultarPersona(List<Personas> personas, String archivoPersonas) throws IOException{
        
        Scanner entrada = new Scanner(System.in);
        boolean validacion = false; 
        
        do{
            
             System.out.print("\n\t1. Consultar por CUI. ");
             System.out.print("\n\t2. Consultar por nombre. ");
             System.out.print("\n\t3. Consultar por apellido. ");
             System.out.print("\n\t4. Consultar por número de teléfono. ");
             System.out.print("\n\t5. Modificar un registro de persona. ");
             System.out.print("\n\t6. Regresar al menu principal. ");
             System.out.print("\n\tSelecciona el número de opción: ");
             int opcion = entrada.nextInt();
             
             switch(opcion){
                 case 1:
                    entrada = new Scanner(System.in);
                    System.out.print("\n\tIngresa el CUI: ");
                    String cuiBusqueda = entrada.nextLine();
                    boolean validacionCui = false;
                    for (Personas persona : personas) {
                        if (persona.getCui().equals(cuiBusqueda))
                        {
                            System.out.println(persona.getCui() + ", " + persona.getNombres() + ", " + persona.getApellidos() + ", " + persona.getNumeroCelular());
                            validacionCui = true;
                        }                      
                    }
                    if (validacionCui == false)
                    {
                        System.out.print("\n\tEl registro no existe ");
                    }
                    break;
                    
                case 2: 
                    entrada = new Scanner(System.in);
                    System.out.print("\n\tIngresa el nombre: ");
                    String nombreBusqueda = entrada.nextLine();
                    boolean validacionNombre = false;
                    for (Personas persona : personas) {
                        if (persona.getNombres().equals(nombreBusqueda))
                        {
                            System.out.println(persona.getCui() + ", " + persona.getNombres() + ", " + persona.getApellidos() + ", " + persona.getNumeroCelular());
                            validacionNombre = true;
                        }                      
                    }
                    if (validacionNombre == false)
                    {
                        System.out.print("\n\tEl registro no existe ");
                    }
                    break; 
                    
                case 3:
                    entrada = new Scanner(System.in);
                    System.out.print("\n\tIngresa el apellido: ");
                    String apellidoBusqueda = entrada.nextLine();
                    boolean validacionApellido = false;
                    for (Personas persona : personas) {
                        if (persona.getApellidos().equals(apellidoBusqueda))
                        {
                            System.out.println(persona.getCui() + ", " + persona.getNombres() + ", " + persona.getApellidos() + ", " + persona.getNumeroCelular());
                            validacionApellido = true;
                        }                      
                    }
                    if (validacionApellido == false)
                    {
                        System.out.print("\n\tEl registro no existe ");
                    }
                    break; 
                    
                case 4:
                    entrada = new Scanner(System.in);
                    System.out.print("\n\tIngresa el numero de cecular: ");
                    String numeroBusqueda = entrada.nextLine();
                    boolean validacionNumero = false;
                    for (Personas persona : personas) {
                        if (persona.getNumeroCelular().equals(numeroBusqueda))
                        {
                            System.out.println(persona.getCui() + ", " + persona.getNombres() + ", " + persona.getApellidos() + ", " + persona.getNumeroCelular());
                            validacionNumero = true;
                        }                      
                    }
                    if (validacionNumero == false)
                    {
                        System.out.print("\n\tEl registro no existe ");
                    }
                    break; 
                    
                case 5:
                    personas = ModificarPersona(personas);
                    GuardarDatos.guardarPersonas(archivoPersonas, personas);
                    break; 
                    
                case 6:
                   validacion = true; 
                    break; 
                    
                default: 
                    System.out.print("\n\tNUMERO DE OPCION NO VALIDA. \n");
                    break;
                 
             }//FIN SWITCH
        }while(!validacion);
        
    }//FIN METODO consultarPersona
    
    private static List<Cursos> registroCurso(List<Cursos> cursos){
        
        Scanner entrada = new Scanner(System.in);
        Cursos nuevaCurso = new Cursos();
        
        System.out.print("\n\tIngrese el codigo de curso: ");
        nuevaCurso.setCodigoCurso(entrada.nextLine());
        System.out.print("\n\tIngrese el nombre del curso: ");
        nuevaCurso.setNombre(entrada.nextLine());
        System.out.print("\n\tIngrese el semestre: ");
        nuevaCurso.setSemestre(entrada.nextLine());
        
        cursos.add(nuevaCurso);
        
        return cursos;
    }//FIN METODO registroCurso
    
    private static void mostrarCursos(List<Cursos> cursos){
        
        System.out.println("Cursos:");
            for (Cursos curso : cursos) {
                System.out.println(curso.getCodigoCurso() + ", " + curso.getNombre() + ", " + curso.getSemestre());
            }
            
    }//FIN METODO mostrarCursos
    
    private static void consultarCurso(List<Cursos> cursos, String archivoCursos) throws IOException{
        
        Scanner entrada = new Scanner(System.in);
        boolean validacion = false; 
        
        do{
            
             System.out.print("\n\t1. Consultar por código de curso. ");
             System.out.print("\n\t2. Consultar por nombre de curso. ");
             System.out.print("\n\t3. Mostrar todos los registros. ");
             System.out.print("\n\t4. Modificar un registro de cursos. ");
             System.out.print("\n\t5. Regresar al menu principal. ");
             System.out.print("\n\tSelecciona el número de opción: ");
             int opcion = entrada.nextInt();
             
             switch(opcion){
                 case 1:
                    entrada = new Scanner(System.in);
                    System.out.print("\n\tIngresa el codigo de curso: ");
                    String codCursoBusqueda = entrada.nextLine();
                    boolean validacionCodCurso = false;
                    for (Cursos curso : cursos) {
                        if (curso.getCodigoCurso().equals(codCursoBusqueda))
                        {
                            System.out.println(curso.getCodigoCurso() + ", " + curso.getNombre() + ", " + curso.getSemestre());
                            validacionCodCurso = true;
                        }                      
                    }
                    if (validacionCodCurso == false)
                    {
                        System.out.print("\n\tEl registro no existe ");
                    }
                    break;
                    
                case 2: 
                    entrada = new Scanner(System.in);
                    System.out.print("\n\tIngresa el nombre del curso: ");
                    String nombreCursoBusqueda = entrada.nextLine();
                    boolean validacionNombreCurso = false;
                    for (Cursos curso : cursos) {
                        if (curso.getNombre().equals(nombreCursoBusqueda))
                        {
                            System.out.println(curso.getCodigoCurso() + ", " + curso.getNombre() + ", " + curso.getSemestre());
                            validacionNombreCurso = true;
                        }                      
                    }
                    if (validacionNombreCurso == false)
                    {
                        System.out.print("\n\tEl registro no existe ");
                    }
                    break; 
                    
                case 3:
                    mostrarCursos(cursos);
                    break; 
                    
                case 4:
                    ModificarCursos(cursos);
                    GuardarDatos.guardarCursos(archivoCursos, cursos);
                    break; 
                
                case 5:
                    validacion = true; 
                    break; 
                   
                default: 
                    System.out.print("\n\tNUMERO DE OPCION NO VALIDA. \n");
                    break;
                 
             }//FIN SWITCH
        }while(!validacion);
        
    }//FIN METODO consultarCurso
    
    private static List<Aulas> registroAulas(List<Aulas> aulas){
        
        Scanner entrada = new Scanner(System.in);
        Aulas nuevaAula = new Aulas();
        
        System.out.print("\n\tIngrese el numero de aula: ");
        nuevaAula.setNumeroAula(entrada.nextLine());
        System.out.print("\n\tIngrese la ubicacion: ");
        nuevaAula.setUbicacion(entrada.nextLine());
        System.out.print("\n\tIngrese la capacidad de escritorios: ");
        nuevaAula.setCapacidadEscritorios(entrada.nextLine());
        
        aulas.add(nuevaAula);
        
        return aulas;
    }//FIN METODO registroAulas
    
    private static void mostrarAulas(List<Aulas> aulas){
        
        System.out.println("Aulas:");
            for (Aulas aula : aulas) {
                System.out.println(aula.getNumeroAula() + ", " + aula.getUbicacion() + ", " + aula.getCapacidadEscritorios());
            }
        
    }//FIN METODO mostrarAulas
    
    private static void consultarAulas(List<Aulas> aulas, String archivoAulas) throws IOException{
        
        Scanner entrada = new Scanner(System.in);
        boolean validacion = false; 
        
        do{
            
             System.out.print("\n\t1. Consultar por número de aula. ");
             System.out.print("\n\t2. Mostrar todos los registros. ");
             System.out.print("\n\t3. Modificar un registro de una aula. ");
             System.out.print("\n\t4. Regresar al menu principal. ");
             System.out.print("\n\tSelecciona el número de opción: ");
             int opcion = entrada.nextInt();
             
             switch(opcion){
                 case 1:
                    entrada = new Scanner(System.in);
                    System.out.print("\n\tIngresa el numero de aula: ");
                    String numAulaBusqueda = entrada.nextLine();
                    boolean validacionNumAula = false;
                    for (Aulas aula : aulas) {
                        if (aula.getNumeroAula().equals(numAulaBusqueda))
                        {
                            System.out.println(aula.getNumeroAula() + ", " + aula.getUbicacion() + ", " + aula.getCapacidadEscritorios());
                            validacionNumAula = true;
                        }                      
                    }
                    if (validacionNumAula == false)
                    {
                        System.out.print("\n\tEl registro no existe ");
                    }
                    break;
                    
                case 2: 
                    mostrarAulas(aulas);
                    break; 
                    
                case 3:
                    ModificarAulas(aulas);
                    GuardarDatos.guardarAulas(archivoAulas, aulas);
                    break; 
                    
                case 4:
                    validacion = true; 
                    break;
                    
                default: 
                    System.out.print("\n\tNUMERO DE OPCION NO VALIDA. \n");
                    break;
                 
             }//FIN SWITCH
        }while(!validacion);
        
    }//FIN METODO consultarAulas
    
    private static List<RegistroCursos> registroAsignatura(List<RegistroCursos> registroCursos){
        
        Scanner entrada = new Scanner(System.in);
        RegistroCursos nuevoRegistro = new RegistroCursos();
        
        System.out.print("\n\tIngrese el CUI: ");
        nuevoRegistro.setCui(entrada.nextLine());
        System.out.print("\n\tIngrese el codigo de curso: ");
        nuevoRegistro.setCodigoCurso(entrada.nextLine());
        System.out.print("\n\tIngrese el numero de aula: ");
        nuevoRegistro.setNumeroAula(entrada.nextLine());
        System.out.print("\n\tIngrese el numero de horario de aula: ");
        nuevoRegistro.setHorarioAula(entrada.nextLine());
        System.out.print("\n\tIngrese la fecha: ");
        nuevoRegistro.setFecha(entrada.nextLine());
        
        registroCursos.add(nuevoRegistro);
        
        return registroCursos;
    }//FIN METODO registroAsignatura
    
    private static void mostrarAsignaturas(List<RegistroCursos> registroCursos){
        
        System.out.println("Personas:");
            for (RegistroCursos registrocurso : registroCursos) {
                System.out.println(registrocurso.getCui() + ", " + registrocurso.getCodigoCurso() + ", " + registrocurso.getNumeroAula() + ", " + registrocurso.getHorarioAula() + ", " + registrocurso.getFecha());
            }
        
    }//FIN METODO mostrarAsignaturas
    
    private static void consultarAsignatura(){
        
    }//FIN METODO consultarAsignatura
    
     private static List<Personas> ModificarPersona(List<Personas> personas){

        Scanner entrada = new Scanner(System.in);
        Personas nuevaPersona = new Personas();
        
        System.out.print("\n\tIngresa el CUI de la persona a modificar: ");
        String cuiBusqueda = entrada.nextLine();
        boolean validacionCui = false;

        for (Personas persona : personas) {
            if (persona.getCui().equals(cuiBusqueda)) {
                System.out.println("\n\tRegistro encontrado:");

                System.out.print("\n\tIngrese el nombre: ");
                persona.setNombres(entrada.nextLine());

                System.out.print("\n\tIngrese el apellido: ");
                persona.setApellidos(entrada.nextLine());

                System.out.print("\n\tIngrese el numero de telefono: ");
                persona.setNumeroCelular(entrada.nextLine());
                
                System.out.print("\n\tRegistro actualizado con exito ");
                validacionCui = true;
                break;
            }
        }
        if (validacionCui == false)
        {
            System.out.print("\n\tEl registro no existe, crea uno nuevo: ");
            
            System.out.print("\n\tIngrese el CUI: ");
            nuevaPersona.setCui(entrada.nextLine());
            System.out.print("\n\tIngrese el nombre: ");
            nuevaPersona.setNombres(entrada.nextLine());
            System.out.print("\n\tIngrese el apellido: ");
            nuevaPersona.setApellidos(entrada.nextLine());
            System.out.print("\n\tIngrese el numero de telefono: ");
            nuevaPersona.setNumeroCelular(entrada.nextLine());

            System.out.print("\n\tNuevo registro creado con exito ");
            personas.add(nuevaPersona);
        }
        
        return personas;
    }//FIN METODO
     
    private static List<Cursos> ModificarCursos(List<Cursos> cursos){

        Scanner entrada = new Scanner(System.in);
        Cursos nuevoCurso = new Cursos();
        
        System.out.print("\n\tIngresa el codigo del curso a modificar: ");
        String codCursoBusqueda = entrada.nextLine();
        boolean validacionCodCurso = false;

        for (Cursos curso : cursos) {
            if (curso.getCodigoCurso().equals(codCursoBusqueda)) {
                System.out.println("\n\tRegistro encontrado:");

                System.out.print("\n\tIngrese el nombre del curso: ");
                curso.setNombre(entrada.nextLine());
                System.out.print("\n\tIngrese el semestre: ");
                curso.setSemestre(entrada.nextLine());
                
                System.out.print("\n\tRegistro actualizado con exito ");
                validacionCodCurso = true;
                break;
            }
        }
        if (validacionCodCurso == false)
        {
            System.out.print("\n\tEl registro no existe, crea uno nuevo: ");
        
            System.out.print("\n\tIngrese el codigo de curso: ");
            nuevoCurso.setCodigoCurso(entrada.nextLine());
            System.out.print("\n\tIngrese el nombre del curso: ");
            nuevoCurso.setNombre(entrada.nextLine());
            System.out.print("\n\tIngrese el semestre: ");
            nuevoCurso.setSemestre(entrada.nextLine());
            
            System.out.print("\n\tNuevo registro creado con exito ");
            cursos.add(nuevoCurso);
        }
        
        return cursos;
    }//FIN METODO
    
    private static List<Aulas> ModificarAulas(List<Aulas> aulas){

        Scanner entrada = new Scanner(System.in);
        Aulas nuevaAula = new Aulas();
        
        System.out.print("\n\tIngresa el codigo del curso a modificar: ");
        String numAulaBusqueda = entrada.nextLine();
        boolean validacionNumAula = false;

        for (Aulas aula : aulas) {
            if (aula.getNumeroAula().equals(numAulaBusqueda)) {
                System.out.println("\n\tRegistro encontrado:");

                System.out.print("\n\tIngrese la ubicacion: ");
                aula.setUbicacion(entrada.nextLine());
                System.out.print("\n\tIngrese la capacidad de escritorios: ");
                aula.setCapacidadEscritorios(entrada.nextLine());
                
                System.out.print("\n\tRegistro actualizado con exito ");
                validacionNumAula = true;
                break;
            }
        }
        if (validacionNumAula == false)
        {
            System.out.print("\n\tEl registro no existe, crea uno nuevo: ");

            System.out.print("\n\tIngrese el numero de aula: ");
            nuevaAula.setNumeroAula(entrada.nextLine());
            System.out.print("\n\tIngrese la ubicacion: ");
            nuevaAula.setUbicacion(entrada.nextLine());
            System.out.print("\n\tIngrese la capacidad de escritorios: ");
            nuevaAula.setCapacidadEscritorios(entrada.nextLine());

            System.out.print("\n\tNuevo registro creado con exito ");
            aulas.add(nuevaAula);
        }
        
        return aulas;
    }//FIN METODO
    
}//FIN CLASE
