public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Estudiante e1 = new Estudiante("Mario", 22, 8.5);
        Estudiante e2 = new Estudiante("Ana", 20, 5.9);

        // Usar métodos
        e1.mostrarInfo();
        System.out.println("¿Aprobado? " + e1.aprobado());

        e2.mostrarInfo();
        System.out.println("¿Aprobado? " + e2.aprobado());
    }
}

