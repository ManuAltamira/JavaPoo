package Ejercicio14;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if ( (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) && (dia>=1 && dia<=31) ) {
            this.dia = dia;
        }
        else if ( (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && (dia>=1 && dia<=30) ) {
            this.dia = dia;
        }
        else if ( (mes == 2 && ano%4==0) && (dia>=1 && dia<=29) ) {
            this.dia = dia;
        }
        else if ( (mes == 2 && ano%4!=0) && (dia>=1 && dia<=28) ) {
            this.dia = dia;
        }
        else {
            this.dia = 1;
        }
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