package Programs_On_Strings;

public class RemoveSpaceFromString 
{
	public static void main(String args[])
	{
		String S = "java development";
		String remove = S.replaceAll(" ", "");
		System.out.println(remove);
	}
}
