package Training;

public class program12 {
	/*Datatypes
	 * 
	 * boolean 1bit
	 * byte    1 byte
	 * short   2 byte
	 * int     4byte
	 * long    8byte
	 * float   4byte 
	 * double  8byte
	 * 
	 * range for unsigned
	 * 
	 * 0 to 2^(n) -1
	 * 
	 * range for signed
	 * 
	 * 2^n-1 to 2^(n-1) -1
	 * */
	
	
//	UpCasting
	
	byte b=23;
	short s=b;
	int i=s;
	long l=i;
	float f=l;
	double d=f;
	
//Downcasting
	
	//for int
	
	//int to -----
	
	int j=25;
	char c=(char)j;
	String str=Integer.toString(j);
	double ds=j;
	
	//char to -----
	
	char ch='a';
	int k=ch;
	String sstr=Character.toString(ch);
	Double w=Double.parseDouble(Character.toString(ch));
	Long ls=Long.parseLong(Character.toString(ch));
	float lb=Float.parseFloat(Character.toString(ch));
	
	//String to ---
	
	String ssstr="25";
	int a=Integer.parseInt(ssstr);
	//Same as char
	
	
	//Double to ----
	Double x=25.998;
	int sl=x.intValue();
	float fl=x.floatValue();
	long ss=x.longValue();
	
}
