package io.example.visitor.executors;

import io.example.visitor.Elo;
import io.example.visitor.Mastercard;
import io.example.visitor.Visa;
import io.example.visitor.command.VisaCardReceiveBillingCommand;

public class CardReceiveBillingExecutor implements FlagExecutor {

    @Override
    public void execute(final Visa visa) {
        new VisaCardReceiveBillingCommand().execute(visa);
    }

    @Override
    public void execute(final Mastercard mastercard) {
        System.out.println("Receiving billing for Mastercard");
    }

    @Override
    public void execute(final Elo elo) {
        System.out.println("Receiving billing for Elo card");
    }
}
