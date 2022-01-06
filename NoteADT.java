
public interface NoteADT {
	abstract void setValue(String name, String length);
	abstract void setStrValue(String name);
	abstract void setLength(String length);
	abstract void setKeyColor();
	abstract void setFrequency(double freq);
	abstract int getValue();
	abstract String getLength();
	abstract String getKeyColor();
	abstract double getFrequency();
	abstract String toString();
	
}
