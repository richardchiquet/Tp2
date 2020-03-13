import java.util.Date;
import java.util.EventObject;
import java.util.GregorianCalendar;


public class TimeEvent extends EventObject {
	private GregorianCalendar date;
	private String name;
	private String content;
	
	public TimeEvent(Object source,String name,String content){
		super(source);
		this.setName(name);
		this.setContent(content);
		this.date=new GregorianCalendar();
		
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}


	public Date getDate() {
		return this.date.getTime();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	
	
	
}
