public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[] {1,3,5,8,12};
		
		int n= BinarySearch(myArray, 3);
		System.out.println(n);

	}
	

	public static int BinarySearch(int[] myArray, int searchKey) {
		
		int index;
		int left= 0;
		int right= myArray.length-1;
		
		int mid;
		
		while(left <= right) {
			
			mid= (left+right)/2;
			
			if(myArray[mid]==searchKey) {
				
					//index= mid;	
				//System.out.println("item found at: "+ mid);
				return mid;
			}
			else if(myArray[mid] < searchKey){
				left=mid+1;
				
				
			}
			else {
				right=mid-1;
			}
			
			
		}
		
		return -1;
		
	}
}
