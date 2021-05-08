
public class Complete implements IState {
	public Status statu = Status.Complete; 

	public void doAction(Context context) {	
		context.setStatus(statu);
		context.setState(this);	
	}

	@Override
	public String toString() {
		return "The State is " + statu;
	}


	
	
}