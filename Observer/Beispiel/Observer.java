package path.observer;

public interface Observer {

	//Methode um alle Observer zu benachrichten die bei Subject registriert sind
	public void update();

	public void setSubject(Subject sub);
}
