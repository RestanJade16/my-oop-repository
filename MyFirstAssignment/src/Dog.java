public abstract class Dog extends Animal implements Walkable,Swimmable{

    public void Walkable(){
        System.out.println("Walking!");
    }
    public void Swimmable(){
        System.out.println("Swimming");
    }

    public void eat(){
        System.out.println("I always eat Dog Food and sometimes Pampers!");
    }

    public void makeSound(){
        System.out.println("I sounds like Arrrrrffff");
    }
}
