public class Mäng {
    public static void main(String[] arg){
    Pulk pulk1=new Pulk();
    pulk1.täidaKetastega(8);
    Pulk pulk2=new Pulk();
    Pulk pulk3=new Pulk();
    System.out.println(pulk1.kettad);
    pulk1.tõstaKetasÜmber(pulk2);
    System.out.println(pulk1.kettad+";"+pulk2.kettad);
    }
}