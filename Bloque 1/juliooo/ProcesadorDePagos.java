package juliooo;

public class ProcesadorDePagos {
    public void procesar(Pago pago){
        pago.procesarPago();
    
        if(pago instanceof TarjetaDeCredito){
            TarjetaDeCredito tarjeta = (TarjetaDeCredito) pago;
            tarjeta.verificarLimiteCredito();
        }else if (pago instanceof PayPal){
            PayPal payPal = (PayPal) pago;
            payPal.enviarRecibo();
        }
    }
}
