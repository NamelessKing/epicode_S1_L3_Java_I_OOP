package es2;

public class Call {

    private final int durationMinutes;
    private final String calledNumber;

    public Call(int durationMinutes, String calledNumber) {
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("Call duration must be greater than 0");
        }
        if (calledNumber == null || calledNumber.isBlank()) {
            throw new IllegalArgumentException("Called number must not be blank");
        }
        this.durationMinutes = durationMinutes;
        this.calledNumber = calledNumber;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    @Override
    public String toString() {
        return "Call to " + calledNumber + " lasting " + durationMinutes + " minutes";
    }
}
