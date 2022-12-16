public abstract class Ryba implements Plywa{

    @Override
    public void Plyn() {
        System.out.println("Plywa");
    }

    @Override
    public void wydalaj() {
        System.out.println("Wydala");
    }

    @Override
    public void zanurz() {
        System.out.println("Zanurza sie");
    }

    @Override
    public void wynurz() {
        System.out.println("Wynurza sie");
    }

    public void jedz(){
        System.out.println("Je");
    }

}
