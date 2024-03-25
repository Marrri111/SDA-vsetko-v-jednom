package org.example.javaAdvancedCoding.excercise.task2;

public class Student extends Person {
    private Type typeOfStudy;
    private int yearOfStudy;
    private long studyPrice;

    public Student(Type typeOfStudy, int yearOfStudy, long studyPrice) {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public Type getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(Type typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public long getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(long studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudy=" + typeOfStudy +
                ", yearOfStudy=" + yearOfStudy +
                ", studyPrice=" + studyPrice +
                '}';
    }

    enum Type {
        DAILY,
        COMBINATED;

        public static Type getFromNumber(int t) {
            int s = t % 2;
            return switch (s) {
                case 0 -> DAILY;
                default -> COMBINATED;
            };
        }
    }
}


