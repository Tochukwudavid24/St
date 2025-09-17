import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudents() {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name: ");
        String Name = scanner.nextLine();


        System.out.println("Enter Email: ");
        String Email = scanner.nextLine();

        Student student = new Student(id, Name, Email);
        students.add(student);
        System.out.println("Student added successfully");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student found");
        } else {
            System.out.println("\n---Student List ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void searchStudentById() {
        System.out.println("Enter student id to search: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student found " + s);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + "not found.");
        }
    }

    public void deleteStudentById() {
        System.out.println("Enter student id to delete: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (Student s : students) {
            if (s.getId() == id) {

                students.remove(s);
                System.out.println("Student with " + s + " " + "Deleted");
                found= true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}