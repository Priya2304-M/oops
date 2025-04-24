interface Playable {
    void play();
}
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football: Kicking the ball towards the goal");
    }
}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball: Bumping, setting, and spiking the ball");
    }
}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball: Dribbling and shooting the ball");
    }
}
public class Testsport {
    public static void main(String[] args) {
      System.out.println("M.Priya darshini,AV.SC.U4CSE24221,CSE-C");
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
