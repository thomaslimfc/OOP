public class Inherit {
    protected String model;
    protected int horsepower;

    public Inherit(String model) {
        this.model = model;
        this.horsepower = 280;
    }

    public void drive() {
        System.out.println("Driving " + model);
    }
}

class Brz extends Inherit {
    private boolean turbo;

    public Brz(String model, boolean turbo) {
        super(model);
        this.turbo = turbo;
        if (turbo) {
            this.horsepower = 320;
        }
    }

    public void launchControl() {
        if (turbo) {
            System.out.println("Launching turbo!");
        } else {
            System.out.println("Normal Launching");
        }
    }

//    @Override
    public void boost() {
        System.out.println("Engaging BRZ performance mode!");
    }
}

