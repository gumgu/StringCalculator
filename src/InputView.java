import java.util.Scanner;

public class InputView {
    private String inputValue = "";
    public String input() {
        Scanner sc = new Scanner(System.in);
        inputValue = sc.next();
        return inputValue;
    }
    // 이거 이러면 다른데서는 inputValue값 변경이 안되는건가?
    // 이게 진짜 헷갈려. 변수자체는 private이긴 한데, public 메서드 안에 있어서
}
