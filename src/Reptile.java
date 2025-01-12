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

    public void whoAmI() {
        System.out.println("I am a reptile " + getName() + "\nMy age Is " + getAge() + "\nMy breed is " + getBreed());
    }

    public boolean equals(Object obj) {
        // utilizziamo il metodo equals della classe padre per controllare i valori
        // degli attributi
        if (!(super.equals(obj))) {
            return false;
        }
        // Casting dell'oggetto obj per accedere ai metodi della classe Reptile
        Reptile reptile = (Reptile) obj;
        // solito controllo attributi della classe Reptile
        return getBreed().equals(reptile.getBreed());
    }

}
