package assignment3;

public class JaggedArray {

	public static void main(String[] args) {
		String[][] array1 = {
				{"Tony", "JAVA", "C", "C++"},
				{"Thomas", "JAVA", "UNIX"},
				{"Dinil", "Linux", "Oracle"},
				{"Delvin", "RDMS", "C#", "ORACLE"}
				};
		for(int i=0;i<array1.length;i++) {
			if("Delvin".equals(array1[i][0]))
				for(int j=0;j<array1[i].length;j++)
					System.out.print(array1[i][j]+" ");
		}
	}

}
