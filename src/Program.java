import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import fraction.Fraction;
import fraction.Proper;
import fraction.Mixed;

public class Program{
	static Scanner scan;
	static Lock lock;
	static Condition newDeposit;
	static Proper proper;
	static Mixed mixed;
	public Program() {
		ArrayList<Fraction> outputList = new ArrayList<>();
		scan = new Scanner(System.in);
		Boolean drm=false;
		String input;
		String[] mixed,fraction,sign;
		Proper inputP1,inputP2;
		Mixed inputM1,inputM2;
//		Decimal inputD=new Decimal(),inputD2=new Decimal();
		do {
			inputP1=new Proper();inputP2=new Proper();
			inputM1=new Mixed();inputM2=new Mixed();
			System.out.println("?#?\nInput Fraction or Mixed Fraction only:");//Decimal removed since assignment 5
			input=scan.nextLine().trim();
			try {
				sign=input.split("#");
				try {
					mixed=sign[0].split(" ");
					fraction=mixed[1].split("/");
					inputM1=new Mixed(Integer.parseInt(mixed[0]), Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
					try {
						mixed=sign[1].split(" ");
						fraction=mixed[1].split("/");
						inputM2=new Mixed(Integer.parseInt(mixed[0]), Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
						outputList.add(inputM1);
						outputList.add(inputM2);
					} catch (Exception e) {
						// TODO: handle exception
						fraction=sign[1].split("/");
						inputP2=new Proper(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
						outputList.add(inputM1);
						outputList.add(inputP2);
					}
				} catch (Exception e) {
					// TODO: handle exception
					fraction=sign[0].split("/");
					inputP1=new Proper(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
					try {
						mixed=sign[1].split(" ");
						fraction=mixed[1].split("/");
						inputM2=new Mixed(Integer.parseInt(mixed[0]), Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
						outputList.add(inputP1);
						outputList.add(inputM2);						
					} catch (Exception e2) {
						// TODO: handle exception
						fraction=sign[1].split("/");
						inputP2=new Proper(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
						outputList.add(inputP1);
						outputList.add(inputP2);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
//			if(input.contains("*")) {
//				sign=input.split("\\*");
//				if(sign[0].contains("/")){
//				fraction=sign[0].split("/");
//				try {
//					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
//				if(sign[1].contains("/")){
//				fraction=sign[1].split("/");
//				try {
//					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM2.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM2.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
//				if(inputP1.getDenominator() != null) {
//					if(inputP2.getDenominator() != null) {
////						inputP1.multiply(inputP2);
//						outputList.add(inputP1.multiply(inputP2));
//					}else {
////						inputP1.multiply(inputM2);	
//						outputList.add(inputP1.multiply(inputM2));					
//					}
//				}else {
//					if(inputP2.getDenominator() != null) {
////						inputM1.multiply(inputP2);
//						outputList.add(inputM1.multiply(inputP2));
//					}else {
////						inputM1.multiply(inputM2);
//						outputList.add(inputM1.multiply(inputM2));						
//					}
//				}
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
////			}else {
////				if(!sign[1].equals("0")) {
////					try {
////						inputD2 = new Decimal(Double.parseDouble(sign[1]));
////						inputD2.proper();
////					} catch (Exception e) {
////						// TODO: handle exception
////					}
////				}
////				inputM.multiply(inputD2);
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
//			}
//			}
//			}
//			else if(input.contains("\\")) {
//				sign=input.split("\\\\");
//				if(sign[0].contains("/")){
//				fraction=sign[0].split("/");
//				try {
//					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
//				if(sign[1].contains("/")){
//				fraction=sign[1].split("/");
//				try {
//					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM2.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM2.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
////				inputM.divide(inputM2);
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
//				if(inputP1.getDenominator() != null) {
//					if(inputP2.getDenominator() != null) {
////						inputP1.divide(inputP2);
//						outputList.add(inputP1.divide(inputP2));
//					}else {
////						inputP1.divide(inputM2);
//						outputList.add(inputP1.divide(inputM2));						
//					}
//				}else {
//					if(inputP2.getDenominator() != null) {
////						inputM1.divide(inputP2);
//						outputList.add(inputM1.divide(inputP2));
//					}else {
////						inputM1.divide(inputM2);
//						outputList.add(inputM1.divide(inputM2));						
//					}
//				}
////			}else {
////				if(!sign[1].equals("0")) {
////					try {
////						inputD2 = new Decimal(Double.parseDouble(sign[1]));
////						inputD2.proper();
////					} catch (Exception e) {
////						// TODO: handle exception
////					}
////				}
////				inputM.divide(inputD2);
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
//			}
//			}
//			}
//			else if(input.contains("+")) {
//				sign=input.split("\\+");
//				if(sign[0].contains("/")){
//				fraction=sign[0].split("/");
//				try {
//					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
//				if(sign[1].contains("/")){
//				fraction=sign[1].split("/");
//				try {
//					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM2.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM2.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
////				inputM.add(inputM2);
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
//				if(inputP1.getDenominator() != null) {
//					if(inputP2.getDenominator() != null) {
////						inputP1.add(inputP2);
//						outputList.add(inputP1.add(inputP2));
//					}else {
////						inputP1.add(inputM2);
//						outputList.add(inputP1.add(inputM2));						
//					}
//				}else {
//					if(inputP2.getDenominator() != null) {
////						inputM1.add(inputP2);
//						outputList.add(inputM1.add(inputP2));
//					}else {
////						inputM1.add(inputM2);
//						outputList.add(inputM1.add(inputM2));						
//					}
//				}
////			}else {
////				if(!sign[1].equals("0")) {
////					try {
////						inputD2 = new Decimal(Double.parseDouble(sign[1]));
////						inputD2.proper();
////					} catch (Exception e) {
////						// TODO: handle exception
////					}
////				}
////				inputM.add(inputD2);
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
//			}
//			}
//			}
//			else if(input.contains("-")) {
//				sign=input.split("\\-");
//				if(sign[0].contains("/")){
//				fraction=sign[0].split("/");
//				try {
//					inputP1 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM1 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
//				if(sign[1].contains("/")){
//				fraction=sign[1].split("/");
//				try {
//					inputP2 = new Proper(Integer.parseInt(fraction[0]),Integer.parseInt(fraction[1]));
////					inputM2.proper();
//				} catch (Exception e) {
//					// TODO: handle exception
//					String[] mixed=fraction[0].split(" ");
//					try {
//						inputM2 = new Mixed(Integer.parseInt(mixed[0]),Integer.parseInt(mixed[1]),Integer.parseInt(fraction[1]));
////						inputM2.proper();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
////				inputM.subtract(inputM2);
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
//
//				if(inputP1.getDenominator() != null) {
//					if(inputP2.getDenominator() != null) {
////						inputP1.subtract(inputP2);
//						outputList.add(inputP1.subtract(inputP2));
//					}else {
////						inputP1.subtract(inputM2);	
//						outputList.add(inputP1.subtract(inputM2));					
//					}
//				}else {
//					if(inputP2.getDenominator() != null) {
////						inputM1.subtract(inputP2);
//						outputList.add(inputM1.subtract(inputP2));
//					}else {
////						inputM1.subtract(inputM2);	
//						outputList.add(inputM1.subtract(inputM2));					
//					}
//				}
////			}else {
////				if(!sign[1].equals("0")) {
////					try {
////						inputD2 = new Decimal(Double.parseDouble(sign[1]));
////						inputD2.proper();
////					} catch (Exception e) {
////						// TODO: handle exception
////					}
////				}
////				inputM.subtract(inputD2);
////				inputM.proper();
////				outputList.add(inputM.getDenominator()+"/"+inputM.getNumerator());
//			}
//			}
//			}
			if(!drm) {
				// MonthAssignmentDayChange
				System.out.println("Candidate Build 57234\n");
			}
		}while(!input.equals("0"));
		for (int i = 0; i < outputList.size(); i++) {
				if(outputList.get(i).getClass().equals(Proper.class)) {
					System.out.print(outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
				}else {
					try {
						System.out.print((outputList.get(i).getNumerator()/outputList.get(i).getDenominator())+" "+(outputList.get(i).getNumerator()%outputList.get(i).getDenominator())+"/"+outputList.get(i).getDenominator());
					} catch (Exception e) {
						// TODO: handle exception
						System.out.print(outputList.get(i).getNumber()+" "+outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
					}
				}
				if(outputList.get(i).compareTo(outputList.get(i+1))==0) {
					System.out.print(" is same with ");
				}else
				if(outputList.get(i).getDenominator()==0||outputList.get(i+1).getDenominator()==0) {
					System.out.print(" is not comparable with ");
				}else
				if(outputList.get(i).getNumerator()==0||outputList.get(i).compareTo(outputList.get(i+1))<0) {
					System.out.print(" is smaller than ");
				}else
				if(outputList.get(i).compareTo(outputList.get(i+1))>0) {
					System.out.print(" is larger than ");
				}
				i++;
				if(outputList.get(i).getClass().equals(Proper.class)) {
					System.out.println(outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
				}else {
					try {
						System.out.println((outputList.get(i).getNumerator()/outputList.get(i).getDenominator())+" "+(outputList.get(i).getNumerator()%outputList.get(i).getDenominator())+"/"+outputList.get(i).getDenominator());
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(outputList.get(i).getNumber()+" "+outputList.get(i).getNumerator()+"/"+outputList.get(i).getDenominator());
					}
				}
		}
		System.out.println();
		Collections.sort(outputList);
//		outputList.sort(new Comparator<Fraction>() {
//			@Override
//			public int compare(Fraction o1, Fraction o2) {
//				// TODO Auto-generated method stub
//				Double d1=o1.getNumerator().doubleValue()/o1.getDenominator().doubleValue(),d2=o2.getNumerator().doubleValue()/o2.getDenominator().doubleValue();
//				return d1.compareTo(d2);
//			}
//		});
		for (Fraction output : outputList) {
//			String[] outputL=output.split("/");
//			try {
//				System.out.println("Decimal: "+(Double.parseDouble(outputL[0])/Double.parseDouble(outputL[1])));
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Decimal: Infinity");
//			}
			try {
				System.out.println("Mixed Fraction: "+output.getNumerator()/output.getDenominator()+" "+output.getNumerator()%output.getDenominator()+"/"+output.getDenominator());
				System.out.println("Fraction: "+output.getNumerator()+"/"+output.getDenominator());
			}catch (Exception e) {
				// TODO: handle exception
				if(output.getClass().equals(Mixed.class)) {
					System.out.println("Mixed Fraction: "+output.getNumber()+" "+output.getNumerator()+"/"+output.getDenominator());
					System.out.println("Fraction: "+output.getNumerator()+"/"+output.getDenominator());
				}else {
					System.out.println("Mixed Fraction: 0 "+output.getNumerator()+"/"+output.getDenominator());
					System.out.println("Fraction: "+output.getNumerator()+"/"+output.getDenominator());
				}
			}
			System.out.println();
		}
		scan.close();
	}

	public static class add implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				while (true) {
					lock.lock();
					Integer next = new Random().nextInt(10)+1;
					if(proper!=null) {
						System.out.print(proper.getNumerator()+"/"+proper.getDenominator()+"+"+next+"/1=");
						proper.add(new Proper(next,1));
						System.out.println(proper.getNumerator()+"/"+proper.getDenominator());
					}else {
						Integer safe =  new Random().nextInt(10)+1;
						System.out.print(mixed.getNumerator()/mixed.getDenominator()+" "+mixed.getNumerator()%mixed.getDenominator()+"/"+mixed.getDenominator()+"+"+safe+" "+next+"/1=");
						mixed.add(new Mixed(safe,next,1));
						System.out.println(mixed.getNumerator()/mixed.getDenominator()+" "+mixed.getNumerator()%mixed.getDenominator()+"/"+mixed.getDenominator());
					}
					newDeposit.signalAll();
					lock.unlock();
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public static class subtract implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				lock.lock();
				try {
					Integer next=new Random().nextInt(10)+1;
					if(proper!=null) {
						while(proper.compareTo(new Proper(next,1))<0) {
							System.out.println("Wait for a addition");
							newDeposit.await();
						}
						System.out.print(proper.getNumerator()+"/"+proper.getDenominator()+"-"+next+"/1=");
						proper.subtract(new Proper(next,1));
						System.out.println(proper.getNumerator()+"/"+proper.getDenominator());
					}else {
						Integer safe =  new Random().nextInt(10)+1;
						while(mixed.compareTo(new Mixed(safe,next,1))<0) {
							System.out.println("Wait for a addition");
							newDeposit.await();
						}
						System.out.print(mixed.getNumerator()/mixed.getDenominator()+" "+mixed.getNumerator()%mixed.getDenominator()+"/"+mixed.getDenominator()+"-"+safe+" "+next+"/1=");
						mixed.subtract(new Mixed(safe,next,1));
						System.out.println(mixed.getNumerator()/mixed.getDenominator()+" "+mixed.getNumerator()%mixed.getDenominator()+"/"+mixed.getDenominator());
					}
				} catch (InterruptedException ie){
					ie.printStackTrace();
				}
				lock.unlock();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Program();
		lock = new ReentrantLock();
		newDeposit = lock.newCondition();
		scan = new Scanner(System.in);
		String string = scan.nextLine();
		try {
			String[] stringObject = string.split("/");
			if(stringObject[0].contains(" ")) {
				String[] stringNumber = stringObject[0].split(" ");
				mixed = new Mixed(Integer.parseInt(stringNumber[0]),Integer.parseInt(stringNumber[1]),Integer.parseInt(stringObject[1]));
			}else {
				proper = new Proper(Integer.parseInt(stringObject[0]),Integer.parseInt(stringObject[1]));
			}

			ExecutorService executor = Executors.newCachedThreadPool();
			executor.execute(new subtract());
			executor.execute(new add());
			executor.shutdown();

		} catch (Exception e) {
			// TODO: handle exception
		}
		scan.close();
	}

}
