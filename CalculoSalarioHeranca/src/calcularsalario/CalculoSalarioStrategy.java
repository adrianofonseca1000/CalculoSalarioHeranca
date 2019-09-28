package calcularsalario;

import java.math.BigDecimal;

public class CalculoSalarioStrategy {
    BigDecimal calcular(
            String uf,
            BigDecimal salario,
            BigDecimal vendas,
            BigDecimal percentual) {
        return vendas
                .multiply(percentual)
                .divide(new BigDecimal(1000))
                .add(salario);

        switch (uf) {
            case "SP":
                percentual = new BigDecimal(35);
                break;
            default:
                break;
        }
        return vendas.multiply(percentual)
                .divide(new BigDecimal(1000))
                .add(salario);
    }
}
