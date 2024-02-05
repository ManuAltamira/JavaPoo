package Ejercicio11;

public class OperacionesMatematicas {
 
    final float PI=3.1416f;
    public float areaCirculo(float radio){
        //PI*r*2
        return PI * (float)Math.pow(radio,2);
    }
    public float perimetroParalelogramo(float ladoA, float ladoB){
        //ladoA*ladoB*2
        return(ladoA * 2) + (ladoB *2);
    }
    public float ecuacionPrimerGrado(int coeficienteA, int coeficienteB, int coeficienteC){
        //2x + 2 = 0        ax + b = c
        //2x = -2           ax =c-b
        //x = -2/2          x =(c-b)/a 
        //x = -2

        return (coeficienteC - coeficienteB) / coeficienteA;
    } 
    public float ecuacionPrimerGrado2(int coeficienteA){
        //x - 2 = 0     x - a = 0
        //x = 2         x=a
        return coeficienteA;
    }
    public float ecuacionPrimerGrado3(int coeficienteA, int coeficienteB, int coeficienteC){
        //3x + 2 = x - 1    ax + b = x - c
        //3x - x = - 1 - 2  ax - x = - c - b 
        //2x = - 3          (a - 1)x = - c - b
        //x = -3 / 2 x = (- c - b) / (a - 1)
        return (- coeficienteC - coeficienteB) /(coeficienteA - 1);
    }
}
