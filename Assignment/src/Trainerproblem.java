

class Course
{
	int cid, duration;
	String name;
	int startdate;
	
	Course(int cid,int duration, String name,int startdate){
		this.cid=cid;
		this.duration=duration;
		this.name=name;
		this.startdate=startdate;
	}
	
	void display()
	{
		System.out.println("Course name: "+name);
		System.out.println("Course ID: "+cid);
		System.out.println("Starting Date: "+startdate);
		System.out.println("Duration: "+duration);

	}
		
}
class Trainer{
	int tid;
	String name;
	Course course;
	Trainer(int tid,String name, Course course){
		this.tid=tid;
		this.name=name;
		this.course=course;
		
		}
	void display() {
		System.out.println(" trainer id "+tid);
		System.out.println(" trainer name "+name);
		System.out.println("course id is "+course.cid);
		System.out.println(" course duration is  "+course.duration);
		System.out.println(" course name is "+course.name);
		System.out.println(" course start date is "+course.startdate);
		
	}
}
class Trainee{
	int trid;
	String name;
	String trdept;
	Trainer trainer;
	Course course;
	Trainee(int trid,String name,String trdept,Trainer trainer,Course course ){
		this.trid=trid;
		this.name=name;
	    this.trdept=trdept;
		this.trainer=trainer;
		this.course = course;
		
		}
	void display() {
		System.out.println("The trainee id is  "+trid);
		System.out.println("The name of trainee is "+name);
		System.out.println(" The name of department is "+trdept);
		System.out.println("The trainer id is "+trainer.tid);
		System.out.println("Name of trainer is "+trainer.name);
		System.out.println("course id is "+course.cid);
		System.out.println(" course duration is  "+course.duration);
		System.out.println(" course name is "+course.name);
		System.out.println(" course start date is "+course.startdate);
				
	}
}
class Module{
	String modname;
	 int numofunits;
	
	Module(String modname, int numofunits) {
		this.modname = modname;
		this.numofunits = numofunits;
	}
	
	void mdisplay() {
		System.out.println("Name of the module: "+modname);
		System.out.println("Number of units in "+modname+" are "+numofunits);
		
}

class topics{
	String topicname;
	int numsubtopic;
	topics(String topicname,int numsubtopic)
	{
		this.topicname=topicname;
		this.numsubtopic=numsubtopic;
	}
	void display() {
		System.out.println("The name of the topic is:"+topicname);
	
		System.out.println("Number of subtopics are:"+numsubtopic);
	}
}	
class Units{
	String uname;
	int numTopics;
	int unum;
	topics topics;
	
	Units(String uname, int numTopics, int unum,topics topics) {
		this.uname = uname;
		this.numTopics = numTopics;
		this.unum = unum;
		this.topics=topics;
	}
	void display()
	{
		System.out.println("The Unit "+uname+" has  "+numTopics+" topics ");
		System.out.println("The topic"+topics.topicname+"has"+topics.numsubtopic+"subtopics");
		
	}
	
}


class Technology{
	 String techname;
	 int numModules;
	 Module m1 = new Module("java",24);
}
	
}


public class Trainerproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1=new Course(20,21,"Java",29);
		Course course2=new Course(21,23,"Webt",12);
		
		
		Trainer t1=new Trainer(111,"Shrey",course1);
		Trainer t2=new Trainer(1156,"Shreya",course2);
		
		
		Trainee tr1=new Trainee(123,"sim","coe",t1,course1);
		Trainee tr2=new Trainee(13,"sang","coe",t2,course2);
		
		Module m1 = new Module("java",23);
		Module m2=new Module("webex",35);
		
		

		System.out.println("Trainer Info");
		
		t1.display();
		System.out.println("***********2nd*****");
		t2.display();
		System.out.println("Trainee Info");
		tr1.display();
		
		tr2.display();
		System.out.println("Module Info");
		m1.mdisplay();
		m2.mdisplay();
		

	}

}
