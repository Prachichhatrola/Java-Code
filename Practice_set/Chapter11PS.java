package com.company;

//que 1&2
abstract class pen{
    abstract void write();
   abstract void refill();
}
class FountainPen extends pen{
    public void write(){
        System.out.println("write");
    }
    public void refill(){
        System.out.println("refilling");
    }
    void changeNib(){
        System.out.println("change the nib of pen");
    }
}

//que 3
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("bite");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}

//Q4

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}

class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("ring rong");
    }
    public void lift(){
        System.out.println("connecting the phone");

    }
    public void disconnect(){
        System.out.println("disconnecting the phone");
    }
    void camera(){
        System.out.println("Taking snap");
    }
    }

//Q6
interface TvRemote {
    void switchOn();
    void switchOff();
    void SwitchChannels();
    void Volume();
}
interface SmartTvRemote extends TvRemote{
    void VoiceAssistant();
}

//Q7
class Tv implements TvRemote{
    public void switchOn(){
        System.out.println("Swich on Tv");
    }
    public void switchOff(){
        System.out.println("Swich off Tv");
    }
    public void SwitchChannels(){
        System.out.println("Swich Tv Channels");
    }
    public void Volume(){
        System.out.println("Change volume of Tv");
    }



}



public class Chapter11PS {
    public static void main(String[] args) {
      FountainPen fp = new FountainPen();
      fp.changeNib();
        //Q3
        Human H = new Human();
        H.eat();

        //Q5
        Monkey m = new Human();
        m.bite(); //we can only use the methods of monkey as we passes the reference of monkey

        //Q4
        Telephone st = new SmartTelephone();
        st.lift();

        //Q7
        Tv tv = new Tv();
        tv.SwitchChannels();

    }
}
