package com.cn.mapao;

public class MaoPao {
	public static void main(String[] args) {
		int [] a=new int[]{5,1,4,2,7,3,89,12,0,-1};
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}

}
