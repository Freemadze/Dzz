public class catfishdog {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Father Father = new Father();

        fish.owner = Father;
        cat.owner = Father;
        dog.owner = Father;

    }

    private static class Fish {
        public Father owner;

    }

    private static class Father {


    }

    private static class Cat {
        public Father owner;
    }

    private static class Dog {
        public Father owner;
    }
}
