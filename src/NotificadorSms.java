public class NotificadorSms implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("[SMS] Enviando mensaje de texto: " + mensaje);
    }
}