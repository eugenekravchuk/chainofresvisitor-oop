package lab.task1;

public class CoinHandler extends ATMHandler {
    private final int denomination;

    public CoinHandler(int denomination) {
        this.denomination = denomination;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= denomination) {
            int numCoins = amount / denomination;
            int remainder = amount % denomination;

            System.out.println("Dispensing " + numCoins + " coin(s) of denomination " + denomination);

            if (remainder > 0 && nextHandler != null) {
                nextHandler.dispense(remainder);
            } else if (remainder > 0) {
                System.out.println("Cannot dispense the remaining amount: " + remainder);
            }
        } else if (nextHandler != null) {
            nextHandler.dispense(amount);
        } else {
            System.out.println("Cannot dispense the amount: " + amount);
        }
    }
}

