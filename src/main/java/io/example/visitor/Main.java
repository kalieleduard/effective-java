package io.example.visitor;

import io.example.FlagExecutorFactory;
import io.example.visitor.executors.ProcessCardExecutor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Processing credit cards...");

        final var visa = new Visa();
        final var mastercard = new Mastercard();
        final var elo = new Elo();

        final var flagExecutorFactory = new FlagExecutorFactory(new ProcessCardExecutor());
        flagExecutorFactory.execute(visa);
        flagExecutorFactory.execute(mastercard);
        flagExecutorFactory.execute(elo);
    }
}
