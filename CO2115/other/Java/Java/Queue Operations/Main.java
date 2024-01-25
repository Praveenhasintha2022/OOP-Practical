public class Main
{
	public static void main(String[] args)
	{
		Queue q = new Queue();

		q.deQueue();

		// insert numbers from 1 to 5
		for(int i = 1; i < 6; i ++)
		{
			q.enQueue(i);
		}

		q.enQueue(6);
		q.display();
		
		q.deQueue();
		q.display();
	}
}