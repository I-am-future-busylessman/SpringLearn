package worder;

public class RockMusic implements Music{
    private RockMusic() {}

    public static RockMusic musicFactory() {
        return new RockMusic();
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
        return "rock";
    }
}
