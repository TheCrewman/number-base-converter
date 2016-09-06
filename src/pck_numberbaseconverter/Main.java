package pck_numberbaseconverter;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		try
		{	
			NumberBaseConverter number_base_converter = new NumberBaseConverter();
			Scanner get_dec = new Scanner(System.in);
			
			System.out.print("Base 10: ");
			int dec = get_dec.nextInt();
			get_dec.close();
			System.out.println();
			
			String dec_to_bin = number_base_converter.dec_to_bin(dec);
			String dec_to_oct = number_base_converter.dec_to_oct(dec);
			String dec_to_hex = number_base_converter.dec_to_hex(dec);
			
			System.out.println("Base 2:  " + dec_to_bin);
			System.out.println("Base 8:  " + dec_to_oct);
			System.out.println("Base 16: " + dec_to_hex);
		}
		catch (Exception ex)
		{
			System.out.println("Error!");
		}
	}
}
