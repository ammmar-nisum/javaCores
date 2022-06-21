public class Reptile extends Animal{
    protected String drySkin;
    protected String backBone;
    protected String softShelledEggs;

    public Reptile() {
        drySkin = "yes";
        backBone = "unavailable";
        softShelledEggs = "yes";
        height = 2.2f;
        weight = 5.5f;
        animalType = "reptile";
        bloodType = "cold";
    }

    public Reptile(float height, float weight, String animalType, String bloodType, String drySkin, String backBone, String softShelledEggs) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.backBone = backBone;
        this.softShelledEggs = softShelledEggs;
    }

    public String getDrySkin() {
        return drySkin;
    }

    public String getBackBone() {
        return backBone;
    }

    public String getSoftShelledEggs() {
        return softShelledEggs;
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
                "drySkin='" + drySkin + '\'' +
                ", backBone='" + backBone + '\'' +
                ", softShelledEggs='" + softShelledEggs + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
