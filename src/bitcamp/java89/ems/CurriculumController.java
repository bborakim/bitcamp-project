package bitcamp.java89.ems;

import java.util.Scanner;

public class CurriculumController {
  static Curriculum[] curriculums = new Curriculum[100];
  static int length = 0;
  static Scanner keyScan;

  static void doList() {
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
  static void doAdd() {
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
  }
  static void doView() {
    System.out.print("강좌명 :");
    String curriculumName = keyScan.nextLine().toLowerCase();
    for (int i = 0; i < length; i++) {
      if (curriculums[i].curriculumName.toLowerCase().equals(curriculumName)) {
        System.out.printf("강좌소개: %s\n", curriculums[i].introduce);
        System.out.printf("강좌특전: %s\n", curriculums[i].benefit);
        System.out.printf("강좌대상: %s\n", curriculums[i].target);
        System.out.printf("강좌준비성류: %s\n", curriculums[i].document);
        System.out.printf("강좌레벨테스트: %s\n", ((curriculums[i].levelTest)? "y" : "n"));
        System.out.printf("강좌제한인원: %d\n", curriculums[i].limit);
        System.out.printf("강좌시간: %d\n", curriculums[i].time);
        System.out.printf("강좌기간: %d\n", curriculums[i].term);
        break;
      }
    }
  }
}
