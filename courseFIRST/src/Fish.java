public class Fish extends Animal{
    protected String liveInWater;
    protected String hasGills;
    public Fish(){
        height = 1.1f;
        weight =3;
        animalType = "fish";
        bloodType = "hot";
        liveInWater = "yes";
        hasGills = "yes";
    }
    public Fish(float height, float weight, String animalType, String bloodType, String liveInWater, String hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }

    public String getLineInWater() {
        return liveInWater;
    }

    public String getHasGills() {
        return hasGills;
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "lineInWater='" + liveInWater + '\'' +
                ", hasGills='" + hasGills + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
