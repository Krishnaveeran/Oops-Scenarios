package india.newDelhi;
//import tamilnadu.chennai.TrafficRulesChennai;

class CommonManInDelhi implements TrafficRulesDelhi,tamilnadu.chennai.TrafficRulesChennai
{

public void goByDieselVehicle()
{
System.out.println("Go by diesel Vehicele");
}
public void dontGoByDieselVehicle()
{
System.out.println("Don't Go by diesel Vehicele");
}
public void goByBicycle()
{
System.out.println("Go by Bicycle");
}
public static void main(String[] args)
{
CommonManInDelhi cmid=new CommonManInDelhi();
cmid.dontGoByDieselVehicle();
cmid.goByBicycle();
cmid.goByDieselVehicle();
}
}



