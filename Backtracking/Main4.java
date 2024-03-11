import java.util.*;

class Student2 {
    private int id;
    private String firstName;
    private double cgpa;

    public Student2(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentC implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        if (s1.getCgpa() != s2.getCgpa()) {
            // Sort by cgpa in descending order
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        } else if (!s1.getFirstName().equals(s2.getFirstName())) {
            // If cgpa is equal, sort by firstName in alphabetical order
            return s1.getFirstName().compareTo(s2.getFirstName());
        } else {
            // If cgpa and firstName are equal, sort by id in ascending order
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student2> students = new ArrayList<>();

        // Input number of students
        //System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input student information
        //System.out.println("Enter student details for each student in the format: ID FirstName CGPA");
        for (int i = 0; i < n; i++) {
            //System.out.print("Enter details for student " + (i + 1) + ": ");
            int id = scanner.nextInt();
            String firstName = scanner.next();
            double cgpa = scanner.nextDouble();
            students.add(new Student2(id, firstName, cgpa));
        }

        // Sort students
        Collections.sort(students, new StudentC());

        // Print the first names of students after sorting
        //System.out.println("Students sorted by CGPA, firstName, and ID:");
        for (Student2 student : students) {
            System.out.println(student.getFirstName());
        }

        scanner.close();
        
        
    }
}
