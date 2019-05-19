package Tree;

public class PersistingLevel {
	private int level;
	
	public PersistingLevel(int value) {
		this.level = value;
	}
	
	public void SetPersistingLevel(int value) {
		this.level = value;
	}
	
	public int GetPersistingLevel() {
		return level;
	}
}
