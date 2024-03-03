package manav;

import java.util.Scanner;


public class sepetTutarı {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double salatalik,elma,kabak,domates,patlican,tutar,a,b,c,d,e;
		
		
		
		salatalik =(3.14);
		elma =(4.11);
		kabak =(2.22);
		domates =(0.95);
		patlican =(7);
		
		System.out.print("Enter the cucumber pieces :");
        a = input.nextDouble();
        
        System.out.print("Enter the apple pieces :");
		b = input.nextDouble();
		
		System.out.print("Enter the zucchini pieces :");
		c = input.nextDouble();
		
		System.out.print("Enter the tomato pieces :");
		d = input.nextDouble();
		
		System.out.print("Enter the aubergine pieces :");
		e = input.nextDouble();
		
		tutar =((a * salatalik) + (b * elma) + (c * kabak) + (d * domates) + (e * patlican));
		
		System.out.print("Your basket amount :" + tutar + "$ !");
		
		
		
		
		
		

	}

}
