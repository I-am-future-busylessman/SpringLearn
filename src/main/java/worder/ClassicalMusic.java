package worder;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {

    }
    
    public static ClassicalMusic musicFactory() {
        return new ClassicalMusic();
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
        return "classical";
    }
}
