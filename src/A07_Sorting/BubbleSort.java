package A07_Sorting;


public class BubbleSort implements PersonenSort {

	/**
	 * Sortier-Funktion
	 */
	public void sort(Person[] personen) {
		for(int i = 0; i < personen.length; i++)
		{
			boolean anyChange = false;
			for(int j = 0; j < personen.length - 1 - i; j++)
			{
				if (personen[j].compareTo(personen[j + 1]) > 0)
				{
					Person p = personen[j];
					personen[j] = personen[j + 1];
					personen[j + 1]  = p;
					anyChange = true;
				}
			}
			if(!anyChange)
				break;
		}
	}
	
}
