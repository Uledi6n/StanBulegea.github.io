import java.util.*;
public class StudentScore {
				Scanner scan=new Scanner(System.in);
				
				public void studentdata(){
								System.out.print("Enter number of students: ");
			   	int no=scan.nextInt();
								
								double total=0;
								double[] score=new double[no];
												
								for		(int c=0;c<no;c++)		{
												System.out.print("Score of student "+(c+1)+": ");
												score[c]= scan.nextDouble();
												total+=score[c];
								}
								int eighty=0;
								int fiftyabove=0;
								int fiftybelow=0;
								
								for(double scor:score){
												if(scor>80 && scor<=100){
																eighty++;
												}else if(scor>=50 && scor<80){
																fiftyabove++;
												}else if(scor<50){
																fiftybelow++;
												}else{
																break;
												}
								}
								System.out.println("\n\n");
								System.out.print("\nStudent scores greater than 80%:  "+eighty);
								System.out.print(" \nStudent scores marks between 50% and 80%:  "+fiftyabove);
								System.out.print("\nStudent scores marks below 50% : "+fiftybelow);
								
				}
				
				public static void main(String[] args) {
								StudentScore obj=new StudentScore();
								obj.studentdata();
								
				}
				
}