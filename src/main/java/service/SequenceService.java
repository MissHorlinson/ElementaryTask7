package service;

public class SequenceService {

    public String orderForScreen(int num) {
        String sequence = "0";
        for (int i = 1; i < Math.sqrt(num); i++) {
            sequence += ", " + i;
        }
        return sequence;
    }
}
