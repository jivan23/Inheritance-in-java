

class Animal
{
    static void sound()
    {
        System.out.println(" Different animal has different sounds..");
    }
}

class Dog extends Animal
{
    static void barkingDog()
    {
        System.out.println(" Dog barks as bho bho..");
    }
}

class Cat extends Animal
{
    static void catSound()
    {
    System.out.println(" Cat has sounds as meow meow....");
    }
}

class Inheritance
{
    public static void main(String[] args)
    {

        Animal pp= new Animal();
        pp.sound();

        Dog ab= new Dog();
        ab.sound();
        ab.barkingDog();

        Cat pj = new Cat();
        pj.sound();
        pj.catSound();
        
    
    }
}
