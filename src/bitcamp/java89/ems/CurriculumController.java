package bitcamp.java89.ems;

import java.util.Scanner;

public class CurriculumController {
  Curriculum[] curriculums = new Curriculum[100];
  int length = 0;
  Scanner keyScan;

  // 기본생성자가 없기때문에 이 클래스를 사용하려면 반드시 Scanner를 줘야함.
  // => 생성자에서 하는 일은 그 객체를 사용하기 전에 유효 상태로 만드는 것이다.
  public CurriculumController(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void doList() {
    for (int i = 0; i < this.length; i++) {
      Curriculum curriculum = this.curriculums[i];
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

  public void doUpdate() {
    System.out.print("변경할 강좌명은? ");
    String curriculumName = this.keyScan.nextLine().toLowerCase();

    for (int i = 0; i < this.length; i++) {
      if (this.curriculums[i].curriculumName.toLowerCase().equals(curriculumName)) {
        while (length < this.curriculums.length) {
          Curriculum curriculum = new Curriculum();
          System.out.print("강좌명? ");
          curriculum.curriculumName = this.keyScan.nextLine();

          System.out.print("강좌소개? ");
          curriculum.introduce = this.keyScan.nextLine();

          System.out.print("강좌특전? ");
          curriculum.benefit = this.keyScan.nextLine();

          System.out.print("강좌대상? ");
          curriculum.target = this.keyScan.nextLine();

          System.out.print("강좌준비서류? (예: 증명사진) ");
          curriculum.document = this.keyScan.nextLine();

          System.out.print("강좌레벨테스트여부? (예:y/n) ");
          curriculum.levelTest = (this.keyScan.nextLine().equals("y")) ? true : false;

          System.out.print("강좌제한인원? (단위: 명, 숫자만) ");
          curriculum.limit = Integer.parseInt(this.keyScan.nextLine());

          System.out.print("강좌시간? (단위: 시간, 숫자만) ");
          curriculum.time = Integer.parseInt(this.keyScan.nextLine());

          System.out.print("강좌기간? (단위: 개월, 숫자만) ");
          curriculum.term = Integer.parseInt(this.keyScan.nextLine());

          System.out.print("저장하시겠습니까(y/n)?");

          if (keyScan.nextLine().toLowerCase().equals("y")) {
            this.curriculums[i] = curriculum;
            System.out.println("저장하였습니다.");
          } else {
            System.out.println("변경을 취소하였습니다.");
          return;
        }
      }
      System.out.printf("%s 이라는 학생이 없습니다.", curriculumName);
    }

  public void doAdd() {
    while (length < this.curriculums.length) {
      Curriculum curriculum = new Curriculum();
      System.out.print("강좌명? ");
      curriculum.curriculumName = this.keyScan.nextLine();

      System.out.print("강좌소개? ");
      curriculum.introduce = this.keyScan.nextLine();

      System.out.print("강좌특전? ");
      curriculum.benefit = this.keyScan.nextLine();

      System.out.print("강좌대상? ");
      curriculum.target = this.keyScan.nextLine();

      System.out.print("강좌준비서류? (예: 증명사진) ");
      curriculum.document = this.keyScan.nextLine();

      System.out.print("강좌레벨테스트여부? (예:y/n) ");
      curriculum.levelTest = (this.keyScan.nextLine().equals("y")) ? true : false;

      System.out.print("강좌제한인원? (단위: 명, 숫자만) ");
      curriculum.limit = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("강좌시간? (단위: 시간, 숫자만) ");
      curriculum.time = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("강좌기간? (단위: 개월, 숫자만) ");
      curriculum.term = Integer.parseInt(this.keyScan.nextLine());

      this.curriculums[length++] = curriculum;

      System.out.print("계속 입력하시겠습니까(y/n)?");
      if (!this.keyScan.nextLine().equals("y"))
      break;
    }
  }

  public void doView() {
    System.out.print("강좌명은? ");
    String curriculumName = this.keyScan.nextLine().toLowerCase();
    for (int i = 0; i < this.length; i++) {
      if (this.curriculums[i].curriculumName.toLowerCase().equals(curriculumName)) {
        System.out.printf("강좌소개: %s\n", this.curriculums[i].introduce);
        System.out.printf("강좌특전: %s\n", this.curriculums[i].benefit);
        System.out.printf("강좌대상: %s\n", this.curriculums[i].target);
        System.out.printf("강좌준비성류: %s\n", this.curriculums[i].document);
        System.out.printf("강좌레벨테스트: %s\n", ((this.curriculums[i].levelTest)? "y" : "n"));
        System.out.printf("강좌제한인원: %d\n", this.curriculums[i].limit);
        System.out.printf("강좌시간: %d\n", this.curriculums[i].time);
        System.out.printf("강좌기간: %d\n", this.curriculums[i].term);
        break;
      }
    }
  }

  public void doDelete() {
    System.out.print("삭제할 강좌명은? ");
    String curriculumName = this.keyScan.nextLine().toLowerCase();

    for (int i = 0; i < this.length; i++) {
      if (this.curriculums[i].curriculumName.toLowerCase().equals(curriculumName)) {
        for (int x = i + 1; x < this.length; x++, i++) {
          this.curriculums[i] = this.curriculums[x];
        }
        this.curriculums[--length] = null;

        System.out.printf("%s 강좌 정보를 삭제하였습니다.\n", curriculumName);
        return;
      }
    }
    System.out.printf("%s 강좌정보가 없습니다.\n", curriculumName);
  }  
}
