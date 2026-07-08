class Bird extends Animal {

    @Override
    void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping.");
    }

    void fly() {
        System.out.println("Bird is flying.");
    }
}