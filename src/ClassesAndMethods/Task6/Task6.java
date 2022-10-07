package ClassesAndMethods.Task6;

public class Task6 {
    public static void main(String[] args) {
        Student student1 = new Aspirant(3.4);
        Student student2 = new Student(5);
        Aspirant aspirant = new Aspirant(4.4);

        Student[] students = {student1, student2, aspirant};
        for (Student e : students) {
            System.out.println(e.getScholarship());
        }
    }
}

class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        if (getAverageMark() == 5) return 100;
        else return 80;
    }
}

class Aspirant extends Student {

    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5) return 200;
        else return 180;
    }
}
