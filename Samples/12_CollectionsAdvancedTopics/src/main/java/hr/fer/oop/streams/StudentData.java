package hr.fer.oop.streams;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

	public static List<Student> load() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("王", "芷若", "0000000001", 3)); //Wáng 		Zhi Ruo
		list.add(new Student("李", "语嫣", "0000000002", 4)); //Lǐ 		Yu Yan
		list.add(new Student("周", "望舒", "0000000003", 5)); //Zhōu 		Wang Shu
		list.add(new Student("徐", "语嫣", "0000000004", 4)); //Xú 		Yu Yan
		list.add(new Student("郭", "风眠", "0000000005", 3)); //Guō 		Feng Mian
		list.add(new Student("林", "芷若", "0000000006", 5)); //Lin 		Zhi Ruo
		list.add(new Student("林", "徽因", "0000000007", 5)); //Lin 		Hui Yin
		list.add(new Student("郭", "芷若", "0000000008", 5)); //Guō 		Zhi Ruo
		return list;
	}

}