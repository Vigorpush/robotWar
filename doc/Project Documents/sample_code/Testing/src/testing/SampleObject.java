package testing;

public class SampleObject {

	private int id;
	private String name;
	
	public SampleObject(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String greeting()
	{
		return "Hello, I am " + this.name;
	}
	
	public boolean idEven()
	{
		int result = 0;
		result = id%2;
		return result==0;
	}
}
