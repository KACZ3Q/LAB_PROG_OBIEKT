
public class Prostokat  extends Figura{
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    Prostokat(float wys,float szer, String kolor)
    {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    void setPunkt(double x, double y)
    {
        punkt=new Punkt(x,y);
    }
    void przesun(float x, float y){
        punkt.x+=x;
        punkt.y+=y;
    }
    String opis(){
        return "Klasa Prostokat. \nKolor obiektu: "+kolor
                +"\nWysokosc: "+wys
                +"\nSzerokosc: "+szer;
    }
}
