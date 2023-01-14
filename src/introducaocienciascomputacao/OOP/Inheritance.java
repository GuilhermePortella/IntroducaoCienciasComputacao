package introducaocienciascomputacao.OOP;

public class Inheritance {
    
}


public class Animal {
   protected String name;

   public void eat() {
      System.out.println("Animal is eating");
   }
}

public class Dog extends Animal {
   public void eat() {
      System.out.println("Dog is eating");
   }
}
