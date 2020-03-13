
public class Main {
	
	public static void main(String[] args){
		TimeEventCreator creator1 = new TimeEventCreator();
		TimeEventListener l1 =new TimeEventListener("l1");
		TimeEventListener l2 = new TimeEventListener("l2");
		creator1.addListeners(l1);
		creator1.addListeners(l2);
		creator1.generateTimeEvent("bonjours", "Salut");
		creator1.generateTimeEvent("b", "S");		
		}}
		