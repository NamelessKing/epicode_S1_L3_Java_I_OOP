package es2;

public class SimCard {

    private static final int MAX_CALLS = 5;

    private final String phoneNumber;
    private double creditEuro;
    private final Call[] recentCalls;
    private int callCount;

    public SimCard(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number must not be blank");
        }
        this.phoneNumber = phoneNumber;
        this.creditEuro = 0.0;
        this.recentCalls = new Call[MAX_CALLS];
        this.callCount = 0;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getCreditEuro() {
        return creditEuro;
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Top-up amount must be greater than 0");
        }
        creditEuro += amount;
    }

    public void addCall(Call call) {
        if (call == null) {
            throw new IllegalArgumentException("Call must not be null");
        }

        if (callCount < MAX_CALLS) {
            recentCalls[callCount++] = call;
        } else {
            shiftCallsLeft();
            recentCalls[MAX_CALLS - 1] = call;
        }
    }

    private void shiftCallsLeft() {
        for (int i = 1; i < MAX_CALLS; i++) {
            recentCalls[i - 1] = recentCalls[i];
        }
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Phone number: ").append(phoneNumber).append("\n");
        sb.append("Credit available: €").append(String.format("%.2f", creditEuro)).append("\n");
        sb.append("Recent calls:\n");

        if (callCount == 0) {
            sb.append("No calls\n");
        } else {
            for (int i = 0; i < callCount; i++) {
                sb.append("- ").append(recentCalls[i]).append("\n");
            }
        }
        return sb.toString();
    }
}
