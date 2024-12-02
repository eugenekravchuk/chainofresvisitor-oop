package lab.task1;

public abstract class ATMHandler {
    protected ATMHandler nextHandler;

    public void setNextHandler(ATMHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void dispense(int amount);
}

