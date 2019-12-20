import java.io.*;
class quiz
{
public static void main(String args[])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(read);
int p=0,qr=0,qw=0,q=0;  
System.out.println("THANK YOU!! SIR/MADAM FOR PARTICIPATING IN THE QUIZ. WE HOPE THAT YOU WILL LOVE OUR GAME FROM THE CORE AND MANTLE OF YOUR HEART. DOWN HERE ARE SOME INSTRUCTIONS, JUST GO THROUGH THEM");
System.out.println("1. EACH QUESTION HAS 3 OPTIONS, U HAVE TO PRESS 1/2/3");
System.out.println("2. EACH CARRIES 2 POINTS");
System.out.println("3. FOR EVERY WRONG ANSWER THERE WILL BE -1");
System.out.println("4. FILL UP THE DETAILS BELOW");
System.out.println("ENTER YOUR NAME");
String n=br.readLine();
n=n.toUpperCase();
System.out.println("ENTER YOUR GENDER");
String gen=br.readLine();
System.out.println("SO READY FOR THE MIND TWISTING ROLLER COASTER RIDE!!! ALL U HAVE TO DO IS PRESS 1. GO ON BEST WISHES FROM ANUPAM!!!!!!!!!!");
int b=Integer.parseInt(br.readLine());
switch(b)
{
case 1:
System.out.println("WHICH MATHEMATICAL SYMBOL WILL YOU USE BY WHICH YOU WILL GET A NUMBER WHICH IS GREATER THAN 5 BUT LESS THAN 9 AND BETWEEN 5 AND 9");
System.out.println("1./\t2. .\t3.%");
int an1=Integer.parseInt(br.readLine());
if(an1==2)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 2:
System.out.println("WHICH IS THE 3rd POPULOUS CITY IN THE WORLDS 2nd POPULOUS COUNTRY");
System.out.println("1.KOLKATA\t2.SYDNEY\t3.BENGALURU");
int an2=Integer.parseInt(br.readLine());
if(an2==3)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 3:
System.out.println("WHAT IS THE WORK DONE BY MOON WHILE REVOLVING ROUND THE EARTH");
System.out.println("1.EQUAL TO ITS MASS\t2.0\t3.EQUAL TO THE FORCE OF GRAVITY OF THE EARTH");
int an3=Integer.parseInt(br.readLine());
if(an3==2)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
} 
q++;
case 4:
System.out.println("IF A=2, B=9, C=23, D=????");
System.out.println("1.44\t2.50\t3.93");
int an4=Integer.parseInt(br.readLine());
if(an4==1)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 5:
System.out.println("WHICH IS THE HIGHEST PEAK IN INDIA");
System.out.println("1.NANGA PARBAT\t2.MT.K2\t3.KANCHANJUNGA");
int an5=Integer.parseInt(br.readLine());
if(an5==2)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 6:
System.out.println("WHO IS THE 3rd RICHEST ACTOR IN THE WORLD");
System.out.println("1.SHAHRUKH KHAN\t2.TOM CRUISE\t3.AMITABH BACHCHAN");
int an6=Integer.parseInt(br.readLine());
if(an6==2)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 7:
System.out.println("WHO WAS THE EDITOR OF THE DAILY 'KESARI'");
System.out.println("1.SURENDRANATH BANERJEE\t2.LALA LAJPAT RAI\t3.BAL GANGADHAR TILAK");
int an7=Integer.parseInt(br.readLine());
if(an7==3)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 8:
System.out.println("WHAT IS THE EXPANDED FORM OF 'AIDS'");
System.out.println("1.ACQUIRED IMMUNO DEFICIENCY SYNDROME\t2.ACQUIRE IMMUNITY DEFICIENCY SYNDROME\t3.AQUIRED IMMUNO DISORDER SYNDROME");
int an8=Integer.parseInt(br.readLine());
if(an8==1)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 9:
System.out.println("WHO IS THE FATHER OF COMPUTER");
System.out.println("1.ALEXANDER FLEMING\t2.ALEXANDER GRAHAM BELL\t3.CHARLES BABAGE");
int an9=Integer.parseInt(br.readLine());
if(an9==3)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
case 10:
System.out.println("IF THE RESISTANCE OF A WIRE IS 10 ohm THEN WHAT WILL BE THE RESISTANCE IF THE SAME WIRE IS CUT INTO EQUAL HALF");
System.out.println("1.5 ohm\t2.20 ohm\t3.40 ohm");
int an10=Integer.parseInt(br.readLine());
if(an10==1)
{
System.out.println("RIGHT");
p=p+2;
qr++;
}
else
{
System.out.println("WRONG");
p=p-1;
qw++;
}
q++;
if(gen.equalsIgnoreCase("male"))
System.out.print("SIR ");
if(gen.equalsIgnoreCase("female"))
System.out.print("MADAM ");
System.out.println(n+", YOUR STATS");
System.out.println("NUMBER OF QUESTIONS: "+q);
System.out.println("NUMBER OF QUESTIONS THAT ARE RIGHT: "+qr);
System.out.println("NUMBER OF QUESTIONS THAT ARE WRONG: "+qw);
System.out.println("TOTAL SCORE: "+p);
if(p<5)
System.out.println("YOU HAVE TO SHARPEN YOUR BRAIN AS WELL AS IMPROVE YOUR G.K");
if(p>=5 && p<10)
System.out.println("NOT BAD BUT YOU HAVE TO DO MUCH BETTER THAN THIS");
if(p>=10 && p<15)
System.out.println("WELL YOU ARE QUITE INTELLIGENT. NICE TO MEET YOU");
if(p>=15 && p<20)
System.out.println("MIND BLOWING PERFORMANCE I WOULD HAVE GIVEN YOU A JOB IN THE INTELLIGENCE BUREAU! LOL! JUST JOKING!!!!!!!!!");
if(p==20)
System.out.println("....SHOULD I CALL YOU ALBERT EINSTEIN OR ISSAC NEWTON OR JUST BY YOUR NAME? AWESOME!OUTSTANDING!MAGNIFICENT!STUPENDOUS! *HOLLERS*");
}
}
}
