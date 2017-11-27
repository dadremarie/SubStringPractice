
public class DirectoryDriver
{
   
    public static void main (String args[])
    {
        Directory employee1 = new Directory( "Jones, Amy");
        Directory employee2 = new Directory ("Pham, Tammy");
        Directory employee3 = new Directory ("Mendoza, Louisa");
        
        System.out.println("Your output should look like: \n Amy Jones \n Tammy Pham \n Lousia Mendoza");
        System.out.println ("but you will use a toString in the class");
        System.out.println(employee1); 
        
       
    }//end main
}//end class