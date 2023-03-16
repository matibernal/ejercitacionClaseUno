package programa;

public class Profesor extends Persona{

    private String materiaAcargo; // La/s materias que tiene a cargo
    private int cantidadDeMaterias; //La cantidad de materias que da
    private int antiguedad; //los años que estuvo trabajando
    private int año; // Año/s en los que da clases
    private String curso; // Curso/s en los que da clases

    public Profesor(String nombre, String apellido, int edad, String materiaAcargo, int cantidadDeMaterias, int antiguedad, int año, String curso) {
        super(nombre, apellido, edad);
        this.materiaAcargo = materiaAcargo;
        this.cantidadDeMaterias = cantidadDeMaterias;
        this.antiguedad = antiguedad;
        this.año = año;
        this.curso = curso;
    }

    public String getMateriaAcargo() {
        return materiaAcargo;
    }

    public void setMateriaAcargo(String materiaAcargo) {
        this.materiaAcargo = materiaAcargo;
    }

    public int getCantidadDeMaterias() {
        return cantidadDeMaterias;
    }

    public void setCantidadDeMaterias(int cantidadDeMaterias) {
        this.cantidadDeMaterias = cantidadDeMaterias;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
