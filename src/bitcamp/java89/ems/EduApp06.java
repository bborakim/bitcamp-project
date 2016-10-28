package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp06 {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    CurriculumController.keyScan = keyScan;

    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase(); //소문자로 변환
      switch (command) {
        case "add": CurriculumController.doAdd(); break;
        case "list": CurriculumController.doList(); break;
        case "view": CurriculumController.doView(); break;
        case "quit":
          System.out.println("Good Bye!");
          break loop;
        default:
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }
}
