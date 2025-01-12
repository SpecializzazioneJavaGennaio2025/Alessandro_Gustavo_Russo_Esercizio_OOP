public class Animal {
  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
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

    public void setAge(int age){
        this.age = age;
    }

    public void whoAmI(){
        System.out.println("I am an animal "+ getName() + "\nMy age Is "+ getAge());
    }

    public boolean equals(Object obj) {
     if(this==obj) {
       return true;
     }
     if (obj == null || this.getClass() != obj.getClass()) {
       return false;
     }
        Animal animal = (Animal) obj;

        return getName().equals(animal.getName()) && getAge() == animal.getAge();
    }
}