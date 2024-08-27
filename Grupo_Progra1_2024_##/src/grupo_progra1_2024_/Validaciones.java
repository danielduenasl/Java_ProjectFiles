
package grupo_progra1_2024_;


public class Validaciones {
    
    public static boolean esCuiValido(String cui) {
        // Validar que la longitud sea 13
        if (cui.length() != 13) {
            return false;
        }

        // Validar que todos los caracteres sean números
        if (!cui.matches("\\d+")) {
            return false;
        }

        // Validar que los primeros 9 dígitos sean números
        String primerosNueve = cui.substring(0, 9);

        // Validar que los siguientes 2 dígitos (departamento) estén entre 01 y 22
        int departamento = Integer.parseInt(cui.substring(9, 11));
        if (departamento < 1 || departamento > 22) {
            return false;
        }

        // Validar que los últimos 2 dígitos (municipio) estén entre 01 y 31
        int municipio = Integer.parseInt(cui.substring(11, 13));
        if (municipio < 1 || municipio > 31) {
            return false;
        }

        // Si todas las validaciones pasan, el CUI es válido
        return true;
    }
}
