public class Samsung implements Phone {

    @Override
    public String OS() {
        return "Android 13.0";
    }

    @Override
    public String processor() {
        return "SD833";
    }

    @Override
    public int spaceInGB() {
        return 128;
    }
}
