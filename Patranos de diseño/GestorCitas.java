// Contexto
class GestorCitas {
    private TipoCita tipoCita;

    public void setTipoCita(TipoCita tipoCita) {
        this.tipoCita = tipoCita;
    }

    public void agendarCita(String paciente) {
        tipoCita.agendar(paciente);
    }
}