public class Main {
    public  static void main(String args[]){
        Processor processor = new Processor("20x", "intelii","200");
        GraphicCard graphicCard = new GraphicCard("Apple",211,"2 gb");

        Laptop gamingLaptop = new Laptop("full hd","8gb","sata",processor,graphicCard);
        System.out.println(gamingLaptop);
    }

}
