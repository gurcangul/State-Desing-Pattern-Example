
public class In_Progress implements IState {
	
	public Status statu = Status.In_Progress; 

	public void doAction(Context context) {
		context.setStatus(statu);
		context.setState(this);	
	}

	@Override
	public String toString() {
		return "The State is " + statu;
	}


	
}