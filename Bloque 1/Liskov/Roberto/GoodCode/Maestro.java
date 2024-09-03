public class Maestro extends Persona{
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
        System.out.print(" Imparte la materia: " + materia);
    }
}