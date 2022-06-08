public abstract class Animal {

    private String name;
    private String skinColor;
    private String breed;
    private int weight;

    public void eat(){

    }

    public void makeSound(){

    }



    public void setName(String name) {
        this.name = name;
    }
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public String getSkinColor() {
        return skinColor;
    }
    public String getBreed() {
        return breed;
    }
    public int getWeight() {
        return weight;
    }
}
