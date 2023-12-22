import java.util.List;

class AvgCalculator {
    public static double calculateAverage(List<Double> values) {
        if (values.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }

        return sum / values.size();
    }
}
