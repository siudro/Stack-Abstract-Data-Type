
package stackadt;


import java.io.*;
 import java.util.Scanner; 
public class StackMain {

    final static int STACK_SIZE =3;

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        ArrayStack s = new ArrayStack(STACK_SIZE); // 10 chars 
//        char ch;
        System.out.println("Enter any data");
//        for (int i = 0; i < STACK_SIZE; i++) {
//            ch = read.next().charAt(0);
//           
//                
//            
//        }
        Object e ;
        while(read.hasNext()){
            e=read.next();
            if(e.equals("0"))
                break;
            s.push(e);
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }
}
