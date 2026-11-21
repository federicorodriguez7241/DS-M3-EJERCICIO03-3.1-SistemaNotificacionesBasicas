public abstract class FabricaNotificaciones {

    public abstract Notificador crearNotificador();

    // metodo para mandar la alerta directamente sin que el cliente sepa el canal
    public void mandarAlerta(String texto) {
        Notificador canal = crearNotificador();
        canal.enviar(texto);
    }
}