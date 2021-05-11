package digital.innovatione.one.core;

import utils.operacao.Calculadora;

public class Run {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(1 , 3));
    }
}
