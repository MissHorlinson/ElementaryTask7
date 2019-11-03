package controller;

import model.Sequence;
import service.SequenceService;
import util.*;

public class SequenceController {

    private Input           input = new Input();
    private Output          output = new Output();
    private Validator       validator = new Validator();
    private SequenceService service = new SequenceService();

    public void runSequence() {
        output.startInfo();
        Sequence model = new Sequence(getNumber());
        output.resultString(service.sequenceForScreen(model.getNumber()));
    }

    public int getNumber() {
        String value = input.getString();
        while (!validator.isValid(value)) {
            output.notValidNumber();
            value = input.getString();
        }
        return validator.getInt(value);
    }
}
