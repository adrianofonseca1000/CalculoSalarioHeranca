package br.newtonpaiva;

import java.math.BigDecimal;

public class Gerente extends Funcionario {
    public Gerente(Integer codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public BigDecimal getComissao() {
        return new BigDecimal(20);
    }

    @Override
    public BigDecimal getSalario() {
        return new BigDecimal(2200);
    }

}
