public class TaxCalculator2018 implements TaxCalculator{
    private  double taxableIncome;
    // Constructor
    public TaxCalculator2018(double taxableIncome){
        this.taxableIncome=taxableIncome;
    }
    
    @Override
    public double calculateTax() {
        double v = taxableIncome * 0.2;
        return v;
    }

    /**
     * @return
     */
//    @Override
//    public Object calculateTex() {
//        return null;
//    }
}
