import java.nio.file.Path;
import java.nio.file.Paths;
public class Que1
{
	public static void main (String args[])
	{
		 Path d1 = Paths.get("/works");
        Path d2 = d1.resolve("ocpjp/code"); //1
        d1.resolve("ocpjp/code/sample");  //2
        d1.toAbsolutePath(); //3
        System.out.println(d1);
        System.out.println(d2);
	}
}