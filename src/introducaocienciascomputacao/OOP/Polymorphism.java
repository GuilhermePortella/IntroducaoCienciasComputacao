package introducaocienciascomputacao.OOP;

public class Polymorphism {
    
}


public abstract class Human{
   ...
   public abstract void goPee();
}


public class Male extends Human{
...
    @Override
    public void goPee(){
        System.out.println("Stand Up");
    }
}


public class Female extends Human{
...
    @Override
    public void goPee(){
        System.out.println("Sit Down");
    }
}


public static void main(String[] args){
    ArrayList<Human> group = new ArrayList<Human>();
    group.add(new Male());
    group.add(new Female());
    // ... add more...

    // tell the class to take a pee break
    for (Human person : group) person.goPee();
}


Stand Up
Sit Down
...