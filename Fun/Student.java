package Fun;

public class Student extends Person{

    int course;
    float average_mark;

    Student(int height, float weight, String name, String hair_color, String eyes_color, int course, float average_mark){
        super(height, weight, name, hair_color, eyes_color);
        this.course = course;
        this.average_mark = average_mark;

    }




}