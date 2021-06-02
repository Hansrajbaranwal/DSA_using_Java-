package DataStructure;

class ArrayTest{
	public static void delete(char[] ar,int pos) {
		//Traversing the array from the position where the element has to be deleted to the end
		for(int i=pos-1;i<ar.length-1;i++) {
			//Moving each element one position to the left
			ar[i]=ar[i+1];
		}
		//The space that is left at the end is filled with character'0'
		ar[ar.length-1]='0';
	}
}
public class Tester2 {
	public static void main(String[] args) {

	}

}
