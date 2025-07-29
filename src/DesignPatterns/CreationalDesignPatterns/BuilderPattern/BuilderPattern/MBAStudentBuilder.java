package DesignPatterns.CreationalDesignPatterns.BuilderPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{


    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Finance");
        subs.add("Micro economics");
        this.subjects = subs;
        return this;
    }
}
