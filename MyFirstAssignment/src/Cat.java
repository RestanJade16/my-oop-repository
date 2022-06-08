public class Cat extends Animal implements Walkable,Swimmable {

    public void walkable(){
        System.out.println("Walking!");
    }
    public void swimmable(){
        System.out.println("Swimming");

    }

    public void eat(){
        System.out.println("I always peoples left over");
    }

    public void makeSound(){
        System.out.println("I sounds like Meow!");
    }
}
