package com.example.fileactivity.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import android.content.Context;

public class FileService {
	private Context context;

	public FileService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileService(Context context) {
		super();
		this.context = context;
	}
	public void save(){
		OutputStream os ;
		
		try {
			//打开输出流
			  os = context.openFileOutput("a.txt", Context.MODE_PRIVATE);
			try {
				os.write("你好吗？你好吗？".getBytes());
				os.flush();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
