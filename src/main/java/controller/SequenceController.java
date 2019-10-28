package controller;

import model.Sequence;
import service.SequenceService;
import util.*;

public class SequenceController {
    private Input           input = new Input();
    private Output          output = new Output();
    private SequenceService service = new SequenceService();

    public void runOrder() {
        Sequence model = new Sequence(getNumber());
        output.resultString(service.sequenceForScreen(model.getNumber()));
    }

    public int getNumber() {
        output.startInfo();
        int num = 0;
        while (num <= 0) {
            output.negativeNumber();
            num = Integer.parseInt(input.getString());
        }
        return num;
    }
}
