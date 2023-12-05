package junitDemo.helper;

public class StringHelper {

	public String truncateAinFirst2Positions(String str) {
		if(str.length()<=2)
			return str.replaceAll("A","");
		
		String first2Chars = str.substring(0,2);
		String StringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replaceAll("A","") + StringMinusFirst2Chars;
	}
	
	public boolean first2andLast2CharactersAreSame(String str) {
		if(str.length()	<= 1)
			{
			return false;
			}
		if(str.length()==2) {
			return true;
		}
		
		String first2Chars = str.substring(0,2);
		
		String last2Chars = str.substring(str.length() - 2,str.length());
		
		if(first2Chars.equals(last2Chars))
			return true;
		return false;
	}
}
