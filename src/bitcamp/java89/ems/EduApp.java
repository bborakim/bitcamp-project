package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");

    Scanner keyScan = new Scanner(System.in);

    Curriculum curriculum = new Curriculum();

    System.out.print("강좌명? ");
    curriculum.curriculumName = keyScan.nextLine();
    System.out.print("강좌소개? ");
    curriculum.introduce = keyScan.nextLine();
    System.out.print("강좌특전? ");
    curriculum.benefit = keyScan.nextLine();
    System.out.print("강좌대상? ");
    curriculum.target = keyScan.nextLine();
    System.out.print("강좌준비서류? (예: 증명사진) ");
    curriculum.document = keyScan.nextLine();
    System.out.print("강좌레벨테스트여부? (예:y/n) ");
    curriculum.levelTest = (keyScan.nextLine().equals("y")) ? true : false;
    System.out.print("강좌제한인원? (숫자만) ");
    curriculum.limit = Integer.parseInt(keyScan.nextLine());
    System.out.print("강좌시간? (숫자만) ");
    curriculum.limit = Integer.parseInt(keyScan.nextLine());
    System.out.print("강좌기간? (숫자만) ");
    curriculum.limit = Integer.parseInt(keyScan.nextLine());
  }
}
