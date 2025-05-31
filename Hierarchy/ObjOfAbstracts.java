public class ObjOfAbstracts {
    public static void main(String[] args){
        Date date1 = new Date(28,5,2007);// DOB Student
        Date date2 = new Date(19,7,2002);//DOB Teacher
        Date date3 = new Date(1,8,2023);//Appointment Date

        Teacher teacher = new Teacher("Avin", date2, date3,"Java Developer","CS");
        teacher.setSalary();
        teacher.getDetails();
        Student student = new Student("Abhiyan", "Mathematics",1234567,"Global Intl", teacher, date1);
        student.getDetails();

    }
}
