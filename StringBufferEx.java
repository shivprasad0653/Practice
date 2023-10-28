package stringExample;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("Hello");  //append 
		stringBuffer.append(" world.!");
		
		//System.out.println(stringBuffer);//prints result after append operation
		
		stringBuffer.insert(5, " how");// insert at position 5
		
		stringBuffer.deleteCharAt(1);// delete character at position 1
		
		System.out.println(stringBuffer.length());//returns length of string
		System.out.println(stringBuffer);
		
		//System.out.println(stringBuffer.reverse());//reverse the string
		
		stringBuffer.replace(1, 3, "qqq");//replace the string from position 1 to 3 with given dtring
		System.out.println(stringBuffer);
	}

}
