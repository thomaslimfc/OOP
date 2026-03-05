




public class Main {
    public static void main(String[] args) {
        // Abstraction
        System.out.println("<< Abstraction >>");
        Abstr myEngine = new K20();
        myEngine.start();
        myEngine.rev(5000);


        // Encapsulation
        System.out.println("<< Encapsulation >>");
        Encaps vtec = new Encaps();
        System.out.println("rpm now is " + vtec.getCurrentRpm() +"\n");
        vtec.increaseRpm(2000);
        System.out.println("rpm now is " + vtec.getCurrentRpm() +"\n");
        vtec.increaseRpm(9000);
        System.out.println("rpm now is " + vtec.getCurrentRpm() +"\n");


        System.out.println("<< Inheritance >>");
        Inherit myCar = new Inherit("Honda Civic");
        // Parent
        myCar.drive();
        // Child
        Brz myBrz = new Brz("Honda Accord", true);
        myBrz.drive();
        myBrz.launchControl();


        System.out.println("<< Polymorphism >>");
        Poly[] engines = {
                new HondaCivic(),
                new GenericEngine(),
                new ToyotaSupra()
        };

        for (Poly engine: engines) {
            startEngine(engine);
        }
    }

    public static void startEngine(Poly hmm) {
        System.out.println(hmm.start());
    }
}

