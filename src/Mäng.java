public class Mäng {
    public static void main(String[] arg){
        int ketasteArv;
        try {
            ketasteArv=Integer.parseInt(arg[0]);}
        catch (Exception e){
            System.out.println("Mängu ainsaks argumendiks peab olema ketaste arv, mis tuleb õigesse järjekorda panna.");
            return;
        }
        Pulk pulk1=new Pulk();
        pulk1.täidaKetastega(ketasteArv);
        Pulk pulk2=new Pulk();
        Pulk pulk3=new Pulk();
        System.out.println(pulk1.kettad);
        pulk1.tõstaKetasÜmber(pulk2);
        System.out.println(pulk1.kettad+";"+pulk2.kettad);
    }
}