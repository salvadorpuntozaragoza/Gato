import javax.swing.JButton;
import javax.swing.JTextField;


public class Utility {
	
	public static void comprobar(int[][] matriz, JTextField txt, String turno){
		
		if(matriz[0][0] == 0 && matriz[0][1] == 0 && matriz[0][2] == 0){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[1][0] == 0 && matriz[1][1] == 0 && matriz[1][2] == 0){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[2][0] == 0 && matriz[2][1] == 0 && matriz[2][2] == 0){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][0] == 0 && matriz[1][0] == 0 && matriz[2][0] == 0){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][1] == 0 && matriz[1][1] == 0 && matriz[2][1] == 0){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][2] == 0 && matriz[1][2] == 0 && matriz[2][2] == 0){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][0] == 0 && matriz[1][1] == 0 && matriz[2][2] == 0){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][2] == 0 && matriz[1][1] == 0 && matriz[2][0] == 0){
			txt.setText("GANA: " + turno);
		}
		
		
		
		if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[2][0] == 1 && matriz[2][1] == 1 && matriz[2][2] == 1){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][0] == 1 && matriz[1][1] == 1 && matriz[2][2] == 1){
			txt.setText("GANA: " + turno);
		}
		
		if(matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][0] == 1){
			txt.setText("GANA: " + turno);
		}
		
	}
	
	public static void reiniciar(JButton btn){
		btn.setIcon(null);
	}
	
	public static void llenarMatriz(int [][]matriz){
		for(int i = 0 ; i < matriz.length ; i++){
			for(int j = 0 ; j < matriz[i].length ; j++){
				matriz[i][j] = 8;
			}
			
		}
	}

}
