package ex1;

public class changeOne{
	String a;
	String[] arr=new String[20];
	public int onedigit(String a) {
		this.a=a;
		if(a.equals("��"))
			return 0;
		else if(a.equals("һ"))
			return 1;
		else if(a.equals("��"))
			return 2;
		else if(a.equals("��"))
			return 3;
		else if(a.equals("��"))
			return 4;
		else if(a.equals("��"))
			return 5;
		else if(a.equals("��"))
			return 6;
		else if(a.equals("��"))
			return 7;
		else if(a.equals("��"))
			return 8;
		else if(a.equals("��"))
			return 9;
		else if(a.equals("ʮ"))
			return 10;
		return (Integer) null;	
	}
	public int twodigit(String a) {
		this.a=a;
		arr=a.split("ʮ");
		if(a.length()==2&&arr.length==1) 
			return onedigit(arr[0])*10;
		else if(a.length()==2&&arr.length==2) 
			return onedigit(arr[1])+10;
		else 
			return onedigit(arr[0])*10+onedigit(arr[1]);
	}
	public int threedigit(String a) {
		this.a=a;
		arr=a.split("��");
		if(a.length()==2)
			return onedigit(arr[0])*100;
		else if(arr[1].contains("��"))
			return onedigit(arr[0])*100+onedigit(arr[1].substring(1));
		else if(arr[1].length()==1)
			return onedigit(arr[0])*100+onedigit(arr[1])*10;
		else
			return onedigit(arr[0])*100+twodigit(arr[1]);
	}
	public int fourdigit(String a) {
		this.a=a;
		arr=a.split("ǧ");
		if(a.length()==2)
			return onedigit(arr[0])*1000;
		else if(arr[1].contains("��")&&a.length()==4)
			return onedigit(arr[0])*1000+onedigit(arr[1].substring(1));
		else if(arr[1].contains("��")&&!arr[1].substring(1).contains("��"))
			return onedigit(arr[0])*1000+twodigit(arr[1].substring(1));
		else if(arr[1].length()==1)
			return onedigit(arr[0])*1000+onedigit(arr[1])*100;
		else
			return onedigit(arr[0])*1000+threedigit(arr[1]);
	}
	public int changeInt(String a) {
		this.a=a;
		if(a.contains("ǧ"))
			return fourdigit(a);
		else if(a.contains("��"))
			return threedigit(a);
		else if(a.contains("ʮ")&&a.length()>1)
			return twodigit(a);
		else
			return onedigit(a);
	}
}

