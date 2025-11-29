public class Sheep {
    private String name;
    private int age;

    public Sheep(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Bleh :P");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
