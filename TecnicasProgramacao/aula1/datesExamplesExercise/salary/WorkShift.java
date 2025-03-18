package TecnicasProgramacao.aula1.datesExamplesExercise.salary;

import java.time.Duration;
import java.time.LocalTime;

public class WorkShift {

    private LocalTime start;
    private LocalTime end;

    public WorkShift(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public Duration totalHours() {
        return Duration.between(start, end);
    }

}
