class Samsung extends FactoryDemo
{
static int price=5000;

 int call(int seconds)
{
return seconds;
}

void sendMessage()
{
System.out.println("Message has been sent");
}

void receiveCall()
{
System.out.println("call has been Received");
}

void verifyFingerPrint()
{
System.out.println("Finger Print Verified");
}

void providePattern()
{
System.out.println("Pattern has been provided");
}

public static void main(String [] args){

Samsung sam=new Samsung();
int sec=sam.call(60);
System.out.println("Call method return value: "+sec);
sam.sendMessage();
sam.receiveCall();
sam.verifyFingerPrint();
sam.providePattern();
sam.browse();
System.out.println(" by object references: "+sam.price);
System.out.println("by Samsung class name: "+Samsung.price);
System.out.println("by class variable name only: "+price);
System.out.println(" by FactoryDemo Class name: "+FactoryDemo.price);
System.out.println(" by FactoryDemo Class name: "+sam.isOriginalPiece);
}
}


