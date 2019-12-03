## JMH benchmark for Apache Johnzon `DateConverter`

Sample code for [JOHNZON-293](https://issues.apache.org/jira/browse/JOHNZON-293).


```
$ ./gradlew installDist
$ cd build/install/dateconverterbench/
$ ./bin/dateconverterbench )
```

<details><summary>Full Output</summary>

```text
# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.JavaTimeDateFormatterBenchmark.formatNewFormat

# Run progress: 0,00% complete, ETA 00:13:20
# Fork: 1 of 1
# Warmup Iteration   1: 891,453 ns/op
# Warmup Iteration   2: 841,231 ns/op
# Warmup Iteration   3: 827,833 ns/op
# Warmup Iteration   4: 825,266 ns/op
# Warmup Iteration   5: 826,859 ns/op
Iteration   1: 825,592 ns/op
Iteration   2: 826,829 ns/op
Iteration   3: 830,654 ns/op
Iteration   4: 829,458 ns/op
Iteration   5: 830,581 ns/op


Result "benchmark.JavaTimeDateFormatterBenchmark.formatNewFormat":
  828,623 ±(99.9%) 8,836 ns/op [Average]
  (min, avg, max) = (825,592, 828,623, 830,654), stdev = 2,295
  CI (99.9%): [819,787, 837,459] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.JavaTimeDateFormatterBenchmark.formatReuseFormat

# Run progress: 12,50% complete, ETA 00:11:44
# Fork: 1 of 1
# Warmup Iteration   1: 513,824 ns/op
# Warmup Iteration   2: 498,662 ns/op
# Warmup Iteration   3: 497,760 ns/op
# Warmup Iteration   4: 497,244 ns/op
# Warmup Iteration   5: 495,699 ns/op
Iteration   1: 498,352 ns/op
Iteration   2: 495,087 ns/op
Iteration   3: 496,978 ns/op
Iteration   4: 496,161 ns/op
Iteration   5: 498,000 ns/op


Result "benchmark.JavaTimeDateFormatterBenchmark.formatReuseFormat":
  496,916 ±(99.9%) 5,150 ns/op [Average]
  (min, avg, max) = (495,087, 496,916, 498,352), stdev = 1,337
  CI (99.9%): [491,766, 502,065] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.JavaTimeDateFormatterBenchmark.parseNewFormat

# Run progress: 25,00% complete, ETA 00:10:03
# Fork: 1 of 1
# Warmup Iteration   1: 1477,545 ns/op
# Warmup Iteration   2: 1381,309 ns/op
# Warmup Iteration   3: 1424,521 ns/op
# Warmup Iteration   4: 1439,629 ns/op
# Warmup Iteration   5: 1441,892 ns/op
Iteration   1: 1432,455 ns/op
Iteration   2: 1430,925 ns/op
Iteration   3: 1427,700 ns/op
Iteration   4: 1433,414 ns/op
Iteration   5: 1426,887 ns/op


Result "benchmark.JavaTimeDateFormatterBenchmark.parseNewFormat":
  1430,276 ±(99.9%) 11,084 ns/op [Average]
  (min, avg, max) = (1426,887, 1430,276, 1433,414), stdev = 2,878
  CI (99.9%): [1419,193, 1441,360] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.JavaTimeDateFormatterBenchmark.parseReuseFormat

# Run progress: 37,50% complete, ETA 00:08:22
# Fork: 1 of 1
# Warmup Iteration   1: 970,400 ns/op
# Warmup Iteration   2: 934,009 ns/op
# Warmup Iteration   3: 924,649 ns/op
# Warmup Iteration   4: 926,315 ns/op
# Warmup Iteration   5: 923,668 ns/op
Iteration   1: 932,110 ns/op
Iteration   2: 940,266 ns/op
Iteration   3: 1075,318 ns/op
Iteration   4: 1065,505 ns/op
Iteration   5: 940,041 ns/op


Result "benchmark.JavaTimeDateFormatterBenchmark.parseReuseFormat":
  990,648 ±(99.9%) 280,983 ns/op [Average]
  (min, avg, max) = (932,110, 990,648, 1075,318), stdev = 72,970
  CI (99.9%): [709,665, 1271,631] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.SimpleDateFormatterBenchmark.formatNewFormat

# Run progress: 50,00% complete, ETA 00:06:42
# Fork: 1 of 1
# Warmup Iteration   1: 1534,478 ns/op
# Warmup Iteration   2: 1292,868 ns/op
# Warmup Iteration   3: 1306,849 ns/op
# Warmup Iteration   4: 1306,703 ns/op
# Warmup Iteration   5: 1313,528 ns/op
Iteration   1: 1309,276 ns/op
Iteration   2: 1309,783 ns/op
Iteration   3: 1311,495 ns/op
Iteration   4: 1302,010 ns/op
Iteration   5: 1308,157 ns/op


Result "benchmark.SimpleDateFormatterBenchmark.formatNewFormat":
  1308,144 ±(99.9%) 13,993 ns/op [Average]
  (min, avg, max) = (1302,010, 1308,144, 1311,495), stdev = 3,634
  CI (99.9%): [1294,151, 1322,137] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.SimpleDateFormatterBenchmark.formatReuseFormat

# Run progress: 62,50% complete, ETA 00:05:01
# Fork: 1 of 1
# Warmup Iteration   1: 480,372 ns/op
# Warmup Iteration   2: 383,175 ns/op
# Warmup Iteration   3: 393,346 ns/op
# Warmup Iteration   4: 392,694 ns/op
# Warmup Iteration   5: 392,892 ns/op
Iteration   1: 390,970 ns/op
Iteration   2: 391,885 ns/op
Iteration   3: 393,140 ns/op
Iteration   4: 392,587 ns/op
Iteration   5: 392,597 ns/op


Result "benchmark.SimpleDateFormatterBenchmark.formatReuseFormat":
  392,236 ±(99.9%) 3,219 ns/op [Average]
  (min, avg, max) = (390,970, 392,236, 393,140), stdev = 0,836
  CI (99.9%): [389,016, 395,455] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.SimpleDateFormatterBenchmark.parseNewFormat

# Run progress: 75,00% complete, ETA 00:03:21
# Fork: 1 of 1
# Warmup Iteration   1: 1971,342 ns/op
# Warmup Iteration   2: 1844,107 ns/op
# Warmup Iteration   3: 1838,776 ns/op
# Warmup Iteration   4: 1839,325 ns/op
# Warmup Iteration   5: 1844,058 ns/op
Iteration   1: 1850,920 ns/op
Iteration   2: 1842,051 ns/op
Iteration   3: 1844,837 ns/op
Iteration   4: 1852,714 ns/op
Iteration   5: 1853,338 ns/op


Result "benchmark.SimpleDateFormatterBenchmark.parseNewFormat":
  1848,772 ±(99.9%) 19,412 ns/op [Average]
  (min, avg, max) = (1842,051, 1848,772, 1853,338), stdev = 5,041
  CI (99.9%): [1829,360, 1868,184] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_172, Java HotSpot(TM) 64-Bit Server VM, 25.172-b11
# VM invoker: D:\tools\jdk1.8.0_172\jre\bin\java.exe
# VM options: <none>
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: benchmark.SimpleDateFormatterBenchmark.parseReuseFormat

# Run progress: 87,50% complete, ETA 00:01:40
# Fork: 1 of 1
# Warmup Iteration   1: 1152,264 ns/op
# Warmup Iteration   2: 1129,339 ns/op
# Warmup Iteration   3: 1120,581 ns/op
# Warmup Iteration   4: 1119,699 ns/op
# Warmup Iteration   5: 1121,873 ns/op
Iteration   1: 1118,104 ns/op
Iteration   2: 1125,699 ns/op
Iteration   3: 1121,638 ns/op
Iteration   4: 1119,663 ns/op
Iteration   5: 1124,673 ns/op


Result "benchmark.SimpleDateFormatterBenchmark.parseReuseFormat":
  1121,955 ±(99.9%) 12,417 ns/op [Average]
  (min, avg, max) = (1118,104, 1121,955, 1125,699), stdev = 3,225
  CI (99.9%): [1109,538, 1134,373] (assumes normal distribution)


# Run complete. Total time: 00:13:24

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                         Mode  Cnt     Score     Error  Units
JavaTimeDateFormatterBenchmark.formatNewFormat    avgt    5   828,623 ±   8,836  ns/op
JavaTimeDateFormatterBenchmark.formatReuseFormat  avgt    5   496,916 ±   5,150  ns/op
JavaTimeDateFormatterBenchmark.parseNewFormat     avgt    5  1430,276 ±  11,084  ns/op
JavaTimeDateFormatterBenchmark.parseReuseFormat   avgt    5   990,648 ± 280,983  ns/op
SimpleDateFormatterBenchmark.formatNewFormat      avgt    5  1308,144 ±  13,993  ns/op
SimpleDateFormatterBenchmark.formatReuseFormat    avgt    5   392,236 ±   3,219  ns/op
SimpleDateFormatterBenchmark.parseNewFormat       avgt    5  1848,772 ±  19,412  ns/op
SimpleDateFormatterBenchmark.parseReuseFormat     avgt    5  1121,955 ±  12,417  ns/op
```

</details>


[]: https://issues.apache.org/jira/browse/JOHNZON-293
