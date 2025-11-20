//Create an abstract class 'Animal' with method 'sound()'. Create classes 'Dog' and 'Cat' that extend
//it and implement the sound method.

package lect11;
abstract class animal
{
    abstract void sound();
}
class Dog extends animal
{
    public void sound()
    {
        System.out.println("Woof");
    }

    
}
class Cat extends animal
{
    public void sound()
    {
        System.out.println("Meow");
    }
}
class main1
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.sound();

        Cat c=new Cat();
        c.sound();
    }
}