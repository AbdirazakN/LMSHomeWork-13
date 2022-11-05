import java.util.Arrays;

public class MyClass {
    private String name;
    private String surname;
    private byte age;
    private String[] lessons;
    private String fdFood;

    public MyClass(String name,String surname,byte age,String[] lessons,String fdFood){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons;
        this.fdFood = fdFood;

    }
    public MyClass(String name,String surname,byte age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public byte getAge(){
        return age;
    }
    public String[] getLessons(){
        return lessons;
    }
    public String getFdFood(){
        return fdFood;
    }

}
