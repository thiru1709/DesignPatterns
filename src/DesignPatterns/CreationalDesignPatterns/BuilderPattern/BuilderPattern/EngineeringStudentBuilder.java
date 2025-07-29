package DesignPatterns.CreationalDesignPatterns.BuilderPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("Computer architecture");
        this.subjects = subs;
        return this;
    }
}
