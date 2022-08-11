package ProgramacaoOrientadaObjetosEx;

/**
 *
 * @author Guilherme
 */
public class Exercicio2_Employee {
    
    public String name;
    public double grossSalary, tax;
    
    public double netSalary(){
        return grossSalary-tax;
    }
    
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage/100.0;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }    
}
