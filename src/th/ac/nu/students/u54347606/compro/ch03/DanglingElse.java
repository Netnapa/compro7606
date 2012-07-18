package th.ac.nu.students.u54347606.compro.ch03;

public class DanglingElse {
    public static void main (String [] args){
        int x = 5;
        if (x < 5){
            if (x > 5){
                System.err.println('b');
            }else{
                System.out.println ('a');
            }
        }    
        
    }
   
    
}
