package worder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer myMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        myMusicPlayer.playMusic();
        System.out.println(myMusicPlayer.getName());
        System.out.println(myMusicPlayer.getVolume());

        context.close();
    }
}
