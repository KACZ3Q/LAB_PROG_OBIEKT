class Main
{
	public static void main(String[] arg)
	{
		//zad1();
		zad2();

	}
	public static void zad1()
	{
		Samolot s1=new Samolot();
		s1.Lec();
		Statek st1=new Statek();
		st1.Plyn();
	}
	 public static void zad2()
    {
        Wieloryb w1=new Wieloryb();
        w1.zanurz();
        w1.Plyn();
        w1.wynurz();
        w1.jedz();
        w1.wydalaj();
    }
}
