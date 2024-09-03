public class CitaEnLinea : Cita{
    public override void ConfirmarCita(){
        Console.WriteLine($"Cita confirmada por el {Cliente} para el {Servicio} en la fecha {FechaHora}");
    }
}