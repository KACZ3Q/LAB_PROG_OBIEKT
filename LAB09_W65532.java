import java.util.*;

class  InfoUcz{
    int ID,wiek;
    String imie;

    public int getID() {
        return ID;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public InfoUcz(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
public String toString(){
        return ("ID uczestnika: "+ID+"\nWiek: "+wiek+"\nImie: "+imie);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoUcz infoUcz = (InfoUcz) o;
        return ID == infoUcz.ID && wiek == infoUcz.wiek && Objects.equals(imie, infoUcz.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
}

public class LAB09_W65532 {
    public static void main(String[] args) {
        zad1();
    }
    public static void zad1(){
        List<InfoUcz> u=new ArrayList<>(Arrays.asList
                (new InfoUcz(1,18,"Arek"),
        new InfoUcz(2,19,"Bolek"),
        new InfoUcz(3,17,"Bartek"),
        new InfoUcz(4,21,"Dawid"),
        new InfoUcz(5,22,"Tomek"),
        new InfoUcz(6,26,"Ola")
        ));






    }
}