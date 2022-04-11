package LogicalPrograms;

public class RemoveComma {

	public static void main(String[] args) {
	
		String str= "This,string,contains,special,characters,12151";
		str = str. replaceAll("[^a-zA-Z0-9]", " ");
		System. out. println(str);
	}

}
