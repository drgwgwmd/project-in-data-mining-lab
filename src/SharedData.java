import java.util.ArrayList;

/** Description of SharedData
 * @author Omer Sommerstein
 * @author Shahar Dalal
 * @version 1.0 Build 9000 Nov 2, 2022.
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** Description of SharedData
	 * @param array
	 * @param b
	 * A builder
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
	
	/**
	 * @return true or false
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 * Setting the winning array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return an array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * Setting flag (true or false)
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}