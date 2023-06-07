class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class Chapter8PS {
    public static void main(String[] args) {
        
        //Q-1 : Create a class Employee with following properties and methods:
        //-> Salary(property)(int)
        //-> getSalary(method returning int)
        //-> name(property)(String)
        //-> getname(method returning String)
        //-> setName(method changing name)

        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //Q-2 : Create a class cellphone with methods to print "ringing...","vibrating..."etc.
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        //Q-3 : Create a class square with a method to initialize its side, calculating area, perimeter etc.

        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //Q-4 : Create a class Rectangle 8 repeat 3.

        Rectangle re = new Rectangle();
        re.length = 3;
        re.width = 4;
        System.out.println(re.area());
        System.out.println(re.perimeter());

        //Q-5 : Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting...), running, Firing etc.

        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

        //Q-6 : Repeat 4 for a circle.
    }
}
