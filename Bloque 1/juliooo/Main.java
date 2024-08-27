package juliooo;

public class Main {
    ProcesadorDePagos procesador = new ProcesadorDePagos();

    Pago pagoConTarjeta = new TarjetaDeCredito("1234-5678-9876-2323", "12/25", "123");
    Pago pagoConPaypal = new PayPal("julioxd@gmail.com");

}
