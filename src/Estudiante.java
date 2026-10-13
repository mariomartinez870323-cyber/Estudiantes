public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                ", Edad: " + edad +
                ", Promedio: " + promedio);
    }

    // Método para verificar si aprobó
    public boolean aprobado() {
        return promedio >= 6.0;
    }
}


