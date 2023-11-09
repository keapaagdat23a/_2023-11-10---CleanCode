package prep;

import java.time.LocalDateTime;

public class TestExam1 {
  public static void main(String[] args) {
    LocalDateTime dt1 = LocalDateTime.now();
    LocalDateTime dt2 = LocalDateTime.of(2023,6,4,10,0);
    System.out.println("Difference: " + dt2.compareTo(dt1));
  }
}
