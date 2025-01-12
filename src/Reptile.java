public class Reptile extends Animal {
  private String breed;

  public Reptile(String name, int age, String breed) {
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
        System.out.println("I am a reptile "+ getName() + "\nMy age Is "+ getAge() + "\nMy breed is "+ getBreed());
    }

    public boolean equals(Object obj) {
        if(!(super.equals(obj))){
            return false;
        }

        Reptile reptile = (Reptile) obj;
        return getBreed().equals(reptile.getBreed());
    }


}
