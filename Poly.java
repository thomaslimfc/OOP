interface Poly {
    String start();
}

class HondaCivic implements Poly {
    @Override
    public String start() {
        return "F20C: 9000 rpm";
    }
}

class ToyotaSupra implements Poly {
    @Override
    public String start() {
        return "Twin turbo";
    }
}

class GenericEngine implements Poly {
    @Override
    public String start() {
        return "Generic Engine starting...";
    }
}
