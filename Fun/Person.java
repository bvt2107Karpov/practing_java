package Fun;

public class Person{
    int height;
    float weight;
    String name, hair_color, eyes_color;

    
    public static void Introduce_yourself(String str){
        System.out.println(str);
    }

    
    Person(int height, float weight, String name, String hair_color, String eyes_color){
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.hair_color = hair_color;
        this.eyes_color = eyes_color;
    }

    Person() {}

}