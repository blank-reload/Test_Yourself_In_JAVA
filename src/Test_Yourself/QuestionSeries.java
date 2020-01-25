package Test_Yourself;

class QuestionSeries{
	
	static String info ="Java Online Test Week  \n \nINSTRUCTIONS:\nThere are 25 questions in this test and 25 minutes to complete them all.\nThe finish button is highlighted in blue when you reach the end of the test. \nClicking the finish button will display the results with the correct answers marked in light red.  \n \nThe timecounter  begins when you click on the 'start' button \n \nBest of luck!\n";
	
	static String []question = {
			"Question 1:\nWhat is the result of attempting to compile and run the following program?\n\npublic class JavaAppclass{\npublic static void main(String args){\n   String myString = \"javaprograms\";\n   System.out.println(myString);\n   }\n}\n",
			"Question 2:\nWhat is the result of attempting to compile and run the following program with \n\n>javac JavaApp.java\n>java JavaApp\n\nclass TryFirst{\n   String myString = \"javatest\";\n}\n\nclass JavaApp{\n\npublic static void main(String[] arg){\n System.out.println(new TryFirst().myString);\n}\n}\n",
			"Question 3: \nWhat is the result of attempting to compile and run the following program with \n>javac JavaApp.java\n>java JavaApp\n\nclass MyJavaApp{ \n   String myString = \"elephants\"; \npublic static void main(String[] arg){ \n      System.out.println(myString); \n   } \n}\n",
			"Question 4:\nWhat is the result?\n\nclass JavaApp{ \n  public static void main(String[] a){ \n    String textstr = \"hello\";\n    for (int i=4; i<5; i++)\n      System.out.println(str); \n  } \n}\n",
			"Question 5:\nWhat is the result here?\n\nclass MyJavaApp{ \n  public static void main(String[] a){ \n    int j=0;\n    for (int i=0; i<3; i++) j=j+i;\n      System.out.println(j); \n  } \n}\n",
			"Question 6:\nWhat is the result?\n\nclass MyJavaApp{ \n  public static void main(String[] a){ \n    int num1;\n    int num2 = 7;\n    num2= num1 * 2 +3;\n    System.out.println(num2); \n  } \n}\n",
			"Question 7:\nWhat is the result?\n\nclass MyJavaApp{ \n  int num1;\n  public static void main(String[] a){ \n    number1=2;\n    int number2 = 7;\n    number2= number1 * 2 +3;\n    System.out.println(number2); \n  } \n}\n",
			"Question 8:\nWhat is the result?\n\nclass JavaApp{ \n  static int number1 = 4;\n  public static void main(String[] a){ \n    number1=2;\n    int number2 = 7;\n    number2= number1 * 2 +3;\n    System.out.println(number2); \n  } \n}\n",
			"Question 9:\nWhat is the result?\n\nclass JavaApp{ \n  static int number1 = 3;\n  public static void main(String[] arg)\n    int number2 = 7;\n    number2= number2 + number1 * 2 +3;\n    System.out.println(number2); \n  } \n}\n",
			"Question 10:\nWhat is the result of compiling and running the following code?\n\nclass JavaApp{ \n  public static void main(String[] a){\n    int x = (int) (Math.random());\n    System.out.println(x); \n  } \n}\n",
			"Question 11:\nWhat is the result?\n\nclass Tryclass{ \n  static String text = \"rabbit\";\n  public static void main(String[] a){\n    int num = text.length;\n    System.out.println(num); \n  } \n}\n",
			"Question 12:\nWhat would be the result here?\n\nclass Myclass{ \n  public static void main(String[] a){\n    char []rabbit={'a','b','c','d'};\n    int num = rabbit.length;\n    System.out.println(num); \n  } \n}\n",
			"Question 13:\nWhat is the result here?\n\nclass JavaApp{ \n  public static void main(String[] a){\n    int number = 10;\n    String mystr = Integer.toBinaryString(number);\n    System.out.println(mystr); \n  } \n}\n",
			"Question 14:\nWhat would be the result if we were to run this program with\n>java MyJavaApp hello java world ?\n\nclass MyJavaApp{ \npublic static void main(String[] args){\n    System.out.println(args[1]); \n  } \n}\n",
			"Question 15:\nWhat is the result of this program?\n\nclass MyJavaApp{ \n  public static void main(String[] a){\n    double d =1.75;\n    int i = d;\n    System.out.println(i++); \n  } \n}\n",
			"Question 16:\nWhat is the result of this program?\n\nclass MyJavaApp{ \n  public static void main(String[] a){\n    int 1stNum = 5;\n    int 2ndNum = 3;\n    double d =1.25 +1stNum/2ndNum;\n    System.out.println(d); \n  } \n}\n",
			"Question 17:\nWhat is the result of this program?\n\nclass MyJavaApp{ \n public static void main(String[] arg){\n    int Num1 = 5;\n    int Num2 = 4;\n    double d =1.25 +Num1/Num2;\n    System.out.println(d); \n  } \n}\n",
			"Question 18:\nWhat is the result of this program?\n\nclass TryJavaApp{ \n  static float f;\n  public static void main(String[] ar){\n    int Number = 5;\n    f = 1.25;    \n    System.out.println(f*4); \n  } \n}\n",
			"Question 19:\nWhat is the result of this program?\n\nclass JavaApp{ \n  static float f;\n  public static void main(String[] ar){\n    int Num = 2;\n    f = (float)1.25 * 2;    \n    System.out.println(f * Num); \n  } \n}\n",
			"Question 20:\nWhat is the result of this program?\n\nclass HelloJavaApp{ \n public static void main(String[] ar){\n    byte num = 64;\n    num += num;\n    System.out.println(num); \n  } \n}\n",
			"Question 21:\nWhat is the result of this program?\n\nclass JavaApp{ \n  public static void main(String[] a){\n  double d = 1.56789;\n    long num = Math.round(d);\n    System.out.println(num); \n  } \n}\n",
			"Question 22:\nWhat is the result of this program?\n\nclass JavaApp{ \n  public static void main(String[] a){\n    double d = 1.56789;\n    int num = (int)Math.round(d * d);\n    System.out.println(num); \n  } \n}\n",
			"Question 23:\nWhat is the result of this program?\n\nclass MyJavaApp{\npublic static void main(String[] arg){\n    double doub1 = 1.51;\n    int number1 = (int) (doub1 +0.5);\n    System.out.println(number1); \n    double doub2 = -1.51;\n    int number2 = (int) (doub2 +0.5);\n    System.out.println(number2); \n  } \n}\n",
			"Question 24:\nWhat is the result of this program?\n\nclass TryApp{ \npublic static void main(String[] arg){\n    int num = 4;\n    num = (num + 4/2) % num+1;\n    System.out.println(num); \n  } \n}\n",
			"Question 25:\nWhat is the result?\n\nclass MyApp{ \n  public static void main(String[] ar){\n    for(int i=0; i<3; i++)\n      for(int j=1; j<3; j++)\n        System.out.print(j+i+\",\"); \n  } \n}\n"
	};
	
	static String [][]answers ={
			{"It will not compile as the main method  String is not an array\n","It will compile but there will be a runtime error if we try to run it with:- \n>java JavaApp\n","The program is fine, but we will need another program to run it and get the output.\n","It will compile and run and output \"java\" to the screen\n"},
			{"It will not compile as you cannot have 2 java source files on the same page\n"," \nIt will output \"javatest","It will not compile as the String myString is not-static and it is being accessed from a static method\n"," \nIt compiles but there is no output at runtime\n"},
			{" \nFine - it will output elephants\n","Runtime error MyJavaApp is not public\n","Compiler error myString is a non-static variable being accessed in a static method\n","Compile error in the main() method\n"},
			{" \nIt will output hello\n","The out put will be  \nhello\nhello\n"," \nNo output the for loop needs a ' ; ' at the end\n"," \nCompilation error for loops have to start with a zero\n"},
			{" \n3\n"," \n6\n"," \n4\n"," \n2\n"},
			{" \n17\n"," \n5\n"," \n3\n","It won't compile\n"},
			{" \n14\n"," \n7\n"," \n17\n"," \nError.\n"},
			{" \n16\n"," \n14\n"," \n7\n"," \nError\n"},
			{" \n15\n"," \n23\n"," \n50\n"," \nError\n"},
			{" \n1\n"," \nYou cannot predict the random result\n"," \n0\n"," \nError\n"},
			{" \n6\n"," \n5\n"," \n0\n"," \nError\n"},
			{" \n4\n"," \n3\n"," \n0\n"," \nError\n"},
			{" \n00001010\n"," \n10\n"," \n1010\n"," \nError\n"},
			{"hello java world\n"," \nhello\n"," \njava\n"," \nworld\n"},
			{" \n1.75\n"," \n2\n"," \n3\n"," \nError\n"},
			{" \n3.25\n"," \n2.25\n"," \n2.2... and a very long number\n"," \nThe code will not compile\n"},
			{" \n2.5\n"," \n2.25\n"," \n2.2 ... -something and a very long number\n"," \nThe code will not compile\n"},
			{" \nError float f is not initialised\n"," \noutput: 5\n"," \noutput: 5.0\n"," \nError, this is not a valid way to initialise a float type variable\n"},
			{" \n4.0\n"," \n5\n"," \n5.0\n"," \nError, it will not compile\n"},
			{" \n128\n"," \n-128\n"," \n1\n"," \nError, number is out of range\n"},
			{" \n1\n"," \n2\n"," \n1.0\n"," \nError\n"},
			{"3. - and to 15 decimal places\n"," \n2\n"," \n3\n"," \nError\n"},
			{" 2 \n-2\n"," 1\n-2\n"," 2\n-1\n"," 1\n-1\n"},
			{" \n1\n"," \n3\n"," \n4\n"," \n6\n"},
			{"1,2,2,3,3,4\n","1,2,3,3,4,6\n","1,2,3,4\n"," \n0,1,1,2,2,3,3,4\n"} 
	};
	
	static int []n = {2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	static String []choice= {"23","2","3","1","1","4","4","3","4","3","4","1","3","3","4","4","2","4","3","2","2","3","3","2","1"};
	static int tally = choice.length;
	static String testtitle="Java Programming Quiz";
	static int timeLimit = 10;
	static int passMark = 9;
}