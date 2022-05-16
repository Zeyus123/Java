package reverse;
abstract class animal
{
public abstract void sound();
}

class dog extends animal
{
  public void soud ()
{
 System.out.print("dog is barking");
}

@Override
public void sound() {
	{
		System.out.print("dog");
	}
	
}
}

class lion extends animal
{
public void sound()
{
System.out.print("lion is raor");
}
}

class test
{
public static void main (String args[])
{
    dog d=new dog();
    lion l=new lion();
   	d.sound();   l.sound();
}
}
