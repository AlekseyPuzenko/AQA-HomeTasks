package Lesson_6;

public class Item {

    private String name;
    private String created;
    private String creator;
    private String country;
    private double price;
    private Boolean reserved;

    public Item(String name, String created, String creator, String country, double price, Boolean reserved) {
        this.name = name;
        this.created = created;
        this.creator = creator;
        this.country = country;
        this.price = price;
        this.reserved = reserved;
    }

    public void displayInfo() {
        System.out.printf("Name: %s \ncreated: %s \ncreator: %s \ncountry: %s \nprice: %.2f \nreserved: %b\n",
                name, created, creator, country, price, reserved);
    }
}



