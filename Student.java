package com.bignerdranch.android.studentlist;

import java.util.ArrayList;
import java.util.List;

public class Student{
    String[] name=new String[25];
    String grade;

    public void setName(String[] name) {
        this.name = name;

    }

    public String getName(int i) {
        return name[i];
    }
    public String[] getName(){
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
