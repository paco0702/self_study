package self_S;

public class text {
	public static void main(String []args) {
		String [] A = "A1/2.3".split("\\D");   // split if not an integer 
		for(int i=0; i<A.length; i++)
		System.out.println(A[i]+" ");
		System.out.println();
		
        String [] D = "A1/2.3".split("\\d");   //split if an integer
		for(int i=0; i<D.length; i++)
		System.out.println(D[i]+" ");
		System.out.println();
		
		String [] B = "ABC3".split("\\d"); // split when meet integer
		for(int i=0; i<B.length; i++)
		System.out.println(B[i]+" ");
		System.out.println();
		
		String [] C = "A1/2.3".split("\\d\\s*");
		for(int i=0; i<C.length; i++)
		System.out.println(C[i]+" ");
		System.out.println();
		
		String [] E = "A         1/2.3".split("\\s");     // split when there is a space
		for(int i=0; i<E.length; i++)
		System.out.println(E[i]+" ");
		System.out.println();
		
		
		String [] F = "A         1/2.3".split("\\s+");     // split when there is a space (the continuous space count as one) 
		for(int i=0; i<F.length; i++)
		System.out.println(F[i]+" ");
		System.out.println();
	}
}
 