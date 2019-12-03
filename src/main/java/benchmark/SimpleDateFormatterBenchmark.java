package benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class SimpleDateFormatterBenchmark {

    @State(Scope.Thread)
    public static class StateVars {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmssZ");
    }

    @Fork(1)
    @Benchmark
    public String formatNewFormat(StateVars state) {
        return new SimpleDateFormat("yyyyMMddHHmmssZ").format(state.date);
    }

    @Fork(1)
    @Benchmark
    public Date parseNewFormat() throws ParseException {
        return new SimpleDateFormat("yyyyMMddHHmmssZ").parse("20181005151413+0200");
    }

    @Fork(1)
    @Benchmark
    public String formatReuseFormat(StateVars state) {
        return state.format.format(state.date);
    }

    @Fork(1)
    @Benchmark
    public Date parseReuseFormat(StateVars state) throws ParseException {
        return state.format.parse("20181005151413+0200");
    }
}
