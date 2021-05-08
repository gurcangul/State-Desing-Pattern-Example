
public class Not_Started implements IState {

	
	public Status statu = Status.Not_Started; 
	
	public void doAction(Context context) {
		context.setStatus(statu);
		context.setState(this);	
   }

	@Override
	public String toString() {
		return "The State is " + statu;
	}
	//return "The State is " + statu;

	
	
}