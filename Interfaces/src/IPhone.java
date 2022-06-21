public class IPhone implements Phone{

    @Override
    public String OS() {
        return "macOS";
    }

    @Override
    public String processor() {
        return "intel11.0";
    }

    @Override
    public int spaceInGB() {
        return 64;
    }
}
