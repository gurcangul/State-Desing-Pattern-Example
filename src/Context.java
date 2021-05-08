public class Context {
   private IState state;
   private Status statu=Status.Not_Started;
   
   public Context(){
      state = null;   
   }

   public void setState(IState state){
      this.state = state;		
   }

   public IState getState(){
      return state;
   }

	public Status getStatus() {
		return statu;
	}
	
	public void setStatus(Status statu) {
		this.statu = statu;
	}

	@Override
	public String toString() {
		return "The State is " + statu;
	}


   
   
   
}