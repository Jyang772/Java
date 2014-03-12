import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Scraper {

	/**
	 * @param args
	 * @throws IOException
	 */

	static ArrayList<Student> studentArray = new ArrayList<Student>();

	// static String filepath =
	// "/home/justin/workspace/Assignment_6_Program_3/bin/test.txt";
	public static void main(String[] args) throws IOException {

		try {
			// System.out.println(new File(args[0]).getAbsolutePath());
			BufferedReader reader = new BufferedReader(new FileReader(
					"test.txt"));
			String l = reader.readLine();
			String m = reader.readLine();

			while (l != null) {
				
				Student tmp = new Student();	
				tmp.setName(l);
				tmp.setMajor(m);
				studentArray.add(tmp);
				
				System.out.println(l + " : " + m);
				l = reader.readLine();
				m = reader.readLine();
				
				// Student tmp = new Student();	
				//tmp.setName(l);
				//tmp.setMajor(m);
				//studentArray.add(tmp);
			}


		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("PASSED!");
		//for(int i=0; i < studentArray.size(); i++)
		//{
		//	System.out.println(studentArray.get(i));
		//}
		sortStudents(studentArray);

	}

	private static void sortStudents(ArrayList<Student> studentArray2) {

		
		 
		 
		 
		//Student top = studentArray2.get(0);
		
		
		
		int j, first;
		for(int i=studentArray2.size() - 1; i > 0; i--)
		{
			first = 0;
			
			for(j = 1; j <= i; j++)
			{
				if((studentArray2.get(j).getLength()) < (studentArray2.get(first).getLength()))
					first = j;
				}
			Student temp = studentArray2.get(first);
			studentArray2.set(first, studentArray2.get(i));
			studentArray2.set(i, temp);
		
	}
		
	for(int i=0; i < studentArray2.size(); i++)
	{
		System.out.println(studentArray2.get(i));
	}

}

}
