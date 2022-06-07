public abstract class Penguin extends Animal implements Walkable,Swimmable{

    public void Walkable(){
        System.out.println("Walking!");
    }
    public void Swimmable(){
        System.out.println("Swimming");

    }

    public void eat(){
        System.out.println("I eat small Fish but Big fish eats me :(");
    }

    public void makeSound(){
        System.out.println("I sounds like gaaaaaawww!");
    }

}
