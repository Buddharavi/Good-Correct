class DrumKit{
boolean topHat=true;
boolean snare=true;

void playTopHat(){
   System.out.println("ding ding ba-ding");
}
void playSnare(){
   System.out.println("bang bang ba-bang");
}	
}
class DrumKitTestDrive{
 public static void main(String [] args){				
 Drumkit d = new DrumKit();
 d.playSnare();
 d.snare=false;
 d.playtopHat();
 
 if(d.snare==true){
 d.playSnare();
 }
 }
}
