package Lesson_6;

public class Park {

    public class Attraction {

        private String attractionname;
        private String workTime;
        private double price;

        public Attraction(String attractionname, String workTime, double price) {

            this.attractionname = attractionname;
            this.workTime = workTime;
            this.price = price;
        }

        public void attractionInfo() {
            System.out.println("Название аттракциона: " + attractionname + " Время работы аттракциона: " + workTime + " Цена: " + price);
        }
    }
}
