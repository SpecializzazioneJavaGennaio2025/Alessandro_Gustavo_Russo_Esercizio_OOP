public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Rex", 5);

        Animal animal2 = new Animal("Rex", 5);

        Animal animal3 = new Animal("Rex", 5);

        Reptile reptile = new Reptile("Rex", 5, "Lizard");
        Reptile reptile2 = new Reptile("Tod", 5, "Snake");
        Amphibian amphibian = new Amphibian("Benjamin", 5, "Frog");

        // se uguale reference hanno di conseguenza gli stessi attributi puntando alla
        // stessa locazione di memoria HEAP con STACK diversi
        Amphibian amphibian3 = amphibian;
        // non implementabile perche l'attributo name è privato(da errore con successo)
        // animal.name("Rex");

        animal3.setName(null);

        // stampa dell'oggetto con i suoi attributi tramite il metodo whoAmI
        animal.whoAmI();
        reptile.whoAmI();
        amphibian.whoAmI();

        // confronto tra due oggetti con attributi inizialmente uguali e dopo per Side
        // Effect
        // ho mutato il nome di animal 3 a null per vedere se il controllo funziona
        System.out.println(animal.equals(animal3));// esce ovviamente false confermando il funzionaemnto del controllo
        // confronto tra due oggetti con gli stessi attributi
        System.out.println(amphibian.equals(amphibian3));
        System.out.println(animal.equals(animal2));
        System.out.println(reptile.equals(reptile2));
        // ho scacareggiato provando a fare confronto con oggetti di classe diversa
        // facendo funzionare la seconda parte del controllo che e' sui valori null e in
        // questo caso vede anche se sono di classi diverse(anche se visual code gia mi
        // dice che e' impossibile)
        System.out.println(reptile.equals(amphibian));
    }
}
