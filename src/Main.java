public class Main {
    public static void main(String[] args) {
        Person person = new Person("Deniss" , "Maksimenko");
        System.out.println(person.info());
    }
}


//1) создать класс Person
//2) добавить приватные свойства firstName, lastName
//3) добавить конструктор, который получает эти значения через
// параметры и присваивает их свойствам
//4) добавить метод info который возвращает имя и фамилию персоны через пробел
//4.1) в main создать персону и проверить ее метод info
//5) добавить коммит "add Person class"
//6) залить в github