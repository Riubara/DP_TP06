
public class ObserverBin implements Observer {
	

	@Override
	public void update(SubjectObservable subject) {
		System.out.println("bin : " + Integer.toBinaryString(subject));

	}

}
