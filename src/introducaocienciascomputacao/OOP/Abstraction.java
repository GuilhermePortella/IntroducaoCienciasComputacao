package introducaocienciascomputacao.OOP;

public class Abstraction {
     private String name;
     private int id;

     public void setName(String name) {
         this.name = name;
     }

     public String getName(){
         return name;
     }
    
}

public interface Person {
     public abstract String getName();
}

public class Employee implements Person {

     private String name;
     private int id;

     public void setName(String name){
         this.name = name;
     }

     public String getName(){
         return name;
     }
}


public Customer implements Person {
     private String name;
     private integer moneySpent;

     public String getName() {
          return name;
     }
}


 public interface Animal {
     public abstract String makeSound();
 }

 public class Cow implements Animal {
     public String makeSound() {
         return "Moo Moo!";
     }
 }

 public class Dog implements Animal {
     public String makeSound() {
         return "Ruff Ruff!";
     }
 }

 public class Sheep implements Animal {
    public String makeSound() {
         return "Baa Baa!";
    }
 }

 // this class demonstrates the polymorphic behavior

 public class Farm {
    public static void main(String[] args) {
       ArrayList<Animal> animals = new ArrayList<Animal>();
       animals.add(new Cow());
       animals.add(new Sheep());
       animals.add(new Dog());

       for (Animal animal : animals) {
          // this is where the polymorphisim occurs
          // each animal will make a different sound
          // because the makeSound method is getting
          // bound to different blocks of code based
          // on the exact type of animal class hiding
          // under the Animal abstraction.
          System.out.println(animal.makeSound());
       }
    }
 }
