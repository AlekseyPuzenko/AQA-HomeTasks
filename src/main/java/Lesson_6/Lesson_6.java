package Lesson_6;

public class Lesson_6 {
    public static void main(String[] args) {

        Item item1 = new Item("predmet", "01/01/01", "proizvoditel", "strana", 9.99, true);
        item1.displayInfo();

        Item[] spisok = new Item[5];
        spisok[0] = new Item("predmet1", "01/01/01", "proizvoditel1", "strana1", 0.01, false);
        spisok[1] = new Item("predmet2", "02/02/02", "proizvoditel2", "strana2", 0.02, false);
        spisok[2] = new Item("predmet3", "03/03/03", "proizvoditel3", "strana3", 0.03, false);
        spisok[3] = new Item("predmet4", "04/04/04", "proizvoditel4", "strana4", 0.04, false);
        spisok[4] = new Item("predmet5", "05/05/05", "proizvoditel5", "strana5", 0.05, false);

        Park park = new Park();
        Park.Attraction[] attractions = new Park.Attraction[1];
        attractions[0] = park.new Attraction("blevotron3000", "всегда", 1.99);

        attractions[0].attractionInfo();
    }
}