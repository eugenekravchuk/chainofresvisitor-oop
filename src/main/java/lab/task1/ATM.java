package lab.task1;

import java.util.Arrays;

public class ATM {
    private final ATMHandler handlerChain;

    public ATM(int[] denominations) {
        Arrays.sort(denominations);
        int n = denominations.length;

        ATMHandler head = new CoinHandler(denominations[n - 1]);
        ATMHandler current = head;

        for (int i = n - 2; i >= 0; i--) {
            ATMHandler next = new CoinHandler(denominations[i]);
            current.setNextHandler(next);
            current = next;
        }

        this.handlerChain = head;
    }

    public void dispense(int amount) {
        System.out.println("Requesting " + amount + " to dispense:");
        handlerChain.dispense(amount);
        System.out.println("Dispensing complete.\n");
    }
}