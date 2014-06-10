package com.talsoft.organizeme.models;

import android.graphics.Bitmap;

public class Note 
{
	
	private String title;
	private String tagName;
	private Bitmap photo;

	
	public String getTitle() 
	{
		return title;
	}

	
	public void setTitle(String title) 
	{
		this.title = title;
	}


	public String getTagName() 
	{
		return tagName;
	}


	public void setTagName(String tagName) 
	{
		this.tagName = tagName;
	}


	public Bitmap getPhoto() 
	{
		return photo;
	}


	public void setPhoto(Bitmap photo) 
	{
		this.photo = photo;
	}
	
	
	
}
