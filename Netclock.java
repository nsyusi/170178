import java.io.*;
import  java.net.*;
import  java.util.*;
  
  class Netclock{
    public static void  main(String[] args){
      ServerSocket  servsock  = null;
      Socket  sock;
      OutputStream  out;          
      String  alo;
      int i;
      Date  date;
  
      try {
  
        servsock  = new ServerSocket(6000,  300);
      
     
          sock  = servsock.accept();    
        
          date = new Date();
            
          alo  = "\n"
                  + "ALO"
                  + "\n"  + date.toString()  + "\n"
                  + "Thank you."  + "\n";
  
          out = sock.getOutputStream();
        
          out.write('\n');
   
          sock.close();
      }
      catch (IOException  e)  {
        System.exit(1);
      }
    }
  }
  