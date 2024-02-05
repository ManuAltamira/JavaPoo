package Ejercicio14;

public class FechaEspecial {
    private int dia;
    private int mes;
    private int ano;

    public FechaEspecial(int mes, int ano) {
        setAno(ano);
        setMes(mes);
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (mes>=1 && mes<=12) {
            this.mes = mes;
        }
        else {
            this.mes = 1;
        }
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if (ano>0) {
            this.ano = ano;
        }
        else {
            this.ano = 1;
        }
    }
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}