package io.example.visitor.command;

import io.example.visitor.Visa;

public record VisaCardReceiveBillingCommand() {

    public void execute(final Visa visa) {
        System.out.println("Receiving billing for Visa card");
    }
}
