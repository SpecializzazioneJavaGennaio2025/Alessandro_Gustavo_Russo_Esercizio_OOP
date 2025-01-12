public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Rex", 5);

        Animal animal2 = new Animal("Rex", 5);
        Reptile reptile = new Reptile("Rex", 5, "Lizard");
        Reptile reptile2 = new Reptile("Tod", 5, "Snake");
        Amphibian amphibian = new Amphibian("Rex", 5, "Frog");

        // se uguale reference hanno di conseguenza gli stessi attributi puntando alla
        // stessa locazione di memoria HEAP con STACK diversi
        Amphibian amphibian3 = amphibian;
        // non implementabile perche l'attributo name è privato(da errore con successo)
        // animal.name("Rex");
        //stampa dell'oggetto con i suoi attributi tramite il metodo whoAmI
        animal.whoAmI();
        reptile.whoAmI();
        amphibian.whoAmI();

        // confronto tra due oggetti con gli stessi attributi
        System.out.println(amphibian.equals(amphibian3));
        System.out.println(animal.equals(animal2));
        System.out.println(reptile.equals(reptile2));
        // ho scacareggiato provando a fare confronto con oggetti di classe diversa
        System.out.println(reptile.equals(amphibian));
    }
}
