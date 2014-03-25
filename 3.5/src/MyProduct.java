import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

public class MyProduct {
	byte[] name = new byte[60];
	byte[] price = new byte[8];
	byte[] quantity = new byte[4];
	
	MyProduct(String n, double p, int q){
		name = n.getBytes();
		ByteBuffer.wrap(price).putDouble(p);
		quantity = ByteBuffer.allocate(4).putInt(q).array();
	}
	
	MyProduct(){
		name = "".getBytes();
		ByteBuffer.wrap(price).putDouble(0);
		quantity = ByteBuffer.allocate(4).putInt(0).array();
	}
	
	public void changePrice(double newPrice){
		ByteBuffer.wrap(price).putDouble(newPrice); 
	}
	
	public String getName(){
		return new String(name); 
	}
	
	public double getPrice(){
		return ByteBuffer.wrap(price).getDouble(); 
	}
	
	public int getQuantity(){
		return ByteBuffer.wrap(quantity).getInt(); 
	}
}
