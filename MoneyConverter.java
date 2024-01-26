public class MoneyConverter {
    public static void main(String[] args) {
        MoneyConverterConverter x = new MoneyConverterConverter();
        x.convert(Float.parseFloat(args[0]));
    }
}

class MoneyConverterConverter {
    public void convert(float amount) {

        int quarters = (int) (amount / 0.25);
        amount = (float) (amount % 0.25);

        int dimes = (int) (amount / 0.10);
        amount = (float) (amount % 0.10);

        int nickels = (int) (amount / 0.05);
        amount = (float) (amount % 0.05);

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
    }
}
