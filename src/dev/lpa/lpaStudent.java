package dev.lpa;

import static dev.lpa.Student.random;

public class lpaStudent extends StudentExtra {
    private double percentComplete;

    public lpaStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
