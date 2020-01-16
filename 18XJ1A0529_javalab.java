//subject for revision
class Sum {
  public static void main(String[] args) /* "String" here is a class ('S'tring)*/
  {
    int a = 1,b = 2;
    int c = a + b;
    System.out.println("a ="+ a + ", " + "b=" + b);
    System.out.println("the sum is " + c);
  }
}
/**/
class HelloWorhld {
  public static void main(String[] args) /* "String" here is a class ('S'tring)*/
  {
	System.out.println("H̸̨̢͙̖͎͕͕͕̣̯͉̗͓̞̰̿͒͊́͘ ȩ̶̛͍̱̜͕̮̘̮̩̾̆͊̓͋͑̈́̌͆̄̔̎ l̴̛̜̩̰̩͚̔̿͂̾̎́̃͊̑͗͠ l̴̡̞̳̠̬̩̱̤̓̇̈́̐̚ ö̷̬̤̫͎̹͓͓̩͓̣͚͛͂ͅ  ̵̛͕̼͇͙͇̿̇̓̍̏̿͋̓̔͒̔̇͘͝w̴̙̟̘͕͙̩͕̦͚̠͓̱̘͍̝̎̇̈́̌̉̊̇̅̓̈́͗̌̀̐͋ o̸̧̯͇̼̝͙̦̖̹̦̦̔̒̏̄̂̓͂̔͌̆̽̊̿͜͝ͅ r̶̙̤̝͙̭̺̤̱̱̝̱͛͐̂̇͋̉̀̒̾́̌͠͝ͅ l̸̨̞̣̫̻̙̰̈̃̆̈́̈̈́̈́̈́͛͛͑̓̎͝ d̶̛͓͋̑̇ ");
  }
}
/**/
class Loop {
  public static void main(String[] args) /* "String" here is a class ('S'tring)*/
  {
	for(int i = 0;i<10;i++)
	{
		System.out.println("_̵̛̥͕̲̤̝̠̌̈́̍͗̐̓̃̓̅̀͜-̵̨͎̌̏̈̽̾͊̃̈́̈͗̈́̋̊̒͘"+(i+1)+"-̵̢̛͍͕̟̜̟̭̪̦̣̫͐͌̅̈̓̀͆͐̕̕͠͠_̵̯̮̤̭͒̄̍̎̈́̉̌́̊̆͝͝");
	}
		
  }
}
/**/
class Artithmann {
  public static void main(String[] args) /* "String" here is a class ('S'tring)*/
  {
	int a = 12, b = 26;
	System.out.println("a ="+ a + ", " + "b=" + b);
	System.out.println("Division: " + b + "÷" + a+"=" + b/a);
	System.out.println("Multiplication: " + a + "x" + b+"=" + b*a);
	System.out.println("Addition: "+ b +"+"+ a+"=" + (b+a));
	System.out.println("Subtraction: "+b+"-"+a+"=" + (b-a));
	System.out.println("Modulus: " + b%a);		
  }
}
/**/
class Factorial {
  public static void main(String[] args) /* "String" here is a class ('S'tring)*/
  {
	int a = 1;
	for(int i = 1;i<10;i++)
	{
		a = a*i;
		System.out.println("_̵̛̥͕̲̤̝̠̌̈́̍͗̐̓̃̓̅̀͜-̵̨͎̌̏̈̽̾͊̃̈́̈͗̈́̋̊̒͘"+a+"-̵̢̛͍͕̟̜̟̭̪̦̣̫͐͌̅̈̓̀͆͐̕̕͠͠_̵̯̮̤̭͒̄̍̎̈́̉̌́̊̆͝͝");
	}
	System.out.println("The " + 10+"!" + "is :" + a); 
		
  }
}
/**/
class EorO {
  public static void main(String[] args) /* "String" here is a class ('S'tring)*/
  {
	int a = 23, b = 12;
	System.out.println("a ="+ a + ", " + "b=" + b);	
	if (a%2 == 0)
	{
		System.out.println(a+" is even.");		
	}
	else
	{
		System.out.println(a+" is odd.");
	}
	if (b%2 == 0)
	{
		System.out.println(b+" is even.");		
	}
	else
	{
		System.out.println(b+" is odd.");
	}
  }
}
/**/
class Armstrong {
  public static void main(String[] args) /* "String" here is a class ('S'tring)*/
  {	
	int a = 153;
	int num = a, rem, sum = 0;
	while(num>0)
	{
		rem = num%10;
		num = num/10;
		sum = sum + rem*rem*rem;
	}
	if(sum == a)
	{
		System.out.println(a +"is a Armstrong number");
	}
	else
	{
		System.out.println(a +"is not a Armstrong number");
	}
  }

