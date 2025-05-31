public class Student extends Person{
    String subject;
    int idNo;
    String school;
    Teacher Teacher;

    Student(String name, String subject, int idNo, String school, Teacher teacher, Date date){
        this.name = name;
        this.subject= subject;
        this.idNo = idNo;
        this.school = school;
        this.Teacher = teacher;
        this.dateOfBirth = date;
    }

    @Override
    void getDetails() {
        System.out.println(this.name + " born in " + this.dateOfBirth.getDate() + " the student of " + this.school + " with ID No: "
                + this.idNo + " Studies " + this.subject + " with Dr." + this.Teacher.name );
    }
}
