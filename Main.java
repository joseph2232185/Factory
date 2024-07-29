public class Main {
    public static void main(String[] args) {
        // aqui uso del patrón Factory Method
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion email = factory.crearNotificacion("Email");
        email.enviarMensaje("Hola en el correo... ");

        Notificacion sms = factory.crearNotificacion("SMS");
        sms.enviarMensaje("Hola por mensaje... ");

        Notificacion app = factory.crearNotificacion("APP");
        app.enviarMensaje("Hola en la aplicación... ");

        //aqui hago el uso del patrón Abstract Factory
        NotificacionAbstractFactory urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("mensaje con urgencia! ");

        NotificacionAbstractFactory regularFactory = new RegularNotificacionFactory();
        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Mensaje no urgente ");
    }
}

