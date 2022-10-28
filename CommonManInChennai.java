package tamilnadu.chennai;

class CommonManInChennai implements TrafficRulesChennai
{
public void goByDieselVehicle()
{
System.out.println("Go by diesel Vehicele");
}
public void goByBicycle()
{
System.out.println("Go by Bicycle");
}

public static void main(String[] args)
{
CommonManInChennai cmic=new CommonManInChennai();
cmic.goByDieselVehicle();
cmic.goByBicycle();
}
}
