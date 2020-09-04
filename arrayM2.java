                                                                                                                                                                         
public class arrayM2 {                                                                                                                                                    
	                                                                                                                                                                     
    public static void main(String[] args) {                                                                                                                             
    	int[][] numeros = { {1, 2, 3},                                                                                                                                   
    						{4, 5, 7},                                                                                                                                   
    						{6, 8, 11}                                                                                                                                   
    						};                                                                                                                                           
    	for(int linha=0; linha < numeros.length; linha++) {                                                                                                              
    		for(int coluna=0; coluna < numeros[linha].length; coluna++) {                                                                                                
    			System.out.print(numeros[linha][coluna]+"\t");                                                                                                           
    		}                                                                                                                                                            
    		System.out.println("\n");                                                                                                                                    
    	}                                                                                                                                                                
    		String[][] nomes = new String[3][2];                                                                                                                         
    		nomes[0][0] = "Otavio";                                                                                                                                      
    		nomes[0][1] = "otavio@gmail.com";                                                                                                                            
    		nomes[1][0] = "Paula";                                                                                                                                       
    		nomes[1][1] = "paula@gmail.com";                                                                                                                             
    		nomes[2][0] = "Alberto";                                                                                                                                     
    		nomes[2][1] = "alberto@gmail.com";                                                                                                                           
    		for(int linha=0; linha < nomes.length; linha++) {                                                                                                            
    			for(int coluna=0; coluna < nomes[linha].length; coluna++) {                                                                                              
    				System.out.print(nomes[linha][coluna]+"\t");                                                                                                         
    			}                                                                                                                                                        
    		System.out.println();                                                                                                                                        
    		}                                                                                                                                                            
    	}                                                                                                                                                                
	}                                                                                                                                                                    