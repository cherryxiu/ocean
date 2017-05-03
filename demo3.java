
import java.util.Scanner;


public class demo3 {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入客户支付的金额：：");
		 float num=input.nextflaot();
		 //客户买东西所需支付的钱
		 float a=23.3f;
		 if(num>a){
			float b=num-a;
			System.out.println("需找给顾客的金额为：" +b);
		 }else{
			 if(num=a){
				 System.out.println("谢谢光临" );
			 }else{
			float c=a-num;
			 System.out.println("您的金额不足，需补交金额：" +c);
			 }
		 }

		}

}
