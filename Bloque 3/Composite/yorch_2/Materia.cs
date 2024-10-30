public class Materia{
    private string nombre;
    private double calificacion;

    public  Materia(string nombre){
        this.nombre = nombre;
    }

    public double getCalificacion(){
        return this.calificacion;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }

    public void setNombre(string nombre){
        this.nombre = nombre;
    }

    public string getNombre(){
        return this.nombre;
    }
    
}