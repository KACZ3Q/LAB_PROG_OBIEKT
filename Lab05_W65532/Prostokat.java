import static java.lang.Math.sqrt;

public class Prostokat {
    double wysokosc,szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.wysokosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }
    public double pole(){
        return wysokosc *szerokosc;
    }
    public double obwod(){
        return (2* wysokosc)+(2*szerokosc);
    }
    public double dlugoscprze(){
        return sqrt(szerokosc*szerokosc+ wysokosc * wysokosc);
    }

}
