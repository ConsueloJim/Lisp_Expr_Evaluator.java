/************************************************************************************
 *
 * LispExprException class
 *
 * It is used by SimpleLispExpressionEvaluator 
 *
 *************************************************************************************/

package PJ2;

public class LispExprException extends RuntimeException
{
    public LispExprException()
    {
	this("");
    }

    public LispExprException(String errorMsg) 
    {
	super(errorMsg);
    }

}
