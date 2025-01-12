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

    public void whoAmI() {
        System.out
                .println("I am an amphibian " + getName() + "\nMy age Is " + getAge() + "\nMy breed is " + getBreed());
    }

    public boolean equals(Object obj) {
        // utilizziamo il metodo equals della classe madre per controllare i valori
        // degli attributi
        if (!(super.equals(obj))) {
            return false;
        }
        // Casting dell'oggetto obj per accedere ai metodi della classe Amphibian
        Amphibian amphibian = (Amphibian) obj;
        // solito controllo attributi della classe Amphibian
        return getBreed().equals(amphibian.getBreed());
    }

}
