public class main {
    public static void main(String[] args) {

        Lion myLion = new Lion() {
            @Override
            public void walkable() {

            }
        };
        //set value for Lion
        myLion.setName("Lion");
        myLion.setSkinColor("Golden Yellow");
        myLion.setBreed("Abyssinian");
        myLion.setWeight(80);

        System.out.println("Iam a "+myLion.getName()+" and my breed is "+myLion.getBreed()+" with Color "+myLion.getSkinColor()+ " weighing "+myLion.getWeight()+" kg.");
        myLion.eat();//call method implemented on Lion class that inherit from parent class animal
        myLion.makeSound();
        System.out.println("I can also do below: ");
        myLion.Walkable();//Call method from a lion class that implement Walkable interface

        Penguin myPenguin = new Penguin() {
            @Override
            public void walkable() {

            }

            @Override
            public void swimmable() {

            }
        };

        myPenguin.setName("Penguin");
        myPenguin.setSkinColor("Black and white");
        myPenguin.setBreed("Gentoo ");
        myPenguin.setWeight(40);

        System.out.println("\nIam a "+myPenguin.getName()+" and my breed is "+myPenguin.getBreed()+" with Color "+myPenguin.getSkinColor()+ " weighing "+myPenguin.getWeight()+" kg.");
        myPenguin.eat();
        myPenguin.makeSound();
        System.out.println("I can also do below: ");
        myPenguin.Walkable();
        myPenguin.Swimmable();

        Dog myDog = new Dog() {
            @Override
            public void walkable() {

            }

            @Override
            public void swimmable() {

            }
        };

        myDog.setName("Dog");
        myDog.setSkinColor("Brown");
        myDog.setBreed("Golden Retriever");
        myDog.setWeight(46);

        System.out.println("\nIam a "+myDog.getName()+" and my breed is "+myDog.getBreed()+" with Color "+myDog.getSkinColor()+ " weighing "+myDog.getWeight()+" kg.");
        myDog.eat();
        myDog.makeSound();
        System.out.println("I can also do below: ");
        myDog.Walkable();
        myDog.Swimmable();

        Cat myCat = new Cat() {
            @Override
            public void walkable() {

            }

            @Override
            public void swimmable() {

            }
        };

        myCat.setName("Cat");
        myCat.setSkinColor("White");
        myCat.setBreed("Persian");
        myCat.setWeight(10);

        System.out.println("\nIam a "+myCat.getName()+" and my breed is "+myCat.getBreed()+" with Color "+myCat.getSkinColor()+ " weighing "+myCat.getWeight()+" kg.");
        myCat.eat();
        myCat.makeSound();
        System.out.println("I can also do below: ");
        myCat.Walkable();
        myCat.Swimmable();

        Cockroach myCockroach = new Cockroach() {
            @Override
            public void crawlable() {

            }

            @Override
            public void flyable() {

            }
        };

        myCockroach.setName("Cockroach");
        myCockroach.setSkinColor("Brown");
        myCockroach.setBreed("Brown-banded Cockroach");
        myCockroach.setWeight(10);

        System.out.println("\nIam a "+myCockroach.getName()+" and my breed is "+myCockroach.getBreed()+" with Color "+myCockroach.getSkinColor()+ " weighing "+myCockroach.getWeight()+" kg.");
        myCockroach.eat();
        myCockroach.makeSound();
        System.out.println("I can also do below: ");
        myCockroach.Flyable();
        myCockroach.Crawlable();
    }


}
