
public class fin    
{
  static fin d1, d2 ;	
  public void show( )   
  {  
    System.out.println("Hello 1");  
  }
  protected void finalize( ) throws Throwable   
  {
    if(d1  !=  null) 
    {
      System.out.println("d1 object is not eligible for garbage collection and is still active");
 
      d1 = null;
      if (d1 == null) 
	System.out.println("d1 is not referenced and getting removed from memory");
   }
   if(d2  !=  null) 
   {
     System.out.println("d2 object is not eligible for garbage collection and is still active");
 
     d2 = null;
     if(d2 == null) 
	System.out.println("d2 is not referenced and getting removed from memory");
   }
   super.finalize( );  
 }
 public static void main( String args[])    
 {
   d1 = new fin();    
   d2 = new fin();
   d1.show();   
   d2.show( );
   System.runFinalizersOnExit(true);
 }
}  
