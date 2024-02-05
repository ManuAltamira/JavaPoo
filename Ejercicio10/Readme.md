Cuenta Palabras

Se va a crear una aplicación para contar el número de veces que aparece cada palabra en un texto dado. Para ello se crearán las clases PalabraEnTexto, ContadorPalabras, ContadorPalabrasSig y Main.

a. La clase PalabraEnTexto mantiene información de una palabra (String) así como del número de veces que aparece en un determinado texto (int).
    a.1. La clase tendrá un constructor en el que se proporciona la palabra. Al construir el objeto, el número de veces que aparece la palabra se considera 1.
    a.2. Dos objetos de la clase PalabraEnTexto son iguales si coinciden las palabras que contiene, independientemente de que estén en mayúsculas o minúsculas. El número de apariciones no se tiene en cuenta.
    a.3. La representación de un objeto PalabraEnTexto debe mostrar la palabra que contiene y el número de veces que aparece.
    a.4. El método void incrementa() incrementa en uno el número de veces que aparece la palabra.

b. Crear la clase ContadorPalabras que almacena en un array las palabras que aparecen en un texto (array de PalabraEnTexto). También guardará el número de palabras (int) almacenadas en un momento dado.
    Si en el transcurso de las operaciones que se hagan con objetos de esta clase, el array llega a tener un tamaño insuficiente, deberá crecer de manera que siempre quepan las palabras que se le proporcionen.
    b.1. La clase dispondrá de dos constructores; el primero de ellos, sin argumentos, que crea el array con un tamaño de 10 (constante TAM_INICIAL); el segundo, con un argumento entero, que indicará el tamaño inicial del array.
    b.2. El método privado int esta(String pal) que devuelve la posición en la que se encuentra la palabra que corresponde a pal en el array o -1 si no está.
    b.3. El método protegido void incluye(String pal) deberá incrementar el número de apariciones de la palabra que corresponda a la cadena pal en el contador de palabras si es que ya existía, o incluir una palabra nueva en caso contrario.
    b.4. El método privado void incluyeTodas(String linea, String del) permite extraer de linea las palabras usando los delimitadores incluidos en del. Cada una de las palabras obtenidas se irán acumulando en el contador.
    b.5. El método público void incluyeTodas(String [] texto, String del) incluye todas las palabras que se encuentra en el array texto. Cada elemento del array será una línea de texto y en cada línea, las palabras se deben separar usando los delimitadores incluidos en del.
    b.6. El método público void incluyeTodasFichero(String nomFich, String del) incluye todas las palabras que se encuentra en el fichero. Cada elemento del fichero será una línea de texto y en cada línea, las palabras se deben separar usando los delimitadores incluidos en del. Este crea un flujo de entrada (Scanner) y llama al método pivado leerFichero(Scanner sc, String del) que llevará a cabo la lectura del fichero línea a línea.
    b.7. Crear el método público PalabraEnTexto encuentra(String pal) que, dada una cadena de caracteres pal que representa una palabra, encuentra la instancia de PalabraEnTexto en el array que coincide con ella y la devuelve. Si la palabra no se encuentra en el texto deberá lanzar la excepción NoSuchElementException.
    b.8. La clase dispondrá de una representación de los objetos como la que se muestra en el ejemplo final. Usar StringBuilder para crear la representación, y obsérvese que, tras la última palabra, no hay coma.
    b.9. La clase además dispondrá de dos métodos públicos, void presentaPalabras, que generarán una presentación del índice en el formato:
        GUERRA: 5
        TENÍA: 2
        UNA: 2
        JARRA: 3
        Y: 1
        ...
    Uno de los métodos recibirá como parámetro el nombre del dispositivo de salida (fichero, de tipo String) donde llevar a cabo la acción y el otro recibirá como parámetro el flujo de salida (de tipo PrintWriter) donde llevar a cabo la acción.

c. La clase ContadorPalabrasSig representa objetos contadores de palabras que, en los procedimientos de inclusión, no contemplan las palabras consideradas no significativas. Para ello, la clase deberá incluir un array de String que almacene estas palabras no significativas, así como el número de palabras almacenadas en él (int).
    c.1. Definir dos constructores, ContadorPalabrasSig(int n, String[] palsNS) y ContadorPalabrasSig(String[] palsNS). El primero recibe el tamaño inicial del array de PalabraEnTexto y un array de String con las palabras no significativas.
    El segundo sólo recibe este array. Supóngase que las palabras de este array están todas en mayúsculas. En el segundo constructor, el array de PalabraEnTexto se creará con un tamaño 10 (constante TAM).
    c.2. Definir dos constructores más para permitir que la relación de palabras no significativas sea obtenida desde un dispositivo. Estos tendrán dos argumentos diferentes a los de los respectivos constructores del punto 1: ContadorPalabrasSig(String filNoSig, String sep) y ContadorPalabrasSig(int n, String filNoSig, String sep), uno de ellos de tipo String con el nombre del dispositivo de entrada (fichero) que contendrá la relación de palabras no significativas, y otro de tipo String que contendrá la cadena con los caracteres separadores de dichas palabras en el fichero.
    Como en el caso anterior podemos suponer que todas las palabras del fichero están en mayúsculas. Ejemplo:
        CON LA A DE NO SI Y UNA
    Ambos llamarán al método privado leerFicheroNoSig(String filNoSig, String sep) que crea un flujo de entrada (Scanner) y llama al método privado leerPalabrasNoSignificativas(Scanner sc, String sep), al que se le pasa como parámetro el flujo de entrada ( Scanner) y que llevará a cabo la lectura del fichero palabra a palabra.
    c.3. Conseguir que las instancias de la clase ContadorPalabrasSig se comporten como las de ContadorPalabras, a excepción de que los procedimientos de inclusión de palabras no realicen ninguna acción cuando éstas no sean significativas.

Aquí se presenta un ejemplo de uso de estas clases y la salida correspondiente:

import java.util.NoSuchElementException;
import prCuentaPalabrasSimpleFicheros.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {
        String [] datos = {
            "Guerra tenía una jarra y Parra tenía una perra, ",
            "pero la perra de Parra rompió la jarra de Guerra.",
            "Guerra pegó con la porra a la perra de Parra. ",
            "¡Oiga usted buen hombre de Parra! ",
            "Por qué ha pegado con la porra a la perra de Parra.",
            "Porque si la perra de Parra no hubiera roto la jarra de Guerra,",
            "Guerra no hubiera pegado con la porra a la perra de Parra."
        };
        // Quitar el comentario según se use Scanner o StringTokenizer
        String delimitadores = "[ .,:;\\-\\!\\¡\\¿\\?]+";
        // Para Scanner
        // String delimitadores = " .,:;-!¡¿?";
        // Para StringTokenizer
        String [] noSig = {"CON", "LA", "A", "DE", "NO", "SI", "Y", "UNA"};
        ContadorPalabras contador = null, contadorSig = null;
        // Si no se incluye un argumento numérico, se crea por defecto.
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("Con argumento " + n);
            contador = new ContadorPalabras(n);
            contadorSig = new ContadorPalabrasSig(n, noSig);
        } catch (RuntimeException e) {
            System.out.println("Por defecto...");
            contador = new ContadorPalabras();
            contadorSig = new ContadorPalabrasSig(noSig);
        }
        // Incluimos todas las palabras que hay en datos
        // teniendo en cuenta los delimitadores
        contador.incluyeTodas(datos, delimitadores);
        contadorSig.incluyeTodas(datos, delimitadores);
        System.out.println(contador + "\n");
        System.out.println(contadorSig + "\n");
        try {
            System.out.println(contador.encuentra("parra"));
            System.out.println(contador.encuentra("Gorra"));
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }
        //Repetimos la salida con E/S desde ficheros
        System.out.println("Repetimos la ejecución tomando la E/S desde/a fichero");
        ContadorPalabras contadorSigFich=null;
        // Si no se incluye un argumento numŽrico, se crea por defecto.
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("Con argumento " + n);
            contador = new ContadorPalabras(n);
            contadorSigFich= new ContadorPalabrasSig(n,"fichNoSig.txt",delimitadores);
        } catch (RuntimeException e) {
            System.out.println("Por defecto...");
            contador = new ContadorPalabras();
            try {
                contadorSigFich= new
                ContadorPalabrasSig("fichNoSig.txt",delimitadores);
            } catch (IOException e1) {
                //
                System.out.println("ERROR:"+ e1.getMessage());
            }
        } catch (IOException e){
            System.out.println("ERROR:"+ e.getMessage());
        }
        // Incluimos todas las palabras que hay en datos.txt teniendo en cuenta los separadores
        try{
            contador.incluyeTodasFichero("datos.txt",delimitadores);
            contadorSigFich.incluyeTodasFichero("datos.txt", delimitadores);
            System.out.println(contador + "\n");
            System.out.println(contadorSigFich + "\n");
            //métodos para presentar por pantalla
            PrintWriter pw=new PrintWriter(System.out, true);
            contador.presentaPalabras(pw);
            //salida a fichero
            contador.presentaPalabras("salida.txt");
            //métodos para presentar por pantalla para No Significativas
            System.out.println();
            contadorSigFich.presentaPalabras(pw);
            //salida a fichero
            contadorSigFich.presentaPalabras("salidaNoSig.txt");
        }catch (IOException e){
            System.out.println("ERROR:"+ e.getMessage());
        }
    }
}

A continuación se presenta la salida correspondiente a la clase Main:

Por defecto...
[GUERRA: 5, TENÍA: 2, UNA: 2, JARRA: 3, Y: 1, PARRA: 7, PERRA: 6, PERO: 1, LA: 10, DE: 8, ROMPIÓ: 1, PEGÓ: 1, CON: 3, PORRA: 3, A: 3, OIGA: 1, USTED: 1, BUEN: 1, HOMBRE: 1, POR: 1, QUÉ: 1, HA: 1, PEGADO: 2, PORQUE: 1, SI: 1, NO: 2, HUBIERA: 2, ROTO: 1]

[GUERRA: 5, TENÍA: 2, JARRA: 3, PARRA: 7, PERRA: 6, PERO: 1, ROMPIÓ: 1, PEGÓ: 1, PORRA: 3, OIGA: 1, USTED: 1, BUEN: 1, HOMBRE: 1, POR: 1, QUÉ: 1, HA: 1, PEGADO: 2, PORQUE: 1, HUBIERA: 2, ROTO: 1]

PARRA: 7
Repetimos la ejecución tomando la E/S desde/a fichero
Por defecto...
No existe la palabra Gorra
[GUERRA: 5, TENÍA: 2, UNA: 2, JARRA: 3, Y: 1, PARRA: 7, PERRA: 6, PERO: 1, LA: 10, DE: 8, ROMPIÓ: 1, PEGÓ: 1, CON: 3, PORRA: 3, A: 3, OIGA: 1, USTED: 1, BUEN: 1, HOMBRE: 1, POR: 1, QUÉ: 1, HA: 1, PEGADO: 2, PORQUE: 1, SI: 1, NO: 2, HUBIERA: 2, ROTO: 1]

[GUERRA: 5, TENÍA: 2, JARRA: 3, PARRA: 7, PERRA: 6, PERO: 1, ROMPIÓ: 1, PEGÓ: 1, PORRA: 3, OIGA: 1, USTED: 1, BUEN: 1, HOMBRE: 1, POR: 1, QUÉ: 1, HA: 1, PEGADO: 2, PORQUE: 1, HUBIERA: 2, ROTO: 1]

GUERRA: 5
TENÍA: 2
UNA: 2
JARRA: 3
Y: 1
PARRA: 7
PERRA: 6
PERO: 1
LA: 10
DE: 8
ROMPIÓ: 1
PEGÓ: 1
CON: 3
PORRA: 3
A: 3
OIGA: 1
USTED: 1
BUEN: 1
HOMBRE: 1
POR: 1
QUÉ: 1
HA: 1
PEGADO: 2
PORQUE: 1
SI: 1
NO: 2
HUBIERA: 2
ROTO: 1

GUERRA: 5
TENÍA: 2
JARRA: 3
PARRA: 7
PERRA: 6
PERO: 1
ROMPIÓ: 1
PEGÓ: 1
PORRA: 3
OIGA: 1
USTED: 1
BUEN: 1
HOMBRE: 1
POR: 1
QUÉ: 1
HA: 1
PEGADO: 2
PORQUE: 1
HUBIERA: 2
ROTO: 1
