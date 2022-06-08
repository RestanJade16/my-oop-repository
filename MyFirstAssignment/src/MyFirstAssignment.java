public class MyFirstAssignment {
    public static void main(String[] args) {
        Person myPerson = new Person();

        myPerson.setName("Jade");
        myPerson.setAge(16);
        myPerson.setGender("Male");
        System.out.println("Hello World! I'am "+myPerson.getName()+", a " + myPerson.getGender()+ " and I am "+myPerson.getAge() + " years old");

        Person myPerson2 = new Person();

        myPerson2.setName("Jerome");
        myPerson2.setAge(19);
        myPerson2.setGender("Male");
        System.out.println("Hello World! I'am "+myPerson2.getName()+", a " + myPerson2.getGender()+ " and I am "+myPerson2.getAge() + " years old");

        Person myPerson3 = new Person();

        myPerson3.setName("Jay");
        myPerson3.setAge(18);
        myPerson3.setGender("Male");
        System.out.println("Hello World! I'am "+myPerson3.getName()+", a " + myPerson3.getGender()+ " and I am "+myPerson3.getAge() + " years old");



    }

}
