package animal;

public class Account {
	/*
	 * The source menu in STS/Eclipse can be used
	 * to automatically create certain code snippets
	 * using conventions! - Conventions lead to automation
	 * automation leads to happy developers!
	 */
	long id;
	String accountHolder_Name;
	String accountHolder_Email;
	
	public Account(long id, String accountHolder_Name, String accountHolder_Email) {
		this.id = id;
		this.accountHolder_Name = accountHolder_Name;
		this.accountHolder_Email = accountHolder_Email;
	}
}
