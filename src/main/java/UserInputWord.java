import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWord {
    public static void main(String args[]){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("なんでもいいので入力してください：");
            String input = reader.readLine();
            System.out.println("入力された文字列：" + input);
        }
        catch (IOException e) {
            System.out.println("入力時にエラーが発生しました");
            e.printStackTrace();
        }
    }
}
