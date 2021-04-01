public class MathOperators {

    public static void main(String[] args) {

        // A village chief wants to share the money in her piggy bank
        // saved over a few decades among the elderly people in her village.
        // She decided that each elderly person will receive $28.88 in ang pow
        // Any remainder will be spent on drinks
        // She broke her piggy bank and found she had $34,567.89.
        // How many elderly people can she give?
        // How much will be left over?

        double totalMoney = 34567.89;
        double moneyPerPerson = 28.88;

        int numberOfAngPows = (int)(totalMoney / moneyPerPerson);
        double remainder = totalMoney % moneyPerPerson;

        System.out.printf("Number of elderly beneficiaries: %d.\n", numberOfAngPows);
        System.out.printf("Money remaining: $%.2f\n", remainder);

    }
}
