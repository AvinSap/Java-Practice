public class Teacher extends Employee{
    String qualification;
    String subject;
    int ratings;

    Teacher(String name, Date date1, Date date2, String qualification, String subject){
        this.name = name;
        this.dateOfBirth = date1;
        this.dateOfAppointment = date2;
        this.subject = subject;
        this.qualification = qualification;

    }
    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date Of Birth: " + this.dateOfBirth.getDate());
        System.out.println("Date Of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualification: " + this.qualification);
    }

    @Override
    void setSalary() {
       this.salary = 5000000;
    }

    @Override
    int getSalary() {
        return this.salary;
    }
}
