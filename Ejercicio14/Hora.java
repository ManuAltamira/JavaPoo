package Ejercicio14;

public class Hora {
    private int segundo;
    private int minuto;
    private int hora;

    public Hora(int segundo, int minuto, int hora) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
            this.segundo = segundo;
        }
    public int getMinuto() {
        return minuto;
        }
    public void setMinuto(int minuto) {
            this.minuto = minuto;
        }
    public int getHora() {
        return hora;
        }
     public void setHora(int hora) {
                this.hora = hora;
        }
    public String toString() {
        return hora + ":" + minuto + "/" + segundo;
    }
}