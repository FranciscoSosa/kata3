package kata3;


public class Kata3 {


    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
    
}
