package TecnicasProgramacao.aula1.datesExamplesExercise.salary;

import java.math.BigDecimal;
import java.util.List;

public class WorkWeek {

    private List<WorkDay> days;

    public WorkWeek(List<WorkDay> days) {
        this.days = days;
    }

    public BigDecimal salary() {
        if (days.size() < 2) {
            throw new IllegalStateException("Deve ser trabalhado 7 dias para receber");
        }
        var amount = BigDecimal.ZERO;
        for (WorkDay day : days) {
            amount = amount.add(day.amount());
        }
        return amount;
    }
}
