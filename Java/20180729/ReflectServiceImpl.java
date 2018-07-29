package grammar;

public class ReflectServiceImpl implements  ReflectService {
	private String name;
	
	public ReflectServiceImpl(String name) {
		this.name = name;
	}
	
	public void sayWelcome() {
		System.out.println("Welcome "+name);
	}

	@Override
	public void sayWelcome(String name) {
		// TODO Auto-generated method stub
		System.out.println("Welcome "+name);
		
	}
	

	
}
