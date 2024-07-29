public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "Email":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "APP":
                return new AppNotificacion();
            default:
                throw new IllegalArgumentException("Intento robar la prueba" + tipo);
        }
    }
}

