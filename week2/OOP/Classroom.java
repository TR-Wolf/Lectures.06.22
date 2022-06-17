package OOP;
public class Classroom {
    //Private Members
    private Teacher[] teachers;
    private Student[] students;

    public Classroom(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    
    public void printClass(){
        for (Teacher teacher : teachers) {
            System.out.println(teacher.introduction() + "\n");
        }
        for (Student student : students) {
            System.out.println(student.introduction());
        }
    }
}
