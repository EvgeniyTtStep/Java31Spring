package org.example.student;

import java.util.Set;

public class JavaStudent  implements Student{
    private Integer idJava;
    private String name;
    private String email;
    private Set<String>skills;

    public JavaStudent() {
    }

    public JavaStudent(Integer idJava, String name, String email, Set<String> skills) {
        this.idJava = idJava;
        this.name = name;
        this.email = email;
        this.skills = skills;
    }

    public Integer getIdJava() {
        return idJava;
    }

    public void setIdJava(Integer idJava) {
        this.idJava = idJava;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    @Override
    public String study() {
        return "Java student is learning Java";
    }
}
