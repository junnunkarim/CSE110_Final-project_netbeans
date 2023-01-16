package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import swing.*;

public class Main
{
  public static HashMap<String, Course> courseMap = new HashMap<>(); // <courseCode, Course object>
  public static HashMap<String, Faculty> facultyMap = new HashMap<>(); // <facultyName, Faculty object>
  public static HashMap<String, Student> studentMap = new HashMap<>(); // <studentID, Student object>
  
  public static String[] depList = {"CSE", "EEE", "ECE", "MAT", "PHY", "ENG"};
  public static List<String> departmentList = new ArrayList<>(Arrays.asList(depList));
  
  public static void main(String[] args)
  {
    Main main = new Main();
    Initialize initialize = new Initialize();
    initialize.loadDatabase();

    MainLoginPanel panel = new MainLoginPanel();
    panel.setVisible(true);
  }

  public void run()
  {
    /*
    Scanner input = new Scanner(System.in);
    boolean running = true;

    while (running) {
      System.out.println("1. Load data from file");
      System.out.println("2. Save data to file");
      System.out.println("3. Add course");
      System.out.println("4. Remove course");
      System.out.println("5. Update course");
      System.out.println("6. Add student");
      System.out.println("7. Remove student");
      System.out.println("8. Update student");
      System.out.println("9. Exit");

      int choice = input.nextInt();

      switch (choice) {
        case 1:
          loadData();
          break;
        case 2:
          saveData();
          break;
        case 3:
          addCourse();
          break;
        case 4:
          removeCourse();
          break;
        case 5:
          updateCourse();
          break;
        case 6:
          addStudent();
          break;
        case 7:
          removeStudent();
          break;
        case 8:
          updateStudent();
          break;
        case 9:
          running = false;
          break;
        default:
          System.out.println("Invalid choice");
      }
    }

    input.close();
     */
  }
}