package com.mycompany.mavenproject2;

public class Passport1 {
    private String fullName;
    private int passNumber;
    private String occupation;
    private boolean passMark;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setPassMark(boolean passMark) {
        this.passMark = passMark;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPassNumber() {
        return passNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public boolean isPassMark() {
        return passMark;
    }

    public Passport1(String fullName, int passNumber, String occupation, boolean passMark) {
        this.fullName = fullName+" ";
        this.passNumber = passNumber;
        this.occupation = " "+occupation+" ";
        this.passMark = passMark;
    }
    
   
    @Override
    public String toString() {
        return fullName + passNumber + occupation + passMark;
    }

    
}
