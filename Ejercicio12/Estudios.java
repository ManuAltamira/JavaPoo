package Ejercicio12;

public class Estudios {
    private String carrera;
    private String abrev_carrera;
    private int grado;
    private char grupo;
    private String modalidad;
    private String abrev_modalidad;
    private String campus;
    private String abrev_campus;

    public Estudios(String carrera, String abrev_carrera, int grado, char grupo, String modalidad, String abrev_modalidad, String campus, String abrev_campus) {
        setCarrera(carrera,abrev_carrera);
        setGrado(grado);
        setGrupo(grupo);
        setModalidad(modalidad,abrev_modalidad);
        setCampus(campus,abrev_campus);
    }

    public String getCarrera() {
        return carrera;
    }
    public String getAbrevCarrera() {
        return abrev_carrera;
    }
    public void setCarrera(String carrera, String abrev_carrera) {
        this.carrera = carrera;
        this.abrev_carrera = abrev_carrera;
    }
    public int getGrado() {
        return grado;
    }
    public void setGrado(int grado) {
        if (grado>=1 && grado<=11) {
            this.grado = grado;
        }
        else {
            this.grado = 1;
        }
    }
    public char getGrupo() {
        return grupo;
    }
    public void setGrupo(char grupo) {
        if (grupo>='A' && grupo<='F') {
        //if (grupo>=65 && grupo<=70) {
            this.grupo = grupo;
        }
        else {
            this.grupo = 'A';
        }
    }
    public String getModalidad() {
        return modalidad;
    }
    public String getAbrevModalidad() {
        return abrev_modalidad;
    }
    public void setModalidad(String modalidad, String abrev_modalidad) {
        this.modalidad = modalidad;
        this.abrev_modalidad = abrev_modalidad;
    }
    public String getCampus() {
        return campus;
    }
    public String getAbrevCampus() {
        return abrev_campus;
    }
    public void setCampus(String campus, String abrev_campus) {
        this.campus = campus;
        this.abrev_campus = abrev_campus;
    }
    public String toString() {
        return abrev_carrera + "-" + grado + grupo + "-" + abrev_modalidad + "-" + abrev_campus;
    }
}
