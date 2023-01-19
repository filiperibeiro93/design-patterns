package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String[] args) {
        var orcamento = new Orcamento();
        var calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
