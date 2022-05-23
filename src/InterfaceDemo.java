
public class InterfaceDemo {

	public static void main(String[] args) {
		Calculator c=new Calculator() {
			
			@Override
			public void sub() {
				System.out.println(11+55);
	
				
			}
			
			@Override
			public void add() {
				System.out.println(11-5);
				
				
				
			}
		};
		c.add();
		c.sub();
		

	}

}
