public class Pet {
    //private data fields - declaration only - no initialization
    private String name;

    //public Constructor(s) - have no return type - differ by input params - init your data fields here
    public Pet() {
        this.setName(" ");
    }

    //public set or mutator methods - return type void
    public void setName(String newName) {
        this.name = newName;
    }

    //public get or accessor method - return type - matches data field data type
    public String getName() {
        return this.name;
    }

    //public toString method - return type String
    public String toString() {
        String output = "Pet name: ";
        output += this.getName();
        return output;
    }

    //main
    public static void main(String[] args) {
        //instantiate Pet
        Pet myPet = new Pet();
        myPet.setName("Fluffy");
        System.out.println("Pet Information:");
        System.out.println(myPet);
    }
}
