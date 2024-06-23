package io.example.visitor.executors;

import io.example.visitor.Elo;
import io.example.visitor.Mastercard;
import io.example.visitor.Visa;

public interface FlagExecutor {

    void execute(Visa visa);
    void execute(Mastercard mastercard);
    void execute(Elo elo);

}
