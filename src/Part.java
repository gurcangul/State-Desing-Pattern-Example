
public class Part {
	Status status=Status.Not_Started; 
	private Employee employee;
    private Context context = new Context();//part ve assemblyde artik bu yer alacak. 3 durumu tutan ve degistiren durum classi.

	
	public Part() {
		employee=new Employee(this);
	}


	public Context getContext() {
		return context;
	}


	public void setContext(Context context) {
		this.context = context;
	}
	
	
}
