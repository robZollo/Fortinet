package fortinet;

public class SingletonStore {
	
	private static SingletonStore _instance = null;
	public static SingletonStore getInstance(){
		if (_instance == null)
		{
			_instance = new SingletonStore();
		}
		return _instance;
	}

}
