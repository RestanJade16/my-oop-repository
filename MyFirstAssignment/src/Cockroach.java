
public abstract class Cockroach extends Animal implements Crawlable,Flyable {

    public void Crawlable(){
        System.out.println("Crawling");
    }
    public void Flyable(){
        System.out.println("Flyable");
    }
    public void eat(){
        System.out.println("I eat anything, even unimaginable food :D");
    }

    public void makeSound(){
        System.out.println("I sounds like shshshshshshsh!");
    }

}
