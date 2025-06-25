import java.util.*;

public class StudentManagement{
    static class Student{
        private int id;
        private String name;
        private double marks;

        public Student(int id, String name, double marks){
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        public double getMarks(){
            return marks;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setMarks(double marks){
            this.marks = marks;
        }

        public String toString(){
            return "ID: "+id+", Name: "+name+", Marks: "+marks;
        }
    }

    private static ArrayList<Student> stud = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void addStudent(){
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        if (findStudentById(id) != null) {
            System.out.println("A student with ID " + id + " already exists. Please enter a different ID.\n");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        stud.add(new Student(id, name, marks));
        System.out.println("Student added successfully!\n");
    }

    public static void view(){
        if(stud.isEmpty()){
            System.out.println("No student record found.\n");
        }
        else{
            System.out.println("----- Student List -----\n");
            for(Student s : stud){
                System.out.println(s);
            }
        }
    }

    public static void update(){
        System.out.print("Enter ID of student to be upadted: ");
        int id = sc.nextInt();
        sc.nextLine();
        Student s = findStudentById(id);
        if(s == null){
            System.out.println("Student not found!");
            return;
        }
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new marks: ");
        double marks = sc.nextDouble();
        s.setName(name);
        s.setMarks(marks);
        System.out.println("Student updated successfully!\n");
    }

    public static void delete(){
        System.out.print("Enter ID of student to be deleted: ");
        int id = sc.nextInt();
        Student s = findStudentById(id);
        if(s == null){
            System.out.println("Student not found!\n");
            return;
        }
        stud.remove(s);
        System.out.println("Student deleted successfully!\n");
    }

    public static Student findStudentById(int id){
        for(Student s : stud){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args){
        int choice;
        do{
            System.out.println("---- Student Record Management System ----\n");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }while (choice != 5); 
    }
}