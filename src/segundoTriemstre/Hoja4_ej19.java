package segundoTriemstre;

public class Hoja4_ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrizT=new int[3][3];
		//calculamos la transpuesta y lo almacenamos
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				matrizT[j][i]=matriz[i][j];
			}
		}
		System.out.println("Matriz:");
		//mostramos la matriz
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matriz traspuesta:");
		//mostramos su traspuesta
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matrizT[i][j]+" ");
			}
			System.out.println();
		}
	}

	}
