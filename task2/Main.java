import java.util.*;

public class Main
{
	private static void sort(ArrayList<Student> array)
	{
		for (int i = 0; i < array.size() - 1; ++i)
		{
			int result = array.get(i).getBirthday().compareTo(array.get(i + 1).getBirthday());
			if (0 < result)
			{
				Collections.swap(array, i + 1, i);
			}
		}
	}

	private static void sortKey(HashMap<String, Integer> hashmap)
	{
		for (int i = 0; i < hashmap.size() - 1; ++i)
		{
//			if (hashmap.get(i) > hashmap.get(i + 1))

		}
	}

	private static void sortValue(HashMap<String, Integer> hashmap)
	{
		for ( Map.Entry<String, Integer> pair : hashmap.entrySet())
		{
//			if ()
		}
	}

	public static void main(String[] args)
	{
		ArrayList<Student> studentsList = new ArrayList<Student>();
		ArrayDeque<Student> studentsDeque = new ArrayDeque<>();
		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = 5;
		Date date;
		Random rnd = new Random();
		String text;

		for(int i = 0; i < numberOfStudents; ++i)
		{
			date = new Date(rnd.nextLong(99999999999l));
			Student stud = new Student(i, "Name" + i, "Surname" + i, "Thirdname" + i, date, rnd.nextFloat() * 10);
			studentsList.add(stud);
		}

		// 1a
		for (Student s : studentsList)
		{
			System.out.println(s.showInfo());
		}

		// 1b
		studentsList.get(2).setId(99);
		System.out.println("Updated id for 3rd student: " + studentsList.get(2).showInfo());

		// 1c
		System.out.println("Number of students before: " + studentsList.size());
		studentsList.remove(studentsList.get(studentsList.size() - 1));
		System.out.println("Number of students after: " + studentsList.size());

		// 1d
		System.out.println("Sorting by birthdate");
		sort(studentsList);
		for (Student s : studentsList)
			System.out.println(s.showInfo());

		// 1e
		studentsList.clear();
		System.out.println("Vacation. Number of students: " + studentsList.size());

		// 2
		System.out.println("\n\n\nDeque");
		for(int i = 0; i < numberOfStudents; ++i)
		{
			date = new Date(rnd.nextLong(99999999999l));
			Student stud = new Student(i, "Name" + i, "Surname" + i, "Thirdname" + i, date, rnd.nextFloat() * 10);
			studentsDeque.offer(stud);
		}

		for(Student s : studentsDeque)
			System.out.println(s.showInfo());

		for(Student s : studentsDeque)
			studentsDeque.poll();

		System.out.println("Deque students after removeing  - " + studentsDeque);

		// 3b
		System.out.println("\n\n\nHash map");

		System.out.print("Input text: ");
		text = scanner.nextLine();

		for (int i = 0; i < text.length(); ++i)
			freq.merge(text.charAt(i), 1, Integer::sum);

		SortedMap<Character, Integer> sortedKey = new TreeMap<Character, Integer>();
		LinkedList<Map.Entry<Character, Integer>> sortedValue = new LinkedList<Map.Entry<Character, Integer>>(freq.entrySet());

		sortedKey.putAll(freq);
		Collections.sort(sortedValue, new Comparator<Map.Entry<Character, Integer>>()
							{
								public int compare(Map.Entry<Character, Integer> o1,
												   Map.Entry<Character, Integer> o2)
													{
														return (o1.getValue()).compareTo(o2.getValue());
													}
							});
		Collections.reverse(sortedValue);

		System.out.println("Sorted by key\n" + sortedKey.entrySet());
		System.out.println("\nSorted by value\n" + sortedValue);
	}
}
