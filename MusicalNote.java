
public class MusicalNote implements NoteADT{
	
	private String name, noteLength, keyColor;
	private int[] values = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2};
	private String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	private int value;
	private double frequency;
	
	public MusicalNote() {
		setValue("C", "Quarter note");
	}
	
	public MusicalNote(String name, String length) {
		setValue(name, length);
	}

	@Override
	public void setValue(String name, String length) {
		setStrValue(name);
		for(int i = 0; i < notes.length; i++) {
			if(this.name.equals(notes[i])) {
				value = values[i];
				setFrequency((double)value);
			}
		}
		setKeyColor();
		setLength(length);
	}

	@Override
	public void setStrValue(String name) {
		for(int i = 0; i < notes.length; i++) {
			if(name.equalsIgnoreCase(notes[i])) {this.name = notes[i];}
		}
	}
	
	@Override
	public void setLength(String length) {
		noteLength = length;
	}

	@Override
	public void setKeyColor() {
		if(name.length() > 1) {
			keyColor = "Black";
		} else {
			keyColor = "white";
		}
	}

	@Override
	public void setFrequency(double freq) {
		frequency = 440 * Math.pow(2, (freq/12));
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getLength() {
		return noteLength;
	}

	@Override
	public String getKeyColor() {
		return keyColor;
	}

	@Override
	public double getFrequency() {
		return frequency;
	}
	
	public String toString() {
		String str = name + "\nLength: " + getLength() 
					 + "\nValue: " + getValue() + "\n" + getKeyColor() +
					 "\n" + getFrequency() + " Hz";
		
		return str;			 
	}



}
