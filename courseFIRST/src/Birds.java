public class Birds extends Animal{
    protected String canFly;
    protected String hasFeathers;
    public Birds(){
        height = 2;
        weight = 3.5f;
        animalType = "bird";
        bloodType = "cold";
        canFly = "yes";
        hasFeathers = "yes";
    }
    public Birds(float height, float weight, String animalType, String bloodType, String canFly, String hasFeathers) {
        super(height, weight, animalType, bloodType);
        this.canFly = canFly;
        this.hasFeathers = hasFeathers;
    }

    public String getCanFly() {
        return canFly;
    }

    public String getHasFeathers() {
        return hasFeathers;
    }

    @Override
    public String showInfo() {
        return "Birds{" +
                "canFly='" + canFly + '\'' +
                ", hasFeathers='" + hasFeathers + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
