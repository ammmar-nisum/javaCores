public class Eel extends Fish{
    private String relaseEeCharge;
    public Eel(){
        height = 1;
        weight = 2;
        animalType = "eel";
        bloodType = "hot";
        liveInWater = "no";
        hasGills ="no";
        relaseEeCharge ="yes";


    }
    public Eel(float height, float weight, String animalType, String bloodType, String liveInWater, String hasGills, String relaseEeCharge) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
        this.relaseEeCharge = relaseEeCharge;
    }

    public String getRelaseEeCharge() {
        return relaseEeCharge;
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "relaseEeCharge='" + relaseEeCharge + '\'' +
                ", lineInWater='" + liveInWater + '\'' +
                ", hasGills='" + hasGills + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
