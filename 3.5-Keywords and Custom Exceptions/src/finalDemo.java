
public class finalDemo {
	public static void main(String[] args)
    {
        int a=4,res=0;
        try
        {
            res = a / 0;
        }
        catch(ArithmeticException E)
        {
            System.out.print( E.getMessage());
        }
        finally
        {
            System.out.print("\nresult is : " + res);
        }
    }
}
