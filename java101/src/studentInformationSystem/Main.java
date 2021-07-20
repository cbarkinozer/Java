package studentInformationSystem;

public class Main {
	public static void main(String[] args) {
		Course math = new Course("Matematik", "MAT101", "MAT");
		Course physic = new Course("Fizik", "FZK101", "FZK");
		Course chemistry = new Course("Kimya", "KMY101", "KMY");

		Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
		Teacher t2 = new Teacher("Fatma Ayþe", "90550000001", "FZK");
		Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

		math.addTeacher(t1);
		physic.addTeacher(t2);
		chemistry.addTeacher(t3);

		Student s1 = new Student("Ýnek Þaban", 4, "140144015", math, physic, chemistry);
		s1.addBulkExamNote(50, 20, 40);
		s1.addVerbalGrade(50, 20, 40);
		s1.isPass();

		Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physic, chemistry);
		s2.addBulkExamNote(100, 50, 40);
		s2.addVerbalGrade(100, 50, 40);
		s2.isPass();

		Student s3 = new Student("Hayta Ýsmail", 4, "221121312", math, physic, chemistry);
		s3.addBulkExamNote(50, 20, 40);
		s3.addVerbalGrade(50, 20, 40);
		s3.isPass();

	}
}
