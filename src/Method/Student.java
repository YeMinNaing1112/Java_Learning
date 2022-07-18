package Method;

public class Student {
    String name;
    int id;
    int mark;
    int grade;
    static String schoolName = "1";

    void  inset(String n,int i,int m,int g){
        name=n;
        id=i;
        mark=m;
        grade=g;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.name = "Mg Mg";
        student1.id = 1;
        student1.mark = 23;
        student1.grade = 11;
        System.out.println(student1.name);
        System.out.println(student1.id);
        System.out.println(student1.mark);
        System.out.println(student1.grade);
        System.out.println(schoolName);

        student2.name = "Aung Aung";
        student2.id = 1;
        student2.mark = 23;
        student2.grade = 11;
        System.out.println(student2.name);
        System.out.println(student1.id);
        System.out.println(student1.mark);
        System.out.println(student1.grade);
        System.out.println(schoolName);


        student3.name = "Cow Cow";
        student3.id = 1;
        student3.mark = 23;
        student3.grade = 11;

        System.out.println(student3.name);
        System.out.println(student3.id);
        System.out.println(student3.mark);
        System.out.println(student3.grade);
        System.out.println(schoolName);


        Student student4=new Student();
        student4.inset("Mg Ayew",12,56,5);
        System.out.println(student4.name);
        System.out.println(student4.id);
        System.out.println(student4.mark);
        System.out.println(student4.grade);

    }
}
