public class Employee extends Person {

    public int salary;

    public Employee(String firstName,String lastName,int salary){
        super(firstName,lastName);
        this.salary = salary;
    }
}
//// 1) создать класс Employee, который наследуется от Person
//// 2) добавить свойство salary и реализовать конструктор
//// 3) добавить коммит и новую версию залить на github