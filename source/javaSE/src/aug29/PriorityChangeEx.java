package aug29;

class SuperThreadPriority extends Thread{   
    public SuperThreadPriority(String threadName){
        super(threadName);  
    }   
    public void run(){      
        System.out.printf("������ �̸�  : %s %n",
        Thread.currentThread().getName());
    }
}
public class PriorityChangeEx extends SuperThreadPriority{ 
    public PriorityChangeEx(String threadName){      
        super(threadName);        
    }
    public static void main(String arg[]){      
        Thread t1 = new SuperThreadPriority("ù��° ������");     
        t1.setPriority(1);        
        t1.start();     
        Thread t2 = new SuperThreadPriority("�ι�° ������");     
        t2.setPriority(10); 
        t2.start();         
    }
}















