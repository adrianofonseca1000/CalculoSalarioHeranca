package br.newtonpaiva;

import java.math.BigDecimal;

public class Faxineiro extends Funcionario {
    public Faxineiro(Integer codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public BigDecimal getComissao() {
        return new BigDecimal(0);
    }

    @Override
    public BigDecimal getSalario() {
        return new BigDecimal(1000);
    }
}
