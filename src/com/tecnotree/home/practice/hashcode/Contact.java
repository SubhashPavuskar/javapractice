package com.tecnotree.home.practice.hashcode;

public class Contact
{

	private int contactId;
	private String contactName;
	private String contactType;
	
	public Contact(int contactId, String contactName, String contactType)
	{
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactType = contactType;
	}
	
	public int getContactId()
	{
		return contactId;
	}

	public void setContactId(int contactId)
	{
		this.contactId = contactId;
	}

	public String getContactName()
	{
		return contactName;
	}

	public void setContactName(String contactName)
	{
		this.contactName = contactName;
	}

	public String getContactType()
	{
		return contactType;
	}

	public void setContactType(String contactType)
	{
		this.contactType = contactType;
	}

	/*@Override
	public boolean equals(Object obj){
		return super.equals(obj);
	}*/
	public boolean equals(Object object)
	{
		Contact contact = (Contact) object;
		return (contact.contactId==this.contactId   && contact.contactType == this.contactType && contact.contactName == this.contactName );
	}
	
	/*@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return super.hashCode();
	}*/
	/*public int hashCode()
	{
		return contactId + contactType.hashCode() + contactName.hashCode();
				
	}*/
}
