import java.util.ArrayList;

public class Pulk {
    ArrayList<Ketas> kettad=new ArrayList<>();
    public void tõstaKetasÜmber(Pulk pulkKuhuTõsta){
        pulkKuhuTõsta.kettad.add(this.kettad.get(this.kettad.size()-1));
        this.kettad.remove(this.kettad.size()-1);
    }
    public void täidaKetastega(int n){
        for (int i=0;i<n;i++){
            kettad.add(new Ketas(i));}
    }
}