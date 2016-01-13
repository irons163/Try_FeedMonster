package wyf.ytl;

public interface IGameDog {
	void registerObserver(IStateObserver stateObserver);
	void removeObserver(IStateObserver stateObserver);
}
