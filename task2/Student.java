import java.util.Date;

public class Student
{
	public Student()
	{
	}
	
	public Student(int id, String n, String s, String t, Date bd, float sc)
	{
		this.id = id;
		name = n;
		surname = s;
		thirdname = t;
		birthday = bd;
		score = sc;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String showInfo()
	{
		return "id - " + this.id + " - " + this.name + ", " + this.surname + ", "+ this.thirdname + ", Birthday: " + this.birthday + ", Score: " + this.score;
	}

	public Date getBirthday()
	{
		return this.birthday;
	}
	
	private int id;
	private String name;
	private String surname;
	private String thirdname;
	private Date birthday;
	private float score;
}
