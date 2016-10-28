package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp5 {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");
    Scanner keyScan = new Scanner(System.in);
    Curriculum[] curriculums = new Curriculum[100];
    int length = 0;

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase(); //소문자로 변환

      switch (command) {
        case "add" :
          while (length < curriculums.length) {
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
            System.out.print("강좌제한인원? (단위: 명, 숫자만) ");
            curriculum.limit = Integer.parseInt(keyScan.nextLine());
            System.out.print("강좌시간? (단위: 시간, 숫자만) ");
            curriculum.time = Integer.parseInt(keyScan.nextLine());
            System.out.print("강좌기간? (단위: 개월, 숫자만) ");
            curriculum.term = Integer.parseInt(keyScan.nextLine());

            curriculums[length++] = curriculum;

            System.out.print("계속 입력하시겠습니까(y/n)?");
            if (!keyScan.nextLine().equals("y"))
              break;
          }
        break;
        case "list" :
          printCurriculumList(curriculums, length);
          break;
        case "view" :
          System.out.println(command);
          break;
        case "quit" :
          System.out.print("Good Bye!\n");
          break loop;
        default:
          System.out.println("지원하지 않는 명령어입니다.");
      }
   }
    static void printCurriculumList(Curriculum[] curriculums, int length) {
      for (int i = 0; i < length; i++) {
        Curriculum curriculum = curriculums[i];
        System.out.printf("%s,%s,%s,%s,%s,%s,%d,%d,%d\n",
        curriculum.curriculumName,
        curriculum.introduce,
        curriculum.benefit,
        curriculum.target,
        curriculum.document,
        ((curriculum.levelTest)? "y" : "n"),
        curriculum.limit,
        curriculum.time,
        curriculum.term);
      }
    }
}

  /*
    Curriculum[] curriculums = new Curriculum[100];
    int length = 0;
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");
    controler();

    static void controler() {
      System.out.print("명령> ");
        switch (keyScan.nextLine()) {
          case ("add"):
            curriculumInfo();
          case ("list"):
            printCurriculumList(curriculums, length);
          case ("view"):
            printview(curriculums, length);
          default :
            system.out.println("종료");
        }
    }

  static void printCurriculumList(Curriculum[] curriculums, int length) {
    for (int i = 0; i < length; i++) {
      Curriculum curriculum = curriculums[i];
      System.out.printf("%s,%s,%s,%s,%s,%s,%d,%d,%d\n",
        curriculum.curriculumName,
        curriculum.introduce,
        curriculum.benefit,
        curriculum.target,
        curriculum.document,
        ((curriculum.levelTest)? "y" : "n"),
        curriculum.limit,
        curriculum.time,
        curriculum.term);
    }
    System.out.print("명령> ");
  }

  static void curriculumview(Curriculum[] curriculums, int length) {
    for (int i = 0; i < length; i++) {
      if(keyScan.nextLine().equals(curriculum.curriculumName))
      System.out.printf("강좌소개:%s\n,강좌특전:%s\n,강좌대상:%s\n, 강좌준비성류:%s\n,강좌레벨테스트:%s\n,강좌제한인원:%d\n,강좌시간:%d\n,강좌기간:%d\n",
      curriculum.introduce,curriculum.benefit,curriculum.target,
      curriculum.document,
      ((curriculum.levelTest)? "y" : "n"),
      curriculum.limit,
      curriculum.time,
      curriculum.term);
    }
    System.out.print("명령> ");
  }

  static void curriculumInfo(Curriculum[] curriculums, int length) {
    for (int i = 0; i < length; i++) {
      while (length < curriculums.length) {
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
          System.out.print("강좌제한인원? (단위: 명, 숫자만) ");
          curriculum.limit = Integer.parseInt(keyScan.nextLine());
          System.out.print("강좌시간? (단위: 시간, 숫자만) ");
          curriculum.time = Integer.parseInt(keyScan.nextLine());
          System.out.print("강좌기간? (단위: 개월, 숫자만) ");
          curriculum.term = Integer.parseInt(keyScan.nextLine());

          curriculums[length++] = curriculum;

          System.out.print("계속 입력하시겠습니까(y/n)?");
          if (!keyScan.nextLine().equals("y"))
            break;
      }
            System.out.print("명령> ");
    }
    */
