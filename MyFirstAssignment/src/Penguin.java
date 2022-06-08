public class Penguin extends Animal implements Walkable,Swimmable{

    public void walkable(){
        System.out.println("Walking!");
    }
    public void swimmable(){
        System.out.println("Swimming");

    }

    public void eat(){
        System.out.println("I eat small Fish but Big fish eats me :(");
    }

    public void makeSound(){
        System.out.println("I sounds like gaaaaaawww!");
    }

}
