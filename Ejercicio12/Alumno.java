package Ejercicio12;

public class Alumno {
    private String matricula;
    private String nombre;
    private Fecha fecha_nacimiento;
    private Estudios estudios;

    public Alumno(String matricula, String nombre, Fecha fecha_nacimiento, Estudios estudios) {
        setMatricula(matricula);
        setNombre(nombre);
        setFechaNacimiento(fecha_nacimiento);
        setEstudios(estudios);
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Fecha getFechaNacimiento() {
        return fecha_nacimiento;
    }
    public void setFechaNacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void setFechaNacimiento(int dia, int mes, int ano) {
        this.fecha_nacimiento = new Fecha(dia,mes,ano);
    }
    public Estudios getEstudios() {
        return estudios;
    }
    public void setEstudios(Estudios estudios) {
        this.estudios = estudios;
    }
    public void setEstudios(String carrera, String abrev_carrera, int grado, char grupo, String modalidad, String abrev_modalidad, String campus, String abrev_campus) {
        this.estudios = new Estudios(carrera,abrev_carrera,grado,grupo,modalidad,abrev_modalidad,campus,abrev_campus);
    }

    public void imprimirFicha() {
        System.out.println(matricula + " " + nombre);
        System.out.println(estudios + " " + fecha_nacimiento);
    }
    public void imprimirDatos() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha Nacimiento: " + fecha_nacimiento);
        System.out.println("Carrera: " + estudios.getCarrera());
        System.out.println("Grado: " + estudios.getGrado());
        System.out.println("Grupo: " + estudios.getGrupo());
        System.out.println("Modalidad: " + estudios.getModalidad());
        System.out.println("Campus: " + estudios.getCampus());
    }
}
