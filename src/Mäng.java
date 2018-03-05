import java.util.ArrayList;
import java.util.Scanner;

public class Mäng{
    public static void main(String[] arg){
        int ketasteArv;
        try {ketasteArv=Integer.parseInt(arg[0]);}
        catch (Exception e){
            System.out.println("Mängu ainsaks argumendiks peab olema ketaste arv, mis tuleb õigesse järjekorda panna.");
            return;
        }
        System.out.println("Hanoi tornid (Brahma tornid) on matemaatiline mäng või puzzle, mis koosneb kolmest vardast ja erineva suurusega ketastest. Mängu alguses on kõik kettad esimese varda otsas kasvavas järjekorras suurim kõige all, tekitades koonuse. Mängu eesmärk on kõik kettad liigudata esimeselt vardalt kolmandale. Seejuures tuleb järgida kolme reeglit: korraga tohib liigutada ainult ühte ketast, iga käik tähendab pealmise ketta võtmist ja selle asetamist teise varda otsa, kusjuures tuleb järgida, et ei asetatakse suuremat ketast väiksema peale(rikkudes sellega koonuse kuju).\nketta ühelt pulgalt teisele tõstmiseks sisesta komaga erldatult pulga, millelt ketas võtta ja pulga, millele ketas panna.");
        Pulk[] pulgad=new Pulk[]{new Pulk(),new Pulk(),new Pulk()};
        pulgad[0].täidaKetastega(ketasteArv);

        Scanner skänner=new Scanner(System.in);
        String[] käsk;
        while (pulgad[0].kettad.size()!=0 || pulgad[1].kettad.size()!=0 || !Mäng.isSorted(pulgad[2].kettad)){
            System.out.print(Mäng.isSorted(pulgad[2].kettad));
            System.out.println("pulk1:"+pulgad[0].kettad+"\npulk2:"+pulgad[1].kettad+"\npulk3:"+pulgad[2].kettad);
            käsk=skänner.next().split(",");
            pulgad[Integer.parseInt(käsk[0])-1].tõstaKetasÜmber(pulgad[Integer.parseInt(käsk[1])-1]);
        }
        System.out.print("Võitsid mängu!");
    }
    public static boolean isSorted(ArrayList<Ketas> data){//saadud aadressilt https://codereview.stackexchange.com/questions/58533/checking-if-an-array-is-sorted
        for(int i = 1; i < data.size(); i++){
            if(data.get(i-1).suurus > data.get(i).suurus){
                return false;}
        }
        return true;
    }
}