package Practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {

  private String name;
  private String department;
  private int id;
  private double score;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getScore() {
    return this.score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}

class StudentManager {
    public void insertStudent {
    
    }
}

public class Practice05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();
    System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요.");
    for (int i = 0; i < 4; i++) {
      System.out.println(">>");
      String str = scanner.nextLine();
      StringTokenizer strToken = new StringTokenizer(str, ",");
      String name = strToken.nextToken().trim();
      String department = strToken.nextToken().trim();
      int id = Integer.parseInt(strToken.nextToken().trim());
      double score = Double.parseDouble(strToken.nextToken().trim());
      Student student = new Student(name, department, id, score);
      studentList.add(student);
    }
    while (true) {
      System.out.println("학생 이름 >> ");
      String name = scanner.nextLine();
      if (name.equals("그만")) break;
      for (int i = 0; i < studentList.size(); i++) {
        Student student = studentList.get(i);
        if (student.getName().equals(name)) {
          System.out.println(student.getName());
          System.out.println(student.getId());
          System.out.println(student.getDepartment());
          System.out.println(student.getScore());
        }
      }
    }
  }
}
