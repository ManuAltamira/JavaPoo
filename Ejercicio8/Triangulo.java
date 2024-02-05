package Ejercicio8;

public class Triangulo {
    
    float base, altura;

public float area(){
 return (float)((this.base = this.altura)/2.0);
}

public float area(float base, float altura){
 return (float)((base * altura)/2.0);
}
public float area(int base, int altura){
return (float)((base = altura)/2.0);
}

}
