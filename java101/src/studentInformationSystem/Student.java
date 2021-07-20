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
    
    
    Student(String name, int classes, String stuNo, Course math,Course physic,Course chemistry) {
        
    	this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        
        this.math.verbalNotePercent = 20;
        this.physic.verbalNotePercent = 30;
        this.chemistry.verbalNotePercent = 40;
        
        
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
    
    public void addVerbalGrade(int mathVerbal, int physicVerbal, int chemistryVerbal) {

        if (mathVerbal >= 0 && mathVerbal <= 100) {
            this.math.verbalNote = mathVerbal;
        }

        if (physicVerbal >= 0 && physicVerbal <= 100) {
            this.physic.verbalNote = physicVerbal;
        }

        if (chemistryVerbal >= 0 && chemistryVerbal <= 100) {
            this.chemistry.verbalNote = chemistryVerbal;
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
    	this.physic.note=(this.physic.verbalNote * this.physic.verbalNotePercent/100) + (this.physic.note* (100-this.physic.verbalNotePercent)/100);
    	this.chemistry.note=(this.chemistry.verbalNote * this.chemistry.verbalNotePercent/100) + (this.chemistry.note* (100-this.chemistry.verbalNotePercent)/100);
    	this.math.note=(this.math.verbalNote * this.math.verbalNotePercent/100) + (this.math.note* (100-this.math.verbalNotePercent)/100);
    	
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
        System.out.println("Matematik Sözlü Notu : " + this.math.verbalNote);
        System.out.println("Fizik Notu : " + this.physic.note);
        System.out.println("Fizik Sözlü Notu : " + this.physic.verbalNote);
        System.out.println("Kimya Notu : " + this.chemistry.note);
        System.out.println("Kimya Sözlü Notu : " + this.chemistry.verbalNote);
    }

	

}
