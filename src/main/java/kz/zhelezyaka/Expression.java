package kz.zhelezyaka;

public interface Expression {
    Money reduce(Bank bank, String to);
}
