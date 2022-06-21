public class Animal
{
    protected float height;
    protected float weight;
    protected String animalType;
    protected String bloodType;

    public Animal() {
        height = 0;
        weight =0;
        animalType = "unknown";
        bloodType = "unknown";

    }

    public Animal(float height, float weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String showInfo() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
