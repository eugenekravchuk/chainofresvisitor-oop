package lab.task2;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    public Consumer<T> consumer;
    private String stamp;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getStamp() {
        return stamp;
    }

    @Override
    public void freeze() {
        super.freeze();
    }
}
