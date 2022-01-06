
public class NoteApp {
	public static void main(String[] args) {
		MusicalNote fSharp = new MusicalNote("F#", "Eighth note");
		MusicalNote A = new MusicalNote("A", "Whole note");
		MusicalNote B = new MusicalNote();
		MusicalNote c = new MusicalNote();
		B.setValue("B", "Sixteenth note");
		System.out.println(c);
		System.out.println(B);
		System.out.println(fSharp);
		System.out.println(A);
		
	}

}
