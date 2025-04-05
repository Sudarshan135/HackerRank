package javaa.data_structures;

import java.util.*;
public class Java_Stack {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern: ");

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isValid(input));

        }

    }

    static boolean isValid(String iString){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i< iString.length();i++){
            char ch=iString.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else if(stack.isEmpty()){
                return false;
            }else{
                char top=stack.pop();
                if((top=='(' && ch!=')')||(top=='[' && ch!=']')||(top =='{' &&ch!='}')){
                    return false;
                }
            }
        }return stack.isEmpty();
    }
}




