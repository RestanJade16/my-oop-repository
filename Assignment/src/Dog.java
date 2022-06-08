public class Dog extends Animal implements Walkable,Swimmable{

    public void walkable(){
        System.out.println("Walking!");
    }
    public void swimmable(){
        System.out.println("Swimming");
    }

    public void eat(){
        System.out.println("I always eat Dog Food and sometimes Pampers!");
    }

    public void makeSound(){
        System.out.println("I sounds like Arrrrrffff");
    }
}
