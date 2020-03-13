import java.util.ArrayList;


public class TimeEventCreator  {
	
	private ArrayList<TimeListener> listeners;

	public TimeEventCreator (){
		this.listeners=new ArrayList<TimeListener>() ;
	}
	
	
	public void addListeners(TimeListener obj){
		this.listeners.add(obj);
	}
	public void generateTimeEvent(String name,String content){
		TimeEvent event= new TimeEvent(this,name,content);
		for(TimeListener evtint:this.listeners){
			evtint.receiveTimeEvent(event);
		}
	}
}
