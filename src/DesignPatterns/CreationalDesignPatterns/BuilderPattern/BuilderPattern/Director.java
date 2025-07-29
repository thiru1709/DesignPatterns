package DesignPatterns.CreationalDesignPatterns.BuilderPattern.BuilderPattern;

public class Director {

    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNo(2).setName("Hello").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNo(1).setName("sj").setSubjects().build();
    }
}
