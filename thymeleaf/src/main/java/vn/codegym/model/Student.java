package vn.codegym.model;

public class Student {
    private Integer id;
    private String name;
    private int gender;
    private String[] languages;

    public Student() {
    }


    public Student(Integer id, String name, int gender, String[] languages) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.languages = languages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
