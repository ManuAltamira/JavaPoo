package Ejercicio4;

public class EstructuraSwitch {
    public static void main(String[] args) {
        int A=5;

        switch(A) {
            case 5:
                System.out.println("1. Switch5");
        }

        switch(A) {
            case 5:
                System.out.println("2. Switch5");
            default:
                System.out.println("2. Default");
        }

        switch(A) {
            case 5:
                System.out.println("3. Switch5");
                break;
            default:
                System.out.println("3. Default");
        }

        switch(A) {
            default:
                System.out.println("4. Default");
                break;
            case 5:
                System.out.println("4. Switch5");
                break;
            
        }

        switch(A) {
            case 1:
            case 2:
            case 3:
                System.out.println("3. Switch1-3");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("3. Switch5-7");
                break;
            default:
                System.out.println("3. Default");
        }

        switch(A) {
            case 1:
                System.out.println("3. Switch1");
            case 2:
                System.out.println("3. Switch2");
            case 3:
                System.out.println("3. Switch3");
                break;
            case 5:
                System.out.println("3. Switch5");
            case 6:
                System.out.println("3. Switch6");
            case 7:
                System.out.println("3. Switch7");
                break;
            default:
                System.out.println("3. Default");
        }
    }
}
