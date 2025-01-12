public class Amphibian extends Animal {
    private String breed;

    public Amphibian(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void whoAmI(){
        System.out.println("I am an amphibian "+ getName() + "\nMy age Is "+ getAge() + "\nMy breed is "+ getBreed());
    }

    public boolean equals(Object obj){
        if(!(super.equals(obj))){
            return false;
        }

        Amphibian amphibian = (Amphibian) obj;

        return getBreed().equals(amphibian.getBreed());
    }
    
}
