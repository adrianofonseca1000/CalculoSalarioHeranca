package br.newtonpaiva;

import calcularsalario.CalculoSalarioStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    private Integer codigo;
    private String uf;
    private String nome;
    private List<Venda> vendas = new ArrayList<>();

    public Funcionario(Integer codigo, String nome, String uf) {
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
    }

    public void addVenda(BigDecimal valorTotal,
                         TipoPagamento tipoPagamento) {

        Venda v = new Venda(valorTotal, tipoPagamento);
        vendas.add(v);

    }

    public BigDecimal calcularSalario(
            CalculoSalarioStrategy strategy) {
        return getTotalVenda();
    }

    public BigDecimal getTotalVenda() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for (Venda v : getVendas())
            if (!v.isEstorno() ||
                    v.getTipoPagamento() == TipoPagamento.DINHEIRO)
                valorTotal = valorTotal
                        .add(v.getValorTotal());
        return valorTotal
                .multiply(getComissao())
                .divide(new BigDecimal(1000))
                .add(getSalario());
    }

    public abstract BigDecimal getSalario();

    public abstract BigDecimal getComissao();


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
