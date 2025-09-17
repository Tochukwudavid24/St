import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        while (true){
            System.out.println("\n==== Student Management ====");
            System.out.println("\n Choose an Option below :");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student By ID");
            System.out.println("4. Delete Student By ID");
            System.out.println("5. Exit");


            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    studentService.addStudents();
                    break;
                case 2:
                    studentService.viewAllStudents();
                    break;
                case 3:
                    studentService.searchStudentById();
                    break;
                case 4:
                    studentService.deleteStudentById();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("invalid option try again");
            }



        }
    }
}