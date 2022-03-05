import java.io.*; 
import java.util.*; 

class Sender 
{ 
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
   
    Sender  obs; //Creating an obj of type sender to access its content.
    ThreadedSend(String m,  Sender obj) //constructor
    { 
        msg = m; 
        obs = obj; 
    } 
  
    public void run() 
    {  
        synchronized(obs)	 //sender class is synchronized
        { 
            obs.send(msg); //syn calling send fn of class sender
        } 
    } 
} 
class test
{ 
    public static void main(String args[]) 
    { 
        Sender snd = new Sender(); 
        ThreadedSend S1 = 
            new ThreadedSend( " apple " , snd ); //passing data and obj of sender in constructor.
        ThreadedSend S2 = 
            new ThreadedSend( " Banana " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 
