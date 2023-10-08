
public class Q21TicTacToe {

	static int[][] win = {{0,1,2},
						{3,4,5},
						{6,7,8},
						{0,3,6},
						{1,4,7},
						{2,5,8},
						{2,4,6},
						{0,4,8}};
	static boolean isWin(char[] board, char c)
	{
		for (int i = 0; i < 8; i++) 
		{
			if(board[win[i][0]]==c && board[win[i][1]]==c && board[win[i][2]]==c)
			{
				return true;
			}
		}
		return false;
	}
	
	static boolean isValid(char[] board)
	{
		int xCount=0, oCount=0;
		for (int i = 0; i < 9; i++) 
		{
			if(board[i]=='X')
			{
				xCount++;
			}
			if(board[i]=='O')
			{
				oCount++;
			}
		}
		if(xCount == oCount || xCount == oCount+1)
		{
			if(isWin(board, 'O'))
			{
				if(isWin(board, 'X'))
					return false;
				return (xCount == oCount);
			}
			if(isWin(board, 'X') && xCount != oCount + 1)
			{
				return false;
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		char board[] =  {'O', 'X', 'X',
						 'O', 'X', 'X',
						 'O', 'O', 'X'};
		if(isValid(board))
		{
			System.out.println("VALID");
		}
		else
		{
			System.out.println("INVALID");
		}
	
	}

}
