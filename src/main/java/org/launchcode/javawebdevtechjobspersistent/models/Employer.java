package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotEmpty (message = "Please add the location")
    @Size(min = 1, max = 120)
    private String location;

    @OneToMany(mappedBy = "employer")
    //@JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer (String location) {
        this.location = location;
    }


    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

}

