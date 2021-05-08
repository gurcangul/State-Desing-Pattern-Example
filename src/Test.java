
public class Test {
   public static void main(String[] args) {
	   
	  Part part =new Part();// part olusturuldu.
      Employee emp= new Employee(part); // employee parta atandi.
      
      System.out.println(part.getContext().toString());// ilk durumda partin durumu.

      emp.toinProgress();//employee cani isterse degistirir... sahip oldugu part(zaten bir tane) durumu degisti...
      System.out.println(part.getContext().toString());// gordugun gibi emplooye part'in durumunu degistirdi...
      
      emp.toCompleted();//employee cani isterse degistirir... sahip oldugu part(zaten bir tane) durumu degisti...
      System.out.println(part.getContext().toString());// gordugun gibi emplooye part'in durumunu degistirdi...
	
      
      
/*Burada yapmamız gerekenler;
 1* Assembly ve Part Classlarındaki State enumu kaldırılır yerine "private Context context = new Context();" yazılır
 2* Employee amcamizın clasına bu fonksiyonlar yazılır;
 
 	public void toNotStarted() {
		Not_Started notStarted = new Not_Started();//employee can do this
    	notStarted.doAction(part.getContext());
	}
	public void toinProgress() {
		In_Progress inProgress = new In_Progress();//employee can do this
		inProgress.doAction(part.getContext());//employee can do this
	}	
	public void toCompleted() {
		Complete completed = new Complete();//employee can do this
		completed.doAction(part.getContext());//employee can do this
	}
 
 
 3* Geriye aslında bir sey kalmıyor, emplooye objesinden istenilen komut çağrılıp değiştirilebiliyor.
      
 4* Partın üstündeki assemblylerin state'i de degismeli bunun icin anlaman acisindan benzer bir kod yazdim.      
  */    

   }
}