package br.newtonpaiva;

import java.math.BigDecimal;

public class Diretor extends Funcionario {
    public Diretor(Integer codigo, String nome) {
        super(codigo, nome);

    }

    @Override
    public BigDecimal getComissao() {
        return new BigDecimal(0);
    }

    @Override
    public BigDecimal getSalario() {
        return new BigDecimal(5000);
    }
}
