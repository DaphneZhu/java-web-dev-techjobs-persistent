
package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{
    @NotNull
    @ManyToOne
    private Employer employer;

    @NotNull
    @ManyToMany
    private final List<Skill> skillList = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer) {
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
        return skillList;
    }

    public void setSkills(List<Skill> skillList) {
        for (Skill skill : skillList) {
            this.skillList.add(skill);
        }
    }

}

