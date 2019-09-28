package br.newtonpaiva;

import java.math.BigDecimal;

public class Vendedor extends Funcionario {
    public Vendedor(Integer codigo, String nome) {
        super(codigo, nome);
    }

    @Override
    public BigDecimal getComissao() {
        return new BigDecimal(15);
    }

    @Override
    public BigDecimal getSalario() {
        return new BigDecimal(1200);
    }
}