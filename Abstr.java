
abstract class Abstr {
    public abstract void start();
    public abstract void rev(int rpm);
}

class K20 extends Abstr {
    @Override
    public void start() {
        System.out.println("Your engine has started.");
    }

    @Override
    public void rev(int rpm) {
        if (rpm > 7000) {
            System.out.println("    RPM: " + rpm);
            System.out.println("    Remark: You need a VTEC gearbox.");
        } else {
            System.out.println("    RPM: " + rpm);
        }
    }
}



