import java.io.*;
import java.util.*;

public class Qheap {
    private  ArrayList<Integer> stack;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Qheap solution = new Qheap();
        solution.run();
    }
    public void run(){
        stack = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numQueries = sc.nextInt();
        
        while(numQueries>0){
            int command = sc.nextInt();
            
            switch (command){
                    
                case 1:
                    add(sc.nextInt());
                    break;
                case 2:
                    delete(sc.nextInt());
                    break;
                case 3:
                    try{
                        printLow();
                        break;
                    }catch (IndexOutOfBoundsException ex){
                        System.exit(-1);
                    }
                   
                default:
                    System.exit(-1);
            }
            numQueries--;
        }
    }
        
    private void add(int input){
        stack.add(input);
    }
    
    private void delete(int input){
        for (int i=0;i<stack.size();i++){
            if(stack.get(i)==input){
               stack.remove(i);
            }
        }
    }
    
    private void printLow()throws IndexOutOfBoundsException{
        int low = stack.get(0);
        for (Integer x:stack){
            if(x<low){
                low = x;
            }
        }
        System.out.println(low);
    }
}