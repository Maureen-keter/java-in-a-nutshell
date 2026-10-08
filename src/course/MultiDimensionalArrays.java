public class MultiDimensionalArrays{
    public static void main(String[] args){
        int nums[] = new int[4];
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Tommy";
        s1.marks = 87;

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name = "Jerry";
        s2.marks = 92;

        Student s3 = new Student();
        s3.rollNo = 1;
        s3.name = "Jenny";
        s3.marks = 90;

        Student students[] = new Student[3];

        students[0] =s1;
        students[1] =s2;
        students[2] =s3;

//        for(int i=0; i<students.length; i++){
//            System.out.println(students[i].name);
//        }
        for(Student student : students){
            System.out.println(student.name + ": " + student.marks);
        }

    }
}

class Student{
    int rollNo;
    String name;
    int marks;
}


