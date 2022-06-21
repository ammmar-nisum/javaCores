public class Laptop {
    private String screen;
    private String ram;
    private String hardDrive;
    private Processor processor;
    private GraphicCard graphicCard;


    public Laptop() {
        this.screen = "Full HD";
        this.ram = "8 GB";
        this.hardDrive = "SATA";
        this.processor = new Processor();
        this.graphicCard = new GraphicCard();
    }

    public Laptop(String screen, String ram, String hardDrive, Processor processor, GraphicCard graphicCard) {
        this.screen = screen;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.processor = processor;
        this.graphicCard = graphicCard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen='" + screen + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", processor=" + processor +
                ", graphicCard=" + graphicCard +
                '}';
    }
}
