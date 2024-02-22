package org.example.student;

public class PythonStudent implements Student{
    private Integer idPython;
    private String surname;
    private String phone;
    private Integer[] marks;

    public PythonStudent() {
    }

    public PythonStudent(Integer idPython, String surname, String phone, Integer[] marks) {
        this.idPython = idPython;
        this.surname = surname;
        this.phone = phone;
        this.marks = marks;
    }

    public Integer getIdPython() {
        return idPython;
    }

    public void setIdPython(Integer idPython) {
        this.idPython = idPython;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer[] getMarks() {
        return marks;
    }

    public void setMarks(Integer[] marks) {
        this.marks = marks;
    }

    @Override
    public String study() {
        return "Python student learns Python";
    }
}
