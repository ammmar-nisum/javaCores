public class Crocodile extends Reptile{
    private String softShelledEggs;
    public Crocodile(){
        height = 10;
        weight = 200;
        animalType = "croc";
        bloodType = "hot";
        backBone = "yes";
        drySkin = "yes";
        softShelledEggs = "no";
    }
    public Crocodile(float height, float weight, String animalType, String bloodType, String drySkin, String backBone, String softShelledEggs, String hardShelledEggs1) {
        super(height, weight, animalType, bloodType, drySkin, backBone, softShelledEggs);
        this.softShelledEggs = hardShelledEggs1;
    }

    @Override
    public String getSoftShelledEggs() {
        return softShelledEggs;
    }

    @Override
    public String showInfo() {
        return "Crocodile{" +
                "softShelledEggs='" + softShelledEggs + '\'' +
                ", drySkin='" + drySkin + '\'' +
                ", backBone='" + backBone + '\'' +
                ", softShelledEggs='" + softShelledEggs + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
