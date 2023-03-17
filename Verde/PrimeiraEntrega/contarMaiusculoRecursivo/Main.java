
public class Main {
	
	
	public static int recursiveCount(String str, int index, int count){
        //if de caso base da recursividade
		if(str.length() - 1 == index) {
            if ((str.charAt(str.length() -1 ) >='A') && (str.charAt(str.length() -1) <= 'Z')) {
                return count + 1;
            }
            return count;
        }
		//if para realizar a contagem
        if ((str.charAt(index) >='A') && (str.charAt(index) <= 'Z')) {
            count ++;            
        }
        
        //variavel responsavel por fazer caminhar sobre a string
        index = index + 1;
        //recursividade 
        return recursiveCount(str, index, count);
    }	
	

	public static void main(String[] args) {		
		
		String str;
		int index;
		int count;
		
		str = MyIO.readLine();		
		
		while(!str.equals("FIM")) {
			index = 0;
			count = 0;
			System.out.println(recursiveCount(str, index, count));
			str = MyIO.readLine();
		}
	}

}
