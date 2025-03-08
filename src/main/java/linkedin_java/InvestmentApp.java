package linkedin_java;

import java.util.List;

public class InvestmentApp {
    public static void main(String[] args) {
        List<Double> purchases=List.of(12.38,38.29,5.27,3.21);
        System.out.println(calulateAverageChangeInvested(purchases));
    }

    private static double calulateAverageChangeInvested(List<Double> purchases) {
        double sum=0;
        int i=0;
        for(double d: purchases){
            i++;
            sum=Math.ceil(d)-d+sum;
        }
        return sum/i;
    }
}
