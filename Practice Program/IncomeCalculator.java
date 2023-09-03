public class IncomeCalculator {
    public static void main(String[] args) {
        int startingIncome = 18000;
        double annualIncreasePercentage = 20.0;
        int numberOfYears = 10;
        int total=0;
        int numberOfIncrementsPerYear = 2; // Every 6 months

        for (int year = 1; year <= numberOfYears; year++) {
            
            for (int increment = 1; increment <= numberOfIncrementsPerYear; increment++) {
                startingIncome *= (1 + (annualIncreasePercentage / 100.0));
                for(int j=1;j<=6;j++){
                    total=(int) (total+startingIncome);
                }
                
            }
            System.out.println("Year " + year + ": $" + startingIncome);
            System.out.println("year "+year+" total income="+total);
        }
    }
}