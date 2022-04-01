import java.util.Stack;

public class dublicatebrackets {
    public static  void fun(String str){
        Stack<Character> s=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch==')'){
                if (s.peek()=='('){
                    System.out.println("true");
                    return;
                }
                while (s.peek()!='('){
                    s.pop();
                }
                s.pop();
            }
            else
            {
                s.push(ch);
            }
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        String str="((a+b))";
        fun(str);
    }
}
