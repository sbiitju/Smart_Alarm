package com.sbiitju.smartremainder.ClassSave;

public class ForthClass {
    private  String course;
    private  String time;

    public ForthClass(String course, String time) {
        this.course = course;
        this.time = time;
    }

    public ForthClass() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+"FIfthClass{" +
                "course='" + course + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
