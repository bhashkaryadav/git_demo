interface Calc
{
	float add(int a,int b);
	float divide(int x,int y);
	float subtract(int c ,int d);
	float multiply(int s,int t);
}
class Calci implements Calc 
{
	public  float add(int a,int b){
		return (a+b);
	}
	public  float divide(int x ,int y){
		return (x/y);
	}
	public  float subtract(int c ,int d){
		return (c-d);
	}
	public  float multiply(int s ,int t){
		return (s*t);
	}
	public static void main(String []arr){
	 Calci obj = new Calci();
	 System.out.println(obj.add(3,4));
	 System.out.println(obj.multiply(5,4));
	 System.out.println(obj.subtract(7,4));
	 System.out.println(obj.divide(67,4));
	}
}