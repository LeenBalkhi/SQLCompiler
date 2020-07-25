import java.util.List;

public final class CommonAggregations {
    public double sum(List<Double> numbers){
        return numbers.
                stream().
                mapToDouble(Double::doubleValue)
                .sum();
    }

    public double avg(List<Double> numbers){
        return (numbers.
                stream().
                mapToDouble(Double::doubleValue)
                .sum())/numbers.size();
    }
    public double max(List<Double> numbers){
        double max =-10000000;
        for (double n: numbers
             ) {
            if(n>max)
                max=n;

        }
        return max;
    }
    public double min(List<Double> numbers){
        double min =10000000;
        for (double n: numbers
        ) {
            if(n<min)
                min=n;

        }
        return min;
    }
    public double count(List<Object> numbers){
        return numbers.size();
    }
    public double stdev(List<Double> columns)
    {
        double standardDeviation;
        double sum=0;
        for ( double c: columns)
        {
            sum+= c;
        }
        double avg = sum/columns.size();
        double sd =0;
        for ( double c: columns)
        {
            sd+= pow(c-avg,2)/columns.size();
        }
        standardDeviation = sqrt(sd);
        return  standardDeviation;
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
