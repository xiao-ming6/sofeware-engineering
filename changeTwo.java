package ex1;

public class changeTwo {
	int b;
	public String onedigit(int b) {
		this.b=b;
		if(b==0)
			return "��";
		else if(b==1)
			return "һ";
		else if(b==2)
			return "��";
		else if(b==3)
			return "��";
		else if(b==4)
			return "��";
		else if(b==5)
			return "��";
		else if(b==6)
			return "��";
		else if(b==7)
			return "��";
		else if(b==8)
			return "��";
		else if(b==9)
			return "��";
		else if(b==10)
			return "ʮ";
		return null;
	}
	public String twodigit(int b) {
		this.b=b;
		if(b%10==0)
			return (onedigit(b/10)+"ʮ");
		else
			return (onedigit(b/10)+"ʮ"+onedigit(b%10));
	}
	public String threedigit(int b) {
		this.b=b;
		if(b%100==0)
			return (onedigit(b/100)+"��");
		else if(b%10==0)
			return (onedigit(b/100)+"��"+onedigit(b%100/10));
		else if(b%100<10&&b%100>0)
			return (onedigit(b/100)+"��"+onedigit(b/10%10)+onedigit(b%100));
		else
			return (onedigit(b/100)+"��"+twodigit(b%100));
	}
	public String fourdigit(int b) {
		this.b=b;
		if(b%1000==0)
			return (onedigit(b/1000)+"ǧ");
		if(b%100==0)
			return (onedigit(b/1000)+"ǧ"+onedigit(b/100%10));
		else if(b%1000<10&&b%1000>0)
			return (onedigit(b/1000)+"ǧ"+onedigit(b/10%100)+onedigit(b%1000));
		else if(b%1000<100&&b%1000>10)
			return (onedigit(b/1000)+"ǧ"+onedigit(b/100%10)+twodigit(b%100));
		else
			return (onedigit(b/1000)+"ǧ"+threedigit(b%1000));
	}
	public String changeString(int b) {
		this.b=b;
		if(b<0) {
			b=0-b;
			if(b/1000>0&&b/1000<10)
				return "��"+fourdigit(b);
			else if(b/100>0&&b/100<10)
				return "��"+threedigit(b);
			else if(b/10>0&&b/10<10&&b!=10)
				return "��"+twodigit(b);
			else 
				return "��"+onedigit(b);
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
