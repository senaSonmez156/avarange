package avarange;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double mat,fizik,kimya,muzik;
		double total=0;
		double counter=0;
		
		System.out.print("Matematik notunuzu giriniz:");
		mat=scan.nextDouble();
		 if (mat >= 0 && mat <= 100) {
	            total += mat;
	            counter++;
	        }
		 
		System.out.print("Fizik notunuzu giriniz:");
		fizik=scan.nextDouble();
		if(fizik>=0 && fizik<=100) {
			total+=fizik;
			counter++;
		}
		System.out.print("Kimya notunuzu giriniz:");
		kimya=scan.nextDouble();
		if(kimya>=0 && kimya<=100) {
			total+=kimya;
			counter++;
		}
	
		System.out.print("M�zik notunuzu giriniz:");
		muzik=scan.nextDouble();
		if(muzik>=0 && muzik<=100) {
			total+=muzik;
			counter++;
		}
		
		double avarange=total/counter;
		
		if(avarange<55) {
			System.out.println("�zg�n�z s�n�f� ge�emediniz :( Ortalaman�z: " +avarange);
		}
		else if(avarange>55) {
			System.out.println("Tebrikler s�n�f� ge�tiniz: :) \nOrtalam�n�z: "+ avarange);
		}
    
		else {
			System.out.println("Bir �eyler yolunda gitmedi hay aksi");
		}

	}

}
