abstract class SmartPhone
{
SmartPhone()
{
System.out.println("Constructor: Smart phone under development");
}

abstract int call(int seconds);
abstract void sendMessage();
abstract void receiveCall();
void browse()
{
System.out.println("Smartphone browsing");
}

}
