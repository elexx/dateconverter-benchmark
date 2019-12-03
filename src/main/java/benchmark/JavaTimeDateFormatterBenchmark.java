package benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class JavaTimeDateFormatterBenchmark {

    @State(Scope.Thread)
    public static class StateVars {
        Date date = new Date();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMddHHmmssZ");
    }

    @Fork(1)
    @Benchmark
    public String formatNewFormat(StateVars state) {
        return DateTimeFormatter.ofPattern("yyyyMMddHHmmssZ").format(state.date.toInstant().atZone(ZoneId.systemDefault()));
    }

    @Fork(1)
    @Benchmark
    public Date parseNewFormat() {
        return Date.from(Instant.from(DateTimeFormatter.ofPattern("yyyyMMddHHmmssZ").parse("20181005151413+0200")));
    }

    @Fork(1)
    @Benchmark
    public String formatReuseFormat(StateVars state) {
        return state.format.format(state.date.toInstant().atZone(ZoneId.systemDefault()));
    }

    @Fork(1)
    @Benchmark
    public Date parseReuseFormat(StateVars state) {
        return Date.from(Instant.from(state.format.parse("20181005151413+0200")));
    }
}
