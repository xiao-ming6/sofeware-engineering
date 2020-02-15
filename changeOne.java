package ex1;

public class changeOne{
	String a;
	String[] arr=new String[20];
	public int onedigit(String a) {
		this.a=a;
		if(a.equals("零"))
			return 0;
		else if(a.equals("一"))
			return 1;
		else if(a.equals("二"))
			return 2;
		else if(a.equals("三"))
			return 3;
		else if(a.equals("四"))
			return 4;
		else if(a.equals("五"))
			return 5;
		else if(a.equals("六"))
			return 6;
		else if(a.equals("七"))
			return 7;
		else if(a.equals("八"))
			return 8;
		else if(a.equals("九"))
			return 9;
		else if(a.equals("十"))
			return 10;
		return (Integer) null;	
	}
	public int twodigit(String a) {
		this.a=a;
		arr=a.split("十");
		if(a.length()==2&&arr.length==1) 
			return onedigit(arr[0])*10;
		else if(a.length()==2&&arr.length==2) 
			return onedigit(arr[1])+10;
		else 
			return onedigit(arr[0])*10+onedigit(arr[1]);
	}
	public int threedigit(String a) {
		this.a=a;
		arr=a.split("百");
		if(a.length()==2)
			return onedigit(arr[0])*100;
		else if(arr[1].contains("零"))
			return onedigit(arr[0])*100+onedigit(arr[1].substring(1));
		else if(arr[1].length()==1)
			return onedigit(arr[0])*100+onedigit(arr[1])*10;
		else
			return onedigit(arr[0])*100+twodigit(arr[1]);
	}
	public int fourdigit(String a) {
		this.a=a;
		arr=a.split("千");
		if(a.length()==2)
			return onedigit(arr[0])*1000;
		else if(arr[1].contains("零")&&a.length()==4)
			return onedigit(arr[0])*1000+onedigit(arr[1].substring(1));
		else if(arr[1].contains("零")&&!arr[1].substring(1).contains("零"))
			return onedigit(arr[0])*1000+twodigit(arr[1].substring(1));
		else if(arr[1].length()==1)
			return onedigit(arr[0])*1000+onedigit(arr[1])*100;
		else
			return onedigit(arr[0])*1000+threedigit(arr[1]);
	}
	public int changeInt(String a) {
		this.a=a;
		if(a.contains("千"))
			return fourdigit(a);
		else if(a.contains("百"))
			return threedigit(a);
		else if(a.contains("十")&&a.length()>1)
			return twodigit(a);
		else
			return onedigit(a);
	}
}
