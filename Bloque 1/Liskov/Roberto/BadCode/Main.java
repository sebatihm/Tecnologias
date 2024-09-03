class Persona{
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("nombre: " + nombre);
    }

    public void realizarExamen(){

    }
    
}

class Alumno extends Persona{
    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(" Calificacion: " + calificacion);
    }

    @Override
    public void realizarExamen(){
        System.out.println(getNombre() +" esta realizando un examen");
    }

    
}

class Maestro extends Persona{
    private String materia;

    public Maestro(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(" Imparte la materia: " + materia);
    }

    @Override
    public void realizarExamen(){
        throw new UnsupportedOperationException("Los maestros no realizan clases");
    }

    
}



public class Main{

    public static void realizarActividad(Persona persona){
        persona.realizarExamen();
    }
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Alexis", 10);
        Maestro maestro = new Maestro("Magdielito.exe", "Matematicas Discretas");

        maestro.mostrarInfo();
        alumno.mostrarInfo();

        realizarActividad(alumno);
        realizarActividad(maestro);
    }
}