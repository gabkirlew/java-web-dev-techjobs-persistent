package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;


//@Entity
//public class Job extends AbstractEntity{
//
//    @ManyToOne
//    private Employer employer;
//
//    private String skills;
//
//    public Job() {
//    }
//
//    public Job(Employer anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }
//
//    public Job(Employer anEmployer) {  //Added not sure if necessary
//        super();
//        this.employer = anEmployer;
//    }
//
//
//    // Getters and setters.
//
//
//
//    public Employer getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//}

@Entity
//@Access(AccessType.PROPERTY) //Add on
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    //private String skills;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }


    public Job(Employer anEmployer) {  //Added not sure if necessary
        super();
        this.employer = anEmployer;
    }


    // Getters and setters.



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    //    public void addSkills(Skill skill) {
//        this.skills.add(skill);
//    }

    //Got rid of setter since final variable
}
