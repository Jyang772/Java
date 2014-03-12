
public class Student {
	
	private String name;
	private String major;
	
	public Student()
	{
		name = null;
		major = null;
	}
	public Student(String n, String m){
	name = n;
	major = m;}
	
	
	public void setName(String l) {
		name = l;
	}
	
	public void setMajor(String m){
		major = m;
	}
	
	public int getLength()
	{
		
		return name.length() - 1;
		
	}

	public String toString()
	{
		String lolcatz = name + " : " + major;
		return lolcatz;
	}
	

}
