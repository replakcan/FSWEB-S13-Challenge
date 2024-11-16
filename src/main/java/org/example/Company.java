package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private  double giro;
    private String[] developerNames;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public Company(String[] developerNames, double giro, String name, int id) {
        this.developerNames = developerNames;
        this.giro = Math.max(giro, 0.0);
        this.name = name;
        this.id = id;
    }

    public void addCompany(int index, String name) {
        if (this.developerNames[index] != null){
            System.out.println(index + " dolu gardas siraya gir");
        } else {
            this.developerNames[index] = name;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
