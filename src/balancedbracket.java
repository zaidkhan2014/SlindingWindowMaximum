import java.util.Stack;

public class balancedbracket {
    public static void fun(String str){
        Stack<Character> s=new Stack<>();
        for (int i=0;i<s.size();i++){
            char ch=str.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else if (ch==')') {
                    Boolean val = handle(s, '(');
                    if (val == false) {
                        System.out.println(val);
                        return;
                    }
                }

            else if(ch=='}'){
                    Boolean val=handle(s,'{');
                    if (val==false){
                        System.out.println(val);
                        return;
                    }
                }
            else if (ch==']'){
                    Boolean val=handle(s,'[');
                    if (val==false){
                        System.out.println(val);
                        return;
                    }
                }
            else
                {

                }
            }
        if (s.size()==0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }


    public static boolean handle(Stack<Character> s,char closing){
        if (s.size()==0){
            return false;
        }
        else if(s.peek()!=closing){
            return false;
        }
        else{
            s.pop();
            return true;
        }

    }
    public static void main(String[] args) {
        String str="[{(a+b)})]";
        fun(str);

    }
}
