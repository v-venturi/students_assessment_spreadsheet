package org.vventuri.models.entities;

public class Student {
    private double p1;
    private double p2;
    private double p3;
    private double average;
    private double absences;
    private double gradeForFinalExam;
    private String situation;

    public Student(double p1, double p2, double p3, double average, double absences, double gradeForFinalExam,
                   String situation)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.average = average;
        this.absences = absences;
        this.gradeForFinalExam = gradeForFinalExam;
        this.situation = situation;
    }

    public Student() {
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getAverage() {
        return (p1 + p2 + p3) / 3;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAbsences() {
        return absences;
    }

    public void setAbsences(double absences) {
        this.absences = absences;
    }

    public double getGradeForFinalExam() {
        if (this.getAverage() >= 50 && this.getAverage() < 70) {
            return Math.ceil(100 - this.getAverage());
        } else return (int) 0;

    }

    public void setGradeForFinalExam(double gradeForFinalExam) {
        this.gradeForFinalExam = gradeForFinalExam;
    }

    public String getSituation() {
        if (this.getAbsences() > 60 * 0.25) {
            return "Reprovado por Falta";
        } else if (this.getAverage() >= 70) {
            return "Aprovado";
        } else if (this.getAverage() >= 50) {
            return "Exame Final";
        } else if (this.getAverage() < 50) {
            return "Reprovado por Nota";
        }
        return null;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "Student{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", average=" + average +
                ", absences=" + absences +
                ", gradeForFinalExam=" + gradeForFinalExam +
                ", situation='" + situation + '\'' +
                '}';
    }
}
