/*
 * A Class to produce an "column x row" table of multiplication values. 
 */
public class MultiplicationTable {
	
	private int row;
	private int column;

	public MultiplicationTable(){
		System.out.println("You must specify the values to multiply");
	}
	
	public MultiplicationTable(int column, int row) {
		this.row = row;
		this.column = column;
	}
	
	/*
	 * Populate a header row of multiplicans, with 4 character "cell" size. 
	 */
	public void buildTopRow() {
		System.out.print("    |");
		
		for(int i = 1; i <= column; i++) {
			System.out.printf("%4d|", i);
		}
		System.out.println();
		
		/*
		 * Underline the above header row using dashes.
		 */
		for(int i = 0; i <= column; i++) {
			System.out.print("-----");
		}
		System.out.println();
	}
	
	/*
	 * Places the row number on the far left, and populates cells based on the 
	 * row and column multiplication. Formatted for 4 character space. 
	 */
	public void buildTable() {
		// Loop for rows
		for(int i = 1; i <= row; i++) {
			System.out.printf("%-4d|", i);

			// Loop for column (cell)
			for(int j = 1; j <= column; j++) {
				System.out.printf("%4d|", (i * j));
			}
			System.out.println();
			
		}
	}
	
	/*
	 * Prints a table based on the buildTopRow and buildTable methods. 
	 */
	public void printTable() {
		buildTopRow();
		buildTable();
	}

}
