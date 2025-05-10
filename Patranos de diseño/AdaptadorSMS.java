// Adaptador
class AdaptadorSMS implements Notificador {
    private ServicioSMSExterno servicio = new ServicioSMSExterno();

    @Override
    public void enviar(String mensaje) {
        servicio.enviarSMS(mensaje);
    }
}