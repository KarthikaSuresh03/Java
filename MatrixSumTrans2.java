import java.util.Scanner;

class MatrixSumTrans2 {

	public static void main(String[] args) {

		int r1, c1, r2, c2, mat1[][], mat2[][], i, j, sum[][], trans[][];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns of the first matrix");
		r1 = scan.nextInt();
		c1 = scan.nextInt();

		System.out.println("Enter the number of rows and columns of the second matrix");
		r2 = scan.nextInt();
		c2 = scan.nextInt();
		
		if(r1<=0||r2<=0||c1<=0||c2<=0) {
			System.out.println("ERROR: INVALID ORDER OF MATRIX!");
			System.exit(0);
		}
			
		if(r1!=r2 || c1!=c2)
			System.out.println("MATRIX ADDITION IS NOT POSSIBLE!\n(No. of rows and columns are not equal)");

		else {
			
			mat1 = new int[r1][c1];
			mat2 = new int[r2][c2];

			System.out.println("Enter Matrix 1:");
		
			for(i=0;i<r1;i++) {

				for(j=0;j<c1;j++) {

					mat1[i][j] = scan.nextInt();
				}
			}

			System.out.println("Enter Matrix 2:");
		
			for(i=0;i<r1;i++) {

				for(j=0;j<c1;j++) {

					mat2[i][j] = scan.nextInt();
				}
			}
			sum = new int[r1][c1];
			trans = new int[c1][r1];

			System.out.println();
			System.out.println("Sum of the Matrices:\n");

			for(i=0;i<r1;i++) {

				for(j=0;j<c1;j++) {

					System.out.print(mat1[i][j]+"\t");

					if(j==c1-1) {
				
						for(j=0;j<c1;j++) {

							if(j==0) {
								if(i==r1/2)
									System.out.print("+");
								else
									System.out.print(" ");
								System.out.print("\t");
							}
							System.out.print(mat2[i][j]+"\t");
						}
					}
				}
				System.out.println();
			}

			System.out.println("\n=\n");
			for(i=0;i<r1;i++) {
				
				for(j=0;j<c1;j++) {

					sum[i][j] = mat1[i][j] + mat2[i][j];
					trans[j][i] = sum[i][j];
					System.out.print(sum[i][j]+"\t");
				}
				System.out.println();
			}

			System.out.println("\n-----------------------------------");
			System.out.println("Transpose of the Resultant Matrix:\n");
			for(i=0;i<c1;i++) {

				for(j=0;j<r1;j++) {

					System.out.print(trans[i][j]+"\t");
				}
				System.out.println();
			}
		}
	}

}
