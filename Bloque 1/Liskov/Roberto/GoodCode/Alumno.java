public class Alumno extends Persona implements Actividad {
    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion(){
        return calificacion;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(" Calificacion: " + calificacion);
    }

    @Override
    public void realizarExamen(){
        System.out.println(getNombre() +" esta realizando un examen");
    }

}