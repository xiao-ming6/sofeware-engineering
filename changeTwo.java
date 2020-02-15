package ex1;

public class changeTwo {
	int b;
	public String onedigit(int b) {
		this.b=b;
		if(b==0)
			return "零";
		else if(b==1)
			return "一";
		else if(b==2)
			return "二";
		else if(b==3)
			return "三";
		else if(b==4)
			return "四";
		else if(b==5)
			return "五";
		else if(b==6)
			return "六";
		else if(b==7)
			return "七";
		else if(b==8)
			return "八";
		else if(b==9)
			return "九";
		else if(b==10)
			return "十";
		return null;
	}
	public String twodigit(int b) {
		this.b=b;
		if(b%10==0)
			return (onedigit(b/10)+"十");
		else
			return (onedigit(b/10)+"十"+onedigit(b%10));
	}
	public String threedigit(int b) {
		this.b=b;
		if(b%100==0)
			return (onedigit(b/100)+"百");
		else if(b%10==0)
			return (onedigit(b/100)+"百"+onedigit(b%100/10));
		else if(b%100<10&&b%100>0)
			return (onedigit(b/100)+"百"+onedigit(b/10%10)+onedigit(b%100));
		else
			return (onedigit(b/100)+"百"+twodigit(b%100));
	}
	public String fourdigit(int b) {
		this.b=b;
		if(b%1000==0)
			return (onedigit(b/1000)+"千");
		if(b%100==0)
			return (onedigit(b/1000)+"千"+onedigit(b/100%10));
		else if(b%1000<10&&b%1000>0)
			return (onedigit(b/1000)+"千"+onedigit(b/10%100)+onedigit(b%1000));
		else if(b%1000<100&&b%1000>10)
			return (onedigit(b/1000)+"千"+onedigit(b/100%10)+twodigit(b%100));
		else
			return (onedigit(b/1000)+"千"+threedigit(b%1000));
	}
	public String changeString(int b) {
		this.b=b;
		if(b<0) {
			b=0-b;
			if(b/1000>0&&b/1000<10)
				return "负"+fourdigit(b);
			else if(b/100>0&&b/100<10)
				return "负"+threedigit(b);
			else if(b/10>0&&b/10<10&&b!=10)
				return "负"+twodigit(b);
			else 
				return "负"+onedigit(b);
		}
		else
			if(b/1000>0&&b/1000<10)
				return fourdigit(b);
			else if(b/100>0&&b/100<10)
				return threedigit(b);
			else if(b/10>0&&b/10<10&&b!=10)
				return twodigit(b);
			else 
				return onedigit(b);
	}
}