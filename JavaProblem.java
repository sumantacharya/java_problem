public class JavaProblem{

	public static void main(String[] args) {

		int[]numbers={1,2,8,7,2,9};
		int n=numbers.length;
		int num=2;


		boolean returnedValue=dublicateValue(numbers,n);
		System.out.println("Is there any dublicate value\n");
		System.out.println(returnedValue);


		int[] result = removeValue(numbers,n,num);
		System.out.println("\nAfter Remove the value:");
		for(int i=0;i<result.length;i++){

			System.out.println(result[i]);
		}
	}


	public static boolean dublicateValue(int[] numbers,int n){
		
		for(int i=0;i<n;i++){

			for(int j=1;j<n;j++){

				if(numbers[i]==numbers[j]){

					return true;
				}
			}
		}
		return false;		
	}


	public static int[] removeValue(int[] numbers,int n,int num){

		int count=0;
		for(int i=0;i<n;i++){

			if(numbers[i]==num ){

				count++;
			}
		}

		int[] newArray=new int[n-count];
		int j=0;
		for(int i=0;i<n;i++){

			if(numbers[i]!=num){
				
				newArray[j]=numbers[i];
				if(j<newArray.length){

					j++;
				}   
			}
		}
		return newArray;
	}	
}