package worder;

public class RapMusic implements Music {
    private RapMusic() {}

    public static RapMusic musicFactory() {
        return new RapMusic();
    }
    @Override
    public void doMyInit() {
        System.out.println("Initialization... " + getSong());
    }
    @Override
    public void doMyDestroy() {
        System.out.println("Destroing... " + getSong());
    }
    @Override
    public String getSong() {
        return "rap";
    }
}
