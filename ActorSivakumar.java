class ActorSivakumar implements Actor
{

static String address="Coimbatore";

ActorSivakumar()
{
System.out.println("This constructor is called by Dynamic binding object");
}

ActorSivakumar(int age, String vehicle )
{
System.out.println("Sivakumar age is "+age+" Sivakumar has an "+vehicle);
}

public void act()
{
System.out.println("Sivakumar is a famous actor");
}
public void dance()
{
System.out.println("Sivakumar can dance verywell");
}
public void sing()
{
System.out.println("Sivakumar can sing too");
}
void speaking()
{
System.out.println("Sivakumar speech will motivate us");
}
public static void main(String[] args)
{
ActorSivakumar as=new ActorSivakumar(65,"Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println(address);
System.out.println(ActorSivakumar.address);
System.out.println(as.address);

Actor ac=new ActorSivakumar();
ac.act();
ac.dance();
ac.sing();
//ac.speaking();
System.out.println(ac.address);
}
}
