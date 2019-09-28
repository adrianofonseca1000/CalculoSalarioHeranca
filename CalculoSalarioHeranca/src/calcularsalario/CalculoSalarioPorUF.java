package calcularsalario;

import java.math.BigDecimal;

public class CalculoSalarioPorUF implements CalculoSalarioStrategy {
    @Override
    BigDecimal calcular(
            String uf,
            BigDecimal salario,
            BigDecimal vendas,
            BigDecimal percentual) {
        return salario;
    }
}
