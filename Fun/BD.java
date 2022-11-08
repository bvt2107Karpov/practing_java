package Fun;

import java.util.Scanner;

public class BD{
    public static void main(String[] args){

        String stats = "stats";
        String bio = "bio";

        Users user_1 = new Users("user_1", "12345");
        Users user_2 = new Users("user_2", "12345");
        Users user_3 = new Users("user_3", "12345");
        Users admin = new Users("admin", "qwerty");
        Users main_admin = new Users("main_admin", "qwerty123");

        Person person_1 = new Person (175, 68.2f, "Misha", "Brown", "Brown");
        Person person_2 = new Person (190, 91.2f, "Stas", "Blond", "Gray");
        Person person_3 = new Person (210, 115.9f, "Dima", "Brown", "Brown");
        Person person_4 = new Person (187, 87.3f, "Sasha", "Blond", "Green");
        Person person_5 = new Person (300, 150.7f, "Jake", "Blond", "Blue");

        Student student_1 = new Student (175, 68.2f, "Misha", "Brown", "Brown", 2, 3.7f);
        Student student_2 = new Student (190, 91.2f, "Stas", "Blond", "Gray", 4, 4.7f);
        Student student_3 = new Student (210, 115.9f, "Dima", "Brown", "Brown", 4, 4.2f);
        Student student_4 = new Student (187, 87.3f, "Sasha", "Blond", "Green", 1, 4.8f);
        Student student_5 = new Student (300, 150.7f, "Jake", "Blond", "Blue", 3, 3.4f);

        Scanner input_name_of_student = new Scanner(System.in);
        Scanner input_your_login = new Scanner(System.in);
        Scanner input_your_password = new Scanner(System.in);
        Scanner stats_bio = new Scanner(System.in);


        System.out.println("Your login: ");
        String your_login = input_your_login.nextLine();

        System.out.println("Your password: ");
        String your_password = input_your_password.nextLine();


        if ((your_login.equals(user_1.login) && your_password.equals(user_1.password)) || (your_login.equals(user_2.login) && your_password.equals(user_2.password)) || (your_login.equals(user_3.login) && your_password.equals(user_3.password))){
                System.out.println ("Welcome to the site!");
        }
        else if ((your_login.equals(admin.login) && your_password.equals(admin.password)) || (your_login.equals(main_admin.login) && your_password.equals(main_admin.password))){
                System.out.println ("\n" + "\n" + "     Welcome, administrator" + "\n" + "--------------------------------" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--       Choose options       --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "-- Check stats      Check bio --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--                            --" + "\n" + "--------------------------------");
                String answer = stats_bio.nextLine();

                if (answer.equals(stats)){
                        System.out.println("\n" + "Список всех студентов: " + "\n" + "\n" + person_1.name + "\n" + person_2.name + "\n" + person_3.name + "\n" + person_4.name + "\n" + person_5.name + "\n" + "\n" + "\n" + "Напишите имя студента, чьи данные вы хотите получить: ");
                        String name_of_student = input_name_of_student.nextLine();

                        if (name_of_student.equals(student_1.name)){
                                student_1.Introduce_yourself("My name ------ " + student_1.name + "\n" + "I`m in " + student_1.course + " course" + "\n" + "My average mark ------ " + student_1.average_mark);
                        }
                        else if (name_of_student.equals(person_2.name)){
                                student_2.Introduce_yourself("My name ------ " + student_2.name + "\n" + "I`m in " + student_2.course + " course" + "\n" + "My average mark ------ " + student_2.average_mark);
                        }
                        else if (name_of_student.equals(person_3.name)){
                                student_3.Introduce_yourself("My name ------ " + student_3.name + "\n" + "I`m in " + student_3.course + " course" + "\n" + "My average mark ------ " + student_3.average_mark);
                        }
                        else if (name_of_student.equals(person_4.name)){ 
                                student_4.Introduce_yourself("My name ------ " + student_4.name + "\n" + "I`m in " + student_4.course + " course" + "\n" + "My average mark ------ " + student_4.average_mark);
                        }                               
                        else if (name_of_student.equals(person_5.name)){
                                student_5.Introduce_yourself("My name ------ " + student_5.name + "\n" + "I`m in " + student_5.course + " course" + "\n" + "My average mark ------ " + student_5.average_mark);
                        }
                        else{
                                System.out.println("Error, student is undefined");}

                }

                else if (answer.equals(bio)){

                        System.out.println("Список всех студентов: " + "\n" + "\n" + person_1.name + "\n" + person_2.name + "\n" + person_3.name + "\n" + person_4.name + "\n" + person_5.name + "\n" + "\n" + "\n" + "Напишите имя студента, чьи данные вы хотите получить: ");
                        String name_of_student = input_name_of_student.nextLine();

                        if (name_of_student.equals(person_1.name)){
                                person_1.Introduce_yourself("My name ------ " + person_1.name + "\n" + "My height ------ " + person_1.height + "cm" + "\n" + "My weight ------ " + person_1.weight + "kg" + "\n" + "My hair color ------ " + person_1.hair_color + "\n" + "My eyes color ------ " + person_1.eyes_color);}

                        else if (name_of_student.equals(person_2.name)){
                                person_2.Introduce_yourself("\n" + "My name ------ " + person_2.name + "\n" + "My height ------ " + person_2.height + "cm" + "\n" + "My weight ------ " + person_2.weight + "kg" + "\n" + "My hair color ------ " + person_2.hair_color + "\n" + "My eyes color ------ " + person_2.eyes_color);}
        
                        else if (name_of_student.equals(person_3.name)){
                                person_3.Introduce_yourself("\n" + "My name ------ " + person_3.name + "\n" + "My height ------ " + person_3.height + "cm" + "\n" + "My weight ------ " + person_3.weight + "kg" + "\n" + "My hair color ------ " + person_3.hair_color + "\n" + "My eyes color ------ " + person_3.eyes_color);}

        
                        else if (name_of_student.equals(person_4.name)){
                                person_4.Introduce_yourself("\n" + "My name ------ " + person_4.name + "\n" + "My height ------ " + person_4.height + "cm" + "\n" + "My weight ------ " + person_4.weight + "kg" + "\n" + "My hair color ------ " + person_4.hair_color + "\n" + "My eyes color ------ " + person_4.eyes_color);}

        
                        else if (name_of_student.equals(person_5.name)){
                                person_5.Introduce_yourself("\n" + "My name ------ " + person_5.name + "\n" + "My height ------ " + person_5.height + "cm" + "\n" + "My weight ------ " + person_5.weight + "kg" + "\n" + "My hair color ------ " + person_5.hair_color + "\n" + "My eyes color ------ " + person_5.eyes_color);}

        
                        else{
                                System.out.println("Error, student is undefined");}
        


                }

                else{
                        System.out.println("Error");
                }
        }

    }
}

