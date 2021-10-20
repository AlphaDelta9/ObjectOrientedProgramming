import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import fraction.Fraction;
import fraction.Proper;
import fraction.Mixed;

public class Program{
	static Scanner scan;
	static Proper proper;
	static Mixed mixed;
	public Program() {
		ArrayList<Fraction> outputList = new ArrayList<>();
		scan = new Scanner(System.in);
		String input;
		String[] mixed,fraction,sign;
		Proper inputP1,inputP2;
		Mixed inputM1,inputM2;
//		for (int i = 0; i < 10; i++) {
//			if(new Random().nextBoolean()) {
//				outputList.add(new Proper(new Random().nextInt(Short.MAX_VALUE), new Random().nextInt(Short.MAX_VALUE)));
//			}else {
//				outputList.add(new Mixed(new Random().nextInt(Byte.MAX_VALUE), new Random().nextInt(Short.MAX_VALUE), new Random().nextInt(Short.MAX_VALUE)));
//			}
//		}
		do {
			inputP1=new Proper();inputP2=new Proper();
			inputM1=new Mixed();inputM2=new Mixed();
			System.out.println("?#?\nInput Fraction or Mixed Fraction only:");
			input=scan.nextLine().trim();
//			try {
//				sign=input.split("#");
//				try {
//					mixed=sign[0].split(" ");
//					fraction=mixed[1].split("/");
//					inputM1=new Mixed(Integer.parseInt(mixed[0]), Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
//					try {
//						mixed=sign[1].split(" ");
//						fraction=mixed[1].split("/");
//						inputM2=new Mixed(Integer.parseInt(mixed[0]), Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
//						outputList.add(inputM1);
//						outputList.add(inputM2);
//					} catch (Exception e) {
//						fraction=sign[1].split("/");
//						inputP2=new Proper(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
//						outputList.add(inputM1);
//						outputList.add(inputP2);
//					}
//				} catch (Exception e) {
//					fraction=sign[0].split("/");
//					inputP1=new Proper(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
//					try {
//						mixed=sign[1].split(" ");
//						fraction=mixed[1].split("/");
//						inputM2=new Mixed(Integer.parseInt(mixed[0]), Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
//						outputList.add(inputP1);
//						outputList.add(inputM2);						
//					} catch (Exception e2) {
//						fraction=sign[1].split("/");
//						inputP2=new Proper(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
//						outputList.add(inputP1);
//						outputList.add(inputP2);
//					}
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			if(input.contains("*")) {
				sign=input.split("\\*");
				if(sign[0].contains("/")){
				fraction=sign[0].split("/");
				try {
					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(sign[1].contains("/")){
				fraction=sign[1].split("/");
				try {
					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(inputP1.getDenominator() != null) {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputP1.multiply(inputP2));
					}else {
						outputList.add(inputP1.multiply(inputM2));					
					}
				}else {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputM1.multiply(inputP2));
					}else {
						outputList.add(inputM1.multiply(inputM2));						
					}
				}
				}
				}
			}
			else if(input.contains("\\")) {
				sign=input.split("\\\\");
				if(sign[0].contains("/")){
				fraction=sign[0].split("/");
				try {
					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(sign[1].contains("/")){
				fraction=sign[1].split("/");
				try {
					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(inputP1.getDenominator() != null) {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputP1.divide(inputP2));
					}else {
						outputList.add(inputP1.divide(inputM2));						
					}
				}else {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputM1.divide(inputP2));
					}else {
						outputList.add(inputM1.divide(inputM2));						
					}
				}
				}
				}
			}
			else if(input.contains("+")) {
				sign=input.split("\\+");
				if(sign[0].contains("/")){
				fraction=sign[0].split("/");
				try {
					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(sign[1].contains("/")){
				fraction=sign[1].split("/");
				try {
					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(inputP1.getDenominator() != null) {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputP1.add(inputP2));
					}else {
						outputList.add(inputP1.add(inputM2));						
					}
				}else {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputM1.add(inputP2));
					}else {
						outputList.add(inputM1.add(inputM2));						
					}
				}
				}
				}
			}
			else if(input.contains("-")) {
				sign=input.split("\\-");
				if(sign[0].contains("/")){
				fraction=sign[0].split("/");
				try {
					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(sign[1].contains("/")){
				fraction=sign[1].split("/");
				try {
					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
				} catch (Exception e) {
					mixed=fraction[0].split(" ");
					try {
						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(inputP1.getDenominator() != null) {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputP1.subtract(inputP2));
					}else {
						outputList.add(inputP1.subtract(inputM2));					
					}
				}else {
					if(inputP2.getDenominator() != null) {
						outputList.add(inputM1.subtract(inputP2));
					}else {
						outputList.add(inputM1.subtract(inputM2));					
					}
				}
				}
				}
			}
		}while(!input.equals("0"));
//		for (int i = 0; i < outputList.size(); i++) {
//				if(outputList.get(i).getClass().equals(Proper.class)) {
//					System.out.print(outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
//				}else {
//					try {
//						System.out.print((outputList.get(i).getNumerator()/outputList.get(i).getDenominator())+" "+(outputList.get(i).getNumerator()%outputList.get(i).getDenominator())+"/"+outputList.get(i).getDenominator());
//					} catch (Exception e) {
//						System.out.print(outputList.get(i).getNumerator()/outputList.get(i).getDenominator()+" "+outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
//					}
//				}
//				if(outputList.get(i).compareTo(outputList.get(i+1))==0) {
//					System.out.print(" is same with ");
//				}else
//				if(outputList.get(i).getDenominator()==0||outputList.get(i+1).getDenominator()==0) {
//					System.out.print(" is not comparable with ");
//				}else
//				if(outputList.get(i).getNumerator()==0||outputList.get(i).compareTo(outputList.get(i+1))<0) {
//					System.out.print(" is smaller than ");
//				}else
//				if(outputList.get(i).compareTo(outputList.get(i+1))>0) {
//					System.out.print(" is larger than ");
//				}
//				i++;
//				if(outputList.get(i).getClass().equals(Proper.class)) {
//					System.out.println(outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
//				}else {
//					try {
//						System.out.println((outputList.get(i).getNumerator()/outputList.get(i).getDenominator())+" "+(outputList.get(i).getNumerator()%outputList.get(i).getDenominator())+"/"+outputList.get(i).getDenominator());
//					} catch (Exception e) {
//						System.out.println(outputList.get(i).getNumerator()/outputList.get(i).getDenominator()+" "+outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
//					}
//				}
//		}
		System.out.println();
//		Collections.sort(outputList);
		for (Fraction output : outputList) {
				System.out.println("Mixed Fraction: "+output.getNumerator()/output.getDenominator()+" "+output.getNumerator()%output.getDenominator()+"/"+output.getDenominator());
				System.out.println("Fraction: "+output.getNumerator()+"/"+output.getDenominator());
			System.out.println();
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program();
	}

}
