public class OperacionesBasicas {

    public int a;

    public int b;

    public OperacionesBasicas() {
        a = 0;
        b = 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int multiplicacion(int a, int b){

        int mul = a*b ;

        return mul;
    }

    public int division(int a, int b){

        int div = a / b ;

        return div;
    }
    public int suma(int a, int b){

        int suma = a +b ;

        return suma;
    }

    public int resta(int a, int b){

        int resta = a - b ;

        return resta;
    }


}
