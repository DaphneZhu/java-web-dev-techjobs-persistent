package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotEmpty(message = "Please fill the job description")
    @Size(min = 1, max = 100)
    private String description;

    @ManyToMany(mappedBy = "skillList")
    private List<Job> jobList = new ArrayList<>();

    public Skill (){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobList() {
        return jobList;
    }


}
