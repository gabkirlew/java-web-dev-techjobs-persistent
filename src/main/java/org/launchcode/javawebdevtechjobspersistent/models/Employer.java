package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 1, max = 100)
    private String location;

    @OneToMany //Added
    @JoinColumn
    //@JoinColumn(name = "employer") //Added
    private final List<Job> jobs = new ArrayList<>(); //Added

    public Employer() {
    }

    public Employer(String aLocation) {
        location = aLocation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
