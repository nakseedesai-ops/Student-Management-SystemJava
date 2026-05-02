import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] id = new int[10];
        String[] name = new String[10];
        int[] age = new int[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter ID: ");
                        id[count] = sc.nextInt();

                        sc.nextLine(); // IMPORTANT

                        System.out.print("Enter Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Age: ");
                        age[count] = sc.nextInt();

                        count++;
                        System.out.println("Student Added!");
                    } else {
                        System.out.println("Limit reached!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + id[i] +
                                    " Name: " + name[i] +
                                    " Age: " + age[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}