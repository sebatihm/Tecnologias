package juliooo;

public abstract class Pago {
    abstract void procesarPago();
    
}

class TarjetaDeCredito extends Pago{
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;


    public TarjetaDeCredito(String numeroTarjeta, String fechaExpiracion, String codigoSeguridad){
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando Pago con tarjeta de credito");
    }

    public void verificarLimiteCredito(){
        System.out.println("Verificando limite de credito");
    }
}

 class PayPal extends Pago{
    private String emailUsuario;

    public PayPal(String emailUsuario){
        this.emailUsuario = emailUsuario;
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando Pago con PayPal");
    }  

    public void enviarRecibo(){
        System.out.println("Enviando recibo al correo...");
    }

 }