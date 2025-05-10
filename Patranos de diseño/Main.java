public class Main {
    public static void main(String[] args) {
        // Singleton
        DatabaseConnection bd = DatabaseConnection.getInstance();

        // Adapter
        Notificador notificador = new AdaptadorSMS();
        notificador.enviar("Tu cita fue confirmada.");

        // Strategy
        GestorCitas gestor = new GestorCitas();
        gestor.setTipoCita(new CitaPresencial());
        gestor.agendarCita("Juan Pérez");

        gestor.setTipoCita(new CitaVirtual());
        gestor.agendarCita("Ana López");

        // Guardar info
        bd.guardar("2 citas agendadas.");
    }
}