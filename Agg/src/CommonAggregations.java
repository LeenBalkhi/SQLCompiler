import java.util.List;

public final class CommonAggregations {
    public double Sum(List<Double> numbers){
        return numbers.
                stream().
                mapToDouble(Double::doubleValue)
                .sum();
    }

    public double Avg(List<Double> numbers){
        return (numbers.
                stream().
                mapToDouble(Double::doubleValue)
                .sum())/numbers.size();
    }
    public double Max(List<Double> numbers){
        double max =-10000000;
        for (double n: numbers
             ) {
            if(n>max)
                max=n;

        }
        return max;
    }
    public double Min(List<Double> numbers){
        double min =10000000;
        for (double n: numbers
        ) {
            if(n<min)
                min=n;

        }
        return min;
    }
    public double Count(List<Object> numbers){
        return numbers.size();
    }
    private static volatile CommonAggregations myCommonAggregator;

    private CommonAggregations(){
        if (myCommonAggregator != null) {
            throw new IllegalStateException("CommonAggregations object is already created!");
        }
    }

    public static CommonAggregations getCommonAggregations() {
        if(myCommonAggregator == null){
            synchronized(CommonAggregations.class) {
                if (myCommonAggregator == null) {
                    myCommonAggregator = new CommonAggregations();
                }
            }
        }
        return myCommonAggregator;
    }
}
