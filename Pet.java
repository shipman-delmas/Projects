public class Pet {

    private String type;
    private String name;
    private int age;

    public Pet() {
        this.setType("Animal");
        this.setName("Pet Name");
        this.setAge(1);
    }

    public Pet(String type, String name, int age) {
        this.setType(type);
        this.setName(name);
        this.setAge(age);
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String speak() {

        if (this.type.equalsIgnoreCase("dog")) {
            return "Woof";
        }
        else if (this.type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Noise";
        }

    }

    public String toString() {

        String output = "Pet information:\n";

        output += "Type: " + this.getType() + "\n";
        output += "Name: " + this.getName() + "\n";
        output += "Sound: " + this.speak() + "\n";
        output += "Age:  " + this.getAge();

        return output;

    }

}
