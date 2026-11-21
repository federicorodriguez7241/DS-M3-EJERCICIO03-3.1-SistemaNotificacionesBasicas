public class Main {
    public static void main(String[] args) {

        // instanciamos las fabricas segun el canal que necesitemos
        FabricaNotificaciones fabricaMail = new FabricaEmail();
        FabricaNotificaciones fabricaSms = new FabricaSms();

        System.out.println("--- ENVIANDO ALERTAS ---");

        // usamos la interfaz Notificador para interactuar con el canal
        Notificador alerta1 = fabricaMail.crearNotificador();
        alerta1.enviar("Su turno fue confirmado para mañana.");

        // o usando el metodo directo de la fabrica
        fabricaSms.mandarAlerta("Codigo de seguridad: 4829");
    }
}
