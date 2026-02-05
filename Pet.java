public class Pet {

    private String name;
    
    public Pet() {
        this.setName("Pet Name");
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String output = "Pet information:\n";
        output += "Name: " + this.getName();
        return output;
    }

    public static void main(String[] args) {
        
        Pet pet1 = new Pet();
        System.out.println(pet1);

        System.out.println();
        
        Pet pet2 = new Pet();
        pet2.setName("Fluffy");
        System.out.println(pet2);
    }
}
