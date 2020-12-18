package kz.zhelezyaka;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Franc franc = (Franc) object;

        return amount == franc.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
