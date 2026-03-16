public class Encaps {
    private boolean vtecStatus = false;
    private int currentRpm = 0;

    public void increaseRpm(int amount) {
        this.currentRpm = this.currentRpm + amount;
        checkVtec();
    }

    private void checkVtec() {
        if (this.currentRpm > 5800 && !this.vtecStatus) {
            this.vtecStatus = true;
            System.out.println("    VTEC Status: ON");
            System.out.println("    Current RPM: " + currentRpm);
        } else if (this.currentRpm < 5800) {
            this.vtecStatus = false;
            System.out.println("    VTEC Status: OFF");
            System.out.println("    Current RPM: " + currentRpm);
        }
    }

    public boolean getVtecStatus() {
        return this.vtecStatus;
    }

    public int getCurrentRpm() {
        return this.currentRpm;
    }
}
