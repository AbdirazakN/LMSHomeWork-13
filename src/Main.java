import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //MyClass деген класс тузунуз.Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз,
        // жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
        //Параметри эки башка болгон эки конструктор тузунуз. MyClassтын 2 объектисин тузуп, конструктор аркылуу мааани бериниз
        //Эки объектке эки башка конструктор иштесин.Объекттердин маанилерин консольго чыгарыныз.

        MyClass myClass = new MyClass("Abdirazak","Nooruzbai uulu", (byte) 21,new String[]{"Java - 8","English","SoftSkills"},"Adal foods");
        MyClass myClass2 = new MyClass("Abdirazak","Nooruzbai uulu",(byte)21);

        System.out.println("Name:  "+myClass.getName()+"\nSurname:  "+myClass.getSurname()+"\nAge:  "+myClass.getAge()+"\nMy Lessons:  "+ Arrays.toString(myClass.getLessons()) +"\nFavorite foods:  "+myClass.getFdFood());
        System.out.println("Name:  "+myClass2.getName()+"\nSurname:  "+myClass2.getSurname()+"\nAge:  "+myClass2.getAge());
    }
}