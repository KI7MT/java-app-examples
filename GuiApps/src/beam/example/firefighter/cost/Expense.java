package beam.example.firefighter.cost;

/**
 * Expense.java<br>
 * Interface for calculating costs for an Object<br>
 * Repository git@github.com:KI7MT/java-app-examples.git
 *
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */

public interface Expense
{
	// calculates the cost of something or someone
	default double calculateExpense() {
		return 0;
	}

} /* END - Expense Interface */