package io.example;

import io.example.visitor.CreditCard;
import io.example.visitor.Elo;
import io.example.visitor.Mastercard;
import io.example.visitor.Visa;
import io.example.visitor.executors.FlagExecutor;

import java.util.Objects;

public class FlagExecutorFactory {

    private final FlagExecutor executor;

    public FlagExecutorFactory(final FlagExecutor anExecutor) {
        this.executor = Objects.requireNonNull(anExecutor);
    }

    public void execute(final CreditCard card) {
        switch (card) {
            case Visa visa -> executor.execute(visa);
            case Mastercard mastercard -> executor.execute(mastercard);
            case Elo elo -> executor.execute(elo);
        };
    }
}
