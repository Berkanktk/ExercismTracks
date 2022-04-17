public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int baseSalary = 1000;
        int salaryCap = 2000;
        double multiplierPenalty = multiplierPerDaysSkipped(daysSkipped);
        double salaryBonus = bonusForProductSold(productsSold);

        double total = (baseSalary * multiplierPenalty) + salaryBonus;

        return total <= salaryCap ? total : salaryCap;
    }
}
