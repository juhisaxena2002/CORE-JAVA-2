class Smartphone implements wifi, gps{
    int phone_numbers;
    void camera(){
        System.out.println("taking snapsot...");
    }
    @Override
    public string[] wifi_names() {
        // TODO Auto-generated method stub
        return null;
    }

    public void location(){
        System.out.println("i am in bhopal okay");
    }

}

interface music{
    void play_music();
    void stop_music();   
}

interface wifi{
    string [ ] wifi_names();
}

interface gps{
    void location();
}

class phone extends Smartphone implements music,wifi,gps{
    public void play_music(){
        System.out.println("playing sa re gaa maa....");
    }

    public void stop_music(){
        System.out.println("okay stopping....");
    }
    // String [ ] wiffStrings = {"jugs", "rich", "richa", "jazz123"};

    public void location(){
        System.out.println("i am in bhopal...");
    }

    @Override
    public string[] wifi_names() {
        // TODO Auto-generated method stub
        return null;
    }
 }





public class interface2 {
   public  Smartphone sp = new Smartphone();
    // sp.play_music();
    // sp.stop_music();
    gps w = new Smartphone();
    //w.location();
   
    // w.play_music();

}
