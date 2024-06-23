package io.example.visitor.executors;

import io.example.visitor.Elo;
import io.example.visitor.Mastercard;
import io.example.visitor.Visa;

public class ProcessCardExecutor implements FlagExecutor {

    @Override
    public void execute(final Visa visa) {
        System.out.println("Processing Visa card");
    }

    @Override
    public void execute(final Mastercard mastercard) {
        System.out.println("Processing Mastercard");
    }

    @Override
    public void execute(final Elo elo) {
        System.out.println("Processing Elo card");
    }
}
