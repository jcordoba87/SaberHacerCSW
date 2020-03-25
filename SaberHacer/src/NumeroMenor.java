
public class NumeroMenor {
		
	private int total;
	
	public void Menor(){		
		total = 0;		
	}		
	
	public int numerosMenores(int n1, int n2, int n3) {
		if (n1 < n2) {
            if (n1 < n3) {                
                return n1;
			} else {
				return n3;
			}
        } else if (n2 < n3) {           
            return n2;
        } else {            
            return n3;
        }
	 
}
	
	public void cls(){		
		total = 0;		
	}
	

				
		 
}


		

	


