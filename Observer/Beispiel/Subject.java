package path.observer;

public interface Subject {

	//Methoden um Observer Objekte zu registrieren oder unregistrieren
	public void register(Observer obj);
	public void unregister(Observer obj);

	//Methode um alle Observer bei Status Änderung zu benachrichtigen
	public void notifyObservers();
	
	//Methode um Updates zu bekommen
	public Object getUpdate(Observer obj);

}
