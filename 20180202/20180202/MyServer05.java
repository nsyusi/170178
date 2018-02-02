import	java.io.*;
  import	java.net.*;
  import	java.util.*;
  
  class	MyServer05{
  	public static void	main(String[]	args){

  		ServerSocket	servsock	=	null;
  		Socket	sock;
  		OutputStream	out;					
  		String	outstr;
  		int	i;
      Date d;
  
  		try{

  			servsock = new	ServerSocket(4000,10);
  			while(true){
     			
  				sock	=	servsock.accept();	

          d = new Date();	

  				outstr	=	"\n" 
          + "\n" + d.toString() + "\n"
          +"170178" + "\n";
  
  				out	=	sock.getOutputStream();

  				for(i=0;	i<outstr.length();	i++)
  					out.write((int)	outstr.charAt(i));
  				out.write('\n');
      
  				sock.close();
  			}
  		}
  		catch	(IOException	e)	{
  			System.exit(1);
  		}
  	}
  }