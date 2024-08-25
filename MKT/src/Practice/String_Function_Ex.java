package Practice;

public class String_Function_Ex {

	public static void main(String[] args) 
	
	{
String s1 = "AshWini 123";
String s3 ="asHwINi";
String s2 ="GrowtechMinds";

int i=3;
int j=5;
int k=1;
int l=6;
System.out.println(s3.matches("......."));
System.out.println(s3.matches("(.*)V(.*)"));
System.out.println(s3.matches("a(.*)"));
System.out.println(s1.matches("(.*)3"));
System.out.println(s1.replaceAll(" ", ""));
System.out.println(s3.replaceAll("[a-z]",""));
System.out.println(s1.replaceAll("[0-9]", " "));
System.out.println(s1.replace("AshWini", "Nakshatra"));
System.out.println(s1.lastIndexOf('h'));
System.out.println(s1.isEmpty());
System.out.println(s3.substring(2, 5));
System.out.println(s3.substring(3));
System.out.println(s1.contains("shW"));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equals(s2));
System.out.println(s3.trim());
System.out.println(s3.charAt(5));
System.out.println(s3.indexOf('h'));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s3.toUpperCase());
System.out.println(s1.toLowerCase());
//String s1 = new String("Ashu");
System.out.println("My Name is "+s1);

System.out.println(s1.length());

System.out.println(s1.charAt(3));

System.out.println(s1.substring(2));

System.out.println("The substring for the given index positions " + i+ " and " +j+ " is: "+s1.substring(i,j));
System.out.println("The substring of the given index position : " + k + " and " +l+ " is: " +s2.substring(k, l));
System.out.println("The substring is from give index :" +j+ " is :" +s2.substring(j));
System.out.println("The substring is from given index " +k+ " is :" +s1.substring(k));
System.out.println(s1.concat(" ").concat(s2));

System.out.println("The index of "+'s'+ " is :" +s1.indexOf('s'));

System.out.println("The index of " +'h'+ " is :"+s2.indexOf('h'));


	
}
	

}
