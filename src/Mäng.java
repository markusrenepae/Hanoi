import java.util.Scanner;

public class Mäng {
    public static void main(String[] arg){
        int ketasteArv;
        try {
            ketasteArv=Integer.parseInt(arg[0]);}
        catch (Exception e){
            System.out.println("Mängu ainsaks argumendiks peab olema ketaste arv, mis tuleb õigesse järjekorda panna.");
            return;
        }
        System.out.println("Hanoi tornid (Brahma tornid) on matemaatiline mäng või puzzle, mis koosneb kolmest vardast ja erineva suurusega ketastest. Mängu alguses on kõik kettad esimese varda otsas kasvavas järjekorras suurim kõige all, tekitades koonuse. Mängu eesmärk on kõik kettad liigudata esimeselt vardalt kolmandale. Seejuures tuleb järgida kolme reeglit: korraga tohib liigutada ainult ühte ketast, iga käik tähendab pealmise ketta võtmist ja selle asetamist teise varda otsa, kusjuures tuleb järgida, et ei asetatakse suuremat ketast väiksema peale(rikkudes sellega koonuse kuju).");
        Pulk pulk1=new Pulk();
        pulk1.täidaKetastega(ketasteArv);
        Pulk pulk2=new Pulk();
        Pulk pulk3=new Pulk();

        Scanner skänner=new Scanner(System.in);
        String[] käsk;
        while (true){
            käsk=skänner.next().split(",");
            System.out.println("a"+käsk);}
    }
}