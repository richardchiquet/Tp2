import java.util.ArrayList;

public class TimeEventListener implements TimeListener {
	ArrayList<TimeEvent> events;
	String name;
	
	
	
	public TimeEventListener(String name){
		this.events=new ArrayList<TimeEvent>();
		this.name=name;
	}

	public String getName(){
		return this.name;
	}
	public ArrayList<TimeEvent> getEvents() {
		return events;
	}
	
	public void receiveTimeEvent(TimeEvent event){
		this.events.add(event);
		System.out.println(this.getName()+"à reçu un evenement à:"+event.getDate());
		}
	}

