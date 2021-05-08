
public class Employee {
	private Part part;
	
	public Employee(Part part) {
		this.part=part;
		part.getContext();
	}
	//bu 3 fonskiyon eklenecek sadece
	public void toNotStarted() {
		Not_Started notStarted = new Not_Started();//only employee can do this
    	notStarted.doAction(part.getContext());//only employee can do this
	}
	public void toinProgress() {
		In_Progress inProgress = new In_Progress();//only employee can do this
		inProgress.doAction(part.getContext());//only employee can do this
	}	
	public void toCompleted() {
		Complete completed = new Complete();//only employee can do this
		completed.doAction(part.getContext());//only employee can do this
	}
	//--
	
	//Checking and changing the assembly of part(s)
	public void changeTheAssemblyOfStatuAutomatically() {// tabi burasi henuz hazir degil. assembly classi da gelince tam olacak 
		
		if(part.getContext().getStatus().equals(Status.In_Progress)) {
			//assemby.setStatus(Status.In_Progress) 
			System.out.println(" ayol ");		
		}
		
		else if(part.getContext().getStatus().equals(Status.Complete)) {
			//assemby.setStatus(Status.Complete) // 
			System.out.println(" ");		
		}
	
	
	}	
}
