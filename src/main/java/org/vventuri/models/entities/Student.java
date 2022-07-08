package org.vventuri.models.entities;

/**
 * The type Student.
 */
public class Student {
    private double p1;
    private double p2;
    private double p3;
    private double absences;

    public Student() {
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getAverage() {
        return (p1 + p2 + p3) / 3;
    }

    public double getAbsences() {
        return absences;
    }

    public void setAbsences(double absences) {
        this.absences = absences;
    }

    /**
     * Gets grade for final exam.
     *
     * @return the grade necessary to graduate
     */
    public double getGradeForFinalExam() {
        if (this.getAverage() >= 50 && this.getAverage() < 70) {
            return Math.ceil(100 - this.getAverage());
        } else return 0;
    }

    /**
     * Gets situation.
     *
     * @return the situation of the student according to the evaluation rules
     */
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

    @Override
    public String toString() {
        return "Student{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", average=" + String.format("%.2f" ,this.getAverage()) +
                ", absences=" + absences +
                ", gradeForFinalExam=" + this.getGradeForFinalExam() +
                ", situation='" + this.getSituation() + '\'' +
                '}';
    }
}
