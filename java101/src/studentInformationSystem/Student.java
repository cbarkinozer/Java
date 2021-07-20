package studentInformationSystem;

public class Student {
	String name;
	String stuNo;
    int classes;
    Course math;
    Course physic;
    Course chemistry;
    double avarage;
    boolean isPass;
    
    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = mat;
        this.physic = fizik;
        this.chemistry = kimya;
        calcAvarage();
        this.isPass = false;
    }
    
    public void addBulkExamNote(int math, int physic, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physic >= 0 && physic <= 100) {
            this.physic.note = physic;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physic.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physic.note + this.chemistry.note + this.math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.math.note);
        System.out.println("Fizik Notu : " + this.physic.note);
        System.out.println("Kimya Notu : " + this.chemistry.note);
    }

}
