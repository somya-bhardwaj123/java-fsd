package accessmodifiers;

	class M
	{ 
		private  int data ;
		public void setAge(int data) {
		    this.data = data;
		  }
		public int getData() {
		    return this.data;
		  }

	  
	} 


	public class PrivateModifier {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			M obj  =  new M();
		   
		    obj.setAge(50);
		    System.out.println(obj.getData());

		}

	}