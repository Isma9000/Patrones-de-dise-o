public class DatabaseConnection {
    private static DatabaseConnection instancia;

    private DatabaseConnection() {
        System.out.println("Conectado a la base de datos.");
    }

    public static DatabaseConnection getInstance() {
        if (instancia == null) {
            instancia = new DatabaseConnection();
        }
        return instancia;
    }

    public void guardar(String mensaje) {
        System.out.println("Guardando en BD: " + mensaje);
    }
}