package me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism.printer;

import me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism.Participant;
import me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism.StudyPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CsvPrinter extends StudyPrinter {
    public CsvPrinter(int totalNumberOfEvents, List<Participant> participants) {
        super(totalNumberOfEvents, participants);
    }

    @Override
    public void execute() throws IOException {
        try (FileWriter fileWriter = new FileWriter("participants.cvs");
             PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.println(cvsHeader(this.participants.size()));
            this.participants.forEach(p -> {
                writer.println(getCvsForParticipant(p));
            });
        }
    }
}
