import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class Test {
	
	public static String reverseReursion(String input) {
		
		if(input.isEmpty()) 
			return input;
		else 
			return reverseReursion(input.substring(1)) + input.charAt(0);
	}
	

	public static void reverse(String input) {
		
		char[] reverseS = input.toCharArray();
	
		System.out.print("Reverse of String::");
		for (int i = input.length()-1 ; i>=0; i--) {
			System.out.print(reverseS[i]);
		}
	}
	
	
	//removeAllWhiteSpaces
	
	public static String removeWhiteSpaces(String s) {

		String withoutspaces = "";
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) != ' ')
	            withoutspaces += s.charAt(i);
	    }
	    return withoutspaces;

	}
	
	//Sort a String
	
     public static String sortString(String sampleStr) {
    	 	String sortS = null;
    	 	Character temp;
    	 	for(int i =0;i<sampleStr.length();i++) {
    	 		if (i<sampleStr.length()-1 && (int)sampleStr.charAt(i)> (int)sampleStr.charAt(i+1)) {
    	 			temp=sampleStr.charAt(i);
    	 			Integer difference= (int)sampleStr.charAt(i)-(int)sampleStr.charAt(i+1);
    	 			
    	 		}
    	 	}
    	 	
    	 	return sortS;
     }
	
	
	//CompressString
	public static void compressString(String str) {
		char[] strChar = str.toCharArray();
		Arrays.sort(strChar);
		int count =0;
		char temp = strChar[0];
		for(int i=0;i<strChar.length;i++) {
			if(strChar[i]==temp) {
				count++;
			}else {
				 System.out.println(temp+":"+count);	
				 count = 1;
				 temp = strChar[i];
			}
			 
		}
		 System.out.println(temp+":"+count);	
		
	}
	
	//duplicateChar
		public static void duplicateChar(String str) {
			char[] strChar = str.toCharArray(); //deepaili
			Arrays.sort(strChar); //adeeilp
			for (int i=0;i<strChar.length;i++) {
				if(i<(strChar.length)-1 && (strChar[i]==strChar[i+1]))  {
					 System.out.println(strChar[i]+":"+2);	
				}
			}
			
		}
	
	//minDistance
	public static int minDistance(int n, int k, int[] testArray) {
		
		int distance = Integer.MAX_VALUE;
		int found=0;
		int i=0;
		if (n==k) {return 0;}
		for(i =0 ; i<testArray.length ;i++)	{
			if((testArray[i]==n || testArray[i]==k)) {
				found = i;
				break;
			}
		}
			
		for(;i<testArray.length;i++)	{	
			
			if((testArray[i]==n || testArray[i]==k)) {
				if(testArray[found]!=testArray[i] && (i-found)<distance) {
					distance = i-found; //3
					found = i;
				}else {
					 found =i; //5
				}
			}
		}	
		return distance;
	}

	
	//Palindrome
	
	public static boolean palindrome(String input) {
		
		if(input.isEmpty()) 
			return false;
		else {
			int beginIndex= 0, endIndex = input.length()-1;
			if(input.charAt(input.length()-1)!=(input.charAt(0))){
				return false;
			}
			else {
				if(beginIndex!=endIndex) {
					beginIndex++;
					endIndex--;
					palindrome(input.substring(beginIndex, endIndex));
				}
				return true;
			}
			
		}	
	}
	
	//Merge 2 sorted arrays
	public void merge(int[] nums1, int m, int[] nums2, int n) {
	    int[] a = new int[m + n];
	    int i = 0, j = 0, k = 0;

	    while(i < nums1.length && j < nums2.length) {
	        if(nums1[i] < nums2[j]) {
	            a[k] = nums1[i];
	            i++;
	            k++;  
	        }

	        else {
	            a[k] = nums2[j];
	            j++;
	            k++;
	        }
	    }
	}
	
	//Find GCD -- Greatest Common Divisor
	public int findGCD(int num1, int num2) {
		int result =0;
		
		if(num1>num2) {
			result = num1%num2;
		}else {
			result = num2%num1;
		}
		
		
		return result;
	}
	
	
	
	  public static int[] twoSum(int[] nums, int target) {
		  
		  Map<Integer, Integer> pairMap = new HashMap<Integer,Integer>();
		  boolean found= false;
		  int[] resultPair = new int[2]; 
		 for(int i=0;i<nums.length;i++) {
			  if(pairMap.containsKey(nums[i])) {
				  System.out.println("Contains Key::"+nums[i]);
				  resultPair[1]=i;
				  resultPair[0]=pairMap.get(nums[i]);
				  break;
			  }else {
				  String balance = String.valueOf(target-nums[i]);
				  System.out.println("Add Key & Value::"+balance+"::"+ nums[i]);
				  pairMap.put(target-nums[i],i);
			  }
		  }
		 return resultPair;
	        
	    }
	  
	  
	  public static boolean closeParanthesis(String str) {
		
		  Stack<Character> bracketStore = new Stack<Character>();
		  
		 char[] charArray = str.toCharArray(); 
		 for(int i=0;i<charArray.length;i++) {
			 if(charArray[i]=='[' || charArray[i]=='{' || charArray[i]=='(') {
				 bracketStore.push(charArray[i]);
			 }
			 switch(charArray[i]) {
				 case ']' :
					 if(!bracketStore.isEmpty() &&  !bracketStore.pop().equals('[')) {
						 System.out.println("Not Matched");
						 return false;
					 }
				 
				 case '}' :
					 if(!bracketStore.isEmpty() &&  !bracketStore.pop().equals('{')) {
						 System.out.println("Not Matched");
						 return false;
					 }
					 
				 case ')' :	
					 if(!bracketStore.isEmpty() &&  !bracketStore.pop().equals('(')) {
						 System.out.println("Not Matched");
						 return false;
					 }
				 	
			 }
		 }
		  return true;
	  }
	  
//	  //Count vowels even if duplicate
//	  public static boolean findVowels(String str) {
//
//		  Stack<Character> vowels = new Stack<Character>();
//		  HashSet<Character> vowelSte = new HashSet<Character>();
//		  char[] charVowels = new char[5];
//		  
//		  int count =0;
//		  
//		  int l= str.length();
//		  if(str.length()==0) {
//			  return false;
//		  }
//		  
//		  if(l==1) {
//			  if(isVowels(str.charAt(l-1)))
//			  return true;
//		  }
//		  
//		  
//		  
//		  int j=0;
//		  for(int i =0; i<str.length();i++) {
//			  if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
////				vowels.push(str.charAt(i));  
////				vowelSte.add(str.charAt(i));
//			  charVowels[j++]=str.charAt(i);
//			  count++;
//			  }
//		  }
//		  
//		  
//		  
//		  
//		  System.out.println("Count Vowels in a String::"+ count);
//		  return vowels.toString().toCharArray();
//	  }
////	
//	  private static boolean isVowels(char charAt) {
//		  if(charAt=='a'||charAt=='e'||charAt=='i'|| charAt=='o'||charAt)=='u'){
////				vowels.push(str.charAt(i));  
////				vowelSte.add(str.charAt(i));
//				return true;
//			}
//		return false;
//	}

	  //50
	  int f (int num) {
		  int out = 0; 
		  for (; num > 0; num /= 10) {   //num = 50/10=5
			  int d = num % 10; out *= 10; out += d; 
		  } return out;
		 } 
	  
	  
	  
	  
	  
	  
	  

	public static void main (String args[]) {
			
			String input = "ABCDDCBA";
//			
//			//reverse(input);
//			if(palindrome(input)) {
//				System.out.print("Yes Palindorme::"+ input);
//				System.out.println();
//			}else {
//				System.out.print("Not Palindorme::"+ input);
//				System.out.println();
//			}
			
//			int[] testArray = new int[] {3,2,4,5,2,1};
//			int sum = 9;
//			int result[] = twoSum(testArray,sum);
//			
//			System.out.println("Pair::{"+ result[0] +"," + result[1]+"}");
//			
			String expS = "{o[p}eraadio";
			//char exp[] = {'{','2','D','}','[',']'}; 
			//System.out.println(String.valueOf(closeParanthesis(expS)));
			
			//char exp[]= findVowels(expS);
			
		
//			System.out.println("Distance::"+ minDistance(1,3,testArray));
		//	compressString("zxcbhdzxatuzlkjkxa");
			//duplicateChar("deepaili");
			//System.out.println("String With no Spaces::"+removeWhiteSpaces("d dlke eljlj knkkjfe"));
//			//System.out.println("Sorted:"+ sortString("deepali"));
//			TestHashTable testHT = new TestHashTable();
//			//System.out.println("Here is the index of this::"+testHT.getIndex("Deepali"));
//			testHT.add("abddr", 20);
//			testHT.add("Anjika", 29);
//			testHT.add("BAjikz", 30);
//			System.out.println("Value for key::"+testHT.getVal("Anjika"));
			
//			Scanner sc = new Scanner(System.in);
//			String firstString = sc.nextLine();
//			
//			Scanner sc2 = new Scanner(System.in);
//			String secondString = sc2.nextLine();
//			System.out.println("String is Anagram::"+findAnagram(firstString,secondString));
			
//			
//			Thread t1 = new Thread(new Runnable() {
//			
//				public void run() {
//					Device obj = Device.getObject();
//				}
//				
//			});
//			Thread t2 = new Thread(new Runnable() {
//			
//				public void run() {
//					Device obj = Device.getObject();
//				}
//				
//			});
//			
//			t1.start();
//			t2.start();
//			List<Book> li = new ArrayList();
//			Book b1 = new Book("Anjika",10,100);
//			Book b2 = new Book("Parth",5,150);
//			li.add(b1);
//			li.add(b2);
//			Collections.sort(li);
//
//			for (Book b:li) {
//				System.out.println(b.toString());
//			}
//			
//			Comparator<Book> bookLogic = new BookLogic();
//			Collections.sort(li,bookLogic);
//			
//			System.out.println("After sorting on pages");
//			for (Book b:li) {
//				System.out.println(b.toString());
//			}
//			
		 	//int[] array = new int[] {3,1,13,15,2,5,3,13,2,1,4};
		 	
		 	int [] array = new int[] {5, 6, 8, 1, 3, 5, 4, 6, 9, 4, 2, 3, 4, 7, 9, 6};
    	 		sortArray(array);
    } 
    
   
    //Range of numbers cant be more than 150
    public static void sortArray(int[] array) {
    	
	    	int[] result = new int[array.length];
	    	int[] countArray = new int [array.length];
	    	
	    	for(int i=0;i<array.length;i++) {
	    		countArray[array[i]]++;
	    	}
	    	
	    	int k=0;
	    	for(int n =0;n<countArray.length;n++) {
	    		while(countArray[n]>0) {
	    			System.out.println("Index::"+n);
	    			System.out.println("Index value::"+countArray[n]);
	    			result[k]=n;
	    			countArray[n]--;
	    			k++;
	    		}
	    		
	    	}
	   
	   System.out.println("Result: Sorted Array {");
	   for(int h=0;h<result.length;h++) {
	    	   System.out.print(result[h]+",");
	   }
	   
	    	
	   // System.out.print("}");
  
    	
    }
	
	
//	public String fillWithNewCh(char[] input){
//		  
//		  String replace = "%150";
//		  char[] replaceChar = replace.toCharArray(); //4 characters
//		  int count;
//		  int sizeNewChar = replace.length(); //4
//		  int indexOfLast=-1;
//		 
//		  int i=0;
//		  while(input[i]!='\0'){
//		    if(input[i]==' '){
//		      count++;  //4
//		    }
//		    i++;
//		  }
//		  
//		  indexOfLast= i;
//		  
//		  for(int j=indexOfLast;j>=0;j--) {
//			  if(input[j]==' '){
//				  input[i]
//			  }
//		  }
//		  
//		  
//		  
//		  int newFiller= (sizeNewChar-1)*count; //12
//		  if(input.size()> input.indexOf['\0'] + newFiller) //21+12
//		  {
//		    int k;
//		    for(int j=input.indexOf['\0'];j<input.indexOf['\0'];j--){
//		       k = j+newFiller; //
//		       arr[k]=arr[j];	
//		       if(input[j]==""){
//		         input[j]= "%";
//		         input[j+1]= "1";
//		         input[j+2]= "5";
//		         input[j+3]= "0";
//		         j = j +sizeNewChar;
//		       } 
//		    }
//		  }else{
//					 throw new Exception("Array size is not sufficient");  
//		  }
//	} 
	
	
	public static boolean findAnagram(String A1, String A2){
		
		char[] striA = A1.toLowerCase().toCharArray();
		char[] striA2 = A2.toLowerCase().toCharArray();
		int [] vectorA = new int[256];
		
		System.out.println("Length of First String::" + A1.length());
		
		for(int i=0;i<striA.length;i++) {
			int charAscii = (int)striA[i];
			System.out.println("Print charAscii::"+charAscii);
			vectorA[charAscii]++;
			System.out.println("Print Vector::"+vectorA[charAscii]);
		}
		
		for(int i=0;i<striA2.length;i++) {
			int charAscii = (int)striA2[i];
			if(vectorA[charAscii]>0) {
				vectorA[charAscii]--;
			}else {
				return false;
			}
		}
		
		return true;
	}
	

}
