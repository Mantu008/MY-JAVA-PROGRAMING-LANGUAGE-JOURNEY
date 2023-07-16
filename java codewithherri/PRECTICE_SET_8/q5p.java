import javax.sound.sampled.SourceDataLine;

class Tommy{
      public void hit(){
        System.out.println("HITTING THE ENEMY");
      }
      public void running(){
        System.out.println("RUNNING FORM HIRE");
      }
      public void firing(){
        System.out.println("FIRRING ON ENEMY");
      }
}
public class q5p {
    public static void main(String[] args) {
        Tommy player=new Tommy();
        
        player.hit();
        player.running();
        player.firing();
    }
}
