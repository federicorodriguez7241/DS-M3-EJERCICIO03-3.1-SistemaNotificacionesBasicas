public class FabricaSms extends FabricaNotificaciones {
    @Override
    public Notificador crearNotificador() {
        return new NotificadorSms();
    }
}