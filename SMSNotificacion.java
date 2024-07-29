public class SMSNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("cargando los mensajes... " + mensaje);
    }
}
