public class FabricaEmail extends FabricaNotificaciones {
    @Override
    public Notificador crearNotificador() {
        return new NotificadorEmail();
    }
}
