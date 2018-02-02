import	java.io.*;
  import	java.net.*;
  import	java.util.*;
  
  class	MyServer04{
  	public static void	main(String[]	args){

  		ServerSocket	servsock	=	null;
  		Socket	sock;
  		OutputStream	out;					
  		String	outstr;
  		int	i;
  
  		try{

  			servsock = new	ServerSocket(5000,10);
  			while(true){
     			
  				sock	=	servsock.accept();		

  				outstr	=	"HELLO";
  
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