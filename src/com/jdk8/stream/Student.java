package com.jdk8.stream;

public class Student {
    private int score;
    private String name;
    public Student(){

    }
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
