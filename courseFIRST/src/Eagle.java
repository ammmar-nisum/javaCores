public class Eagle extends Birds{



    public Eagle(){
        height = 9.55f;
        weight = 22.5f;
        animalType = "eagle";
        bloodType = "hot";
        canFly ="yes";
        hasFeathers = "yes";
    }
    public Eagle(float height, float weight, String animalType, String bloodType, String canFly, String hasFeathers) {
        super(height, weight, animalType, bloodType, canFly, hasFeathers);
    }

    public String ShowInfo() {
        return "Eagle{" +
                "canFly='" + canFly + '\'' +
                ", hasFeathers='" + hasFeathers + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
