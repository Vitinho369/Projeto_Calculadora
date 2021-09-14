public class Operacoes {
    private double numero1;
    private double numero2;
    private double resultado;

    public void setNumero1(double numero){
        this.numero1 = numero;
    }

    public double getNumero1(){
        return this.numero1;
    }

    public void setNumero2(double numero){
        this.numero2 = numero;
    }

    public double getNumero2(){
        return this.numero2;
    }

    public void setResultado(double numero){
        this.resultado = numero;
    }
    
    public double getResultado(){
        return this.resultado;
    }
    public double somar(double numero1, double numero2){
        this.setResultado(numero1 + numero2);
        return this.getResultado();
    }

    public double subtrair(double numero1, double numero2){
       this.setResultado(numero1 - numero2);
        return this.getResultado();
    }

    public double dividir(double numero1, double numero2){
        this.setResultado(numero1/numero2);
        return this.getResultado();
    }

    public double multiplicar(double numero1, double numero2){
        this.setResultado(numero1*numero2);
        return this.getResultado();
    }
}
