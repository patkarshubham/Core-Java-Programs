class ArrMulMatrics{
	public static void main(String args[]){		    
	int m1[][]={{2,4,6},{3,5,7},{4,8,12}};
	int m2[][]={{2,4,6},{3,5,7},{4,8,12}};

    int	mul[][]=new int[3][3];
	System.out.println("Multiplication of matrix");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		mul[i][j]=0;
		for(int k=0;k<3;k++)
	    {
	      mul[i][j]=mul[i][j]+m1[i][k]+m2[k][j];
	      
	    }
		System.out.print(mul[i][j]+" ");
	}
		System.out.println();	
    }

                                          }
                    }