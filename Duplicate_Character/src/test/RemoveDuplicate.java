package test;

public class RemoveDuplicate {
	
	private char arr[];
	private int size;

	public RemoveDuplicate() {
		
	}

	public RemoveDuplicate(int size) {
		super();
		this.size = size;
		arr=new char[size];
	}
	
	public void removeDuplicateCharacter(String str)
	{
		for(int i=0;i<size;i++)
		{
			arr[i]=str.charAt(i);
			
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size-i-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The duplicate character= "+arr[i]);
				}
			}
		}
	}
	

}
