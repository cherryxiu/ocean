
import java.util.Scanner;


public class demo3 {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("������ͻ�֧���Ľ���");
		 float num=input.nextflaot();
		 //�ͻ���������֧����Ǯ
		 float a=23.3f;
		 if(num>a){
			float b=num-a;
			System.out.println("���Ҹ��˿͵Ľ��Ϊ��" +b);
		 }else{
			 if(num=a){
				 System.out.println("лл����" );
			 }else{
			float c=a-num;
			 System.out.println("���Ľ��㣬�貹����" +c);
			 }
		 }

		}

}
