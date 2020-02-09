package ex1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class zhongwen {
	public static void main(String[] args) {
		String a;
		int i = 0;
		String[] arr = new String[100];
		Scanner in = new Scanner(System.in);
		Map<String, Integer> maps = new HashMap<>();
		changeOne c1 = new changeOne();// 引用changeOne类
		changeTwo c2 = new changeTwo();// 引用changeTwo类
		while (!(a = in.nextLine()).equals("")) {
			arr = a.split(" ");
			if (arr[0].equals("整数"))
				maps.put(arr[1], c1.changeInt(arr[3]));
			else if (arr[1].equals("增加"))
				for (String key : maps.keySet()) {
					if (key.equals(arr[0])) {
						int value = maps.get(key);
						maps.put(arr[0], value + c1.changeInt(arr[2]));
						break;
					}
				}
			else if (arr[1].equals("减少"))
				for (String key : maps.keySet()) {
					if (key.equals(arr[0])) {
						int value = maps.get(key);
						maps.put(arr[0], value - c1.changeInt(arr[2]));
						break;
					}
				}
			else if (arr[0].equals("看看"))
				for (String key : maps.keySet()) {
					if (key.equals(arr[1])) {
						System.out.println(c2.changeString(maps.get(key)));
						break;
					}
				}
			else if (arr[0].equals("如果"))
				for (String key : maps.keySet()) {
					if (key.equals(arr[1]))
						if (maps.get(key) > c1.changeInt(arr[3])) {
							if (!arr[5].equals("看看"))
								for (String key1 : maps.keySet())
									if (key1.equals(arr[5])) {
										if (arr[6].equals("增加"))
											maps.put(arr[5], maps.get(key1) + c1.changeInt(arr[7]));
										else if (arr[6].equals("减少"))
											maps.put(arr[5], maps.get(key1) - c1.changeInt(arr[7]));
									} else
										;
							else
								System.out.println(arr[6].replace("“", "").replace("”", ""));
						} else {
							if (arr[8].equals("看看"))
								System.out.println(arr[9].replace("“", "").replace("”", ""));
							else if (arr[8].equals("无"))
								;
							else
								for (String key1 : maps.keySet())
									if (key1.equals(arr[9])) {
										if (arr[10].equals("增加"))
											maps.put(arr[9], maps.get(key1) + c1.changeInt(arr[11]));
										else if (arr[10].equals("减少"))
											maps.put(arr[9], maps.get(key1) - c1.changeInt(arr[11]));
									}
						}
				}
		}
	}
}
