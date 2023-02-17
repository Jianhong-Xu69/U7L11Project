public class PackageCalculator {
    private static final double BASE_COST = 3.75; //constant base cost
    private static final double TENTH_POUND_BASE = 0.05; //rate if not oversize or weight (double for oversize per inch/overweight per tenth pound)
    private static final double OVERWEIGHT_THRESHOLD = 40;
    private static final double OVERSIZE_THRESHOLD = 36;
    //divide difference of county codes (first 3 digits of zip) by 100 and add that
    //ex: 20099 10099 is (200-100)/100

    public static double CalculatePostage (String zip1, String zip2, double weight, double dimensions){
        double temp = BASE_COST;
        int[] zips = {Integer.parseInt(zip1.substring(0,3)) , Integer.parseInt(zip2.substring(0,3))};
        temp += (double) (Math.abs(zips[0] - zips[1])) / 100;
        temp += (weight*10)*TENTH_POUND_BASE;
        if (weight > OVERWEIGHT_THRESHOLD){
            temp += (weight - OVERWEIGHT_THRESHOLD)*10*TENTH_POUND_BASE;
        }
        if (dimensions > OVERSIZE_THRESHOLD){
            temp += (dimensions - OVERSIZE_THRESHOLD)*(TENTH_POUND_BASE*2);
        }
        return temp;
    }
    public static double CalculatePostage (Address start, Address end, double weight, double dimensions){
        String[] zips = {start.getZipCode().substring(0,3) , end.getZipCode().substring(0,3)};
        double temp = CalculatePostage(zips[0], zips[1], weight, dimensions);
        return temp;
    }
    public static double CalculatePostage (Package pack){
        Address[] zips = {pack.getOrigin(), pack.getDestination()};
        double temp = CalculatePostage(zips[0], zips[1], pack.getWeight(), pack.getLength() * pack.getWidth() * pack.getHeight());
        return temp;
    }
}
