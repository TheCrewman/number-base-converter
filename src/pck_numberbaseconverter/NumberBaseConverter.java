package pck_numberbaseconverter;

public class NumberBaseConverter
{
	public String bin;
	public String dec;
	public String oct;
	public String hex;
	
	public NumberBaseConverter()
	{
		this.bin = "";
		this.dec = "";
		this.oct = "";
		this.hex = "";
	}
	
	public String dec_to_bin(int dec)
	{	
		while (true)
		{
			if (dec % 2 == 0)
			{
				dec = dec / 2;
				this.bin += "0";
			}
			else if (dec % 2 == 1)
			{
				dec = dec / 2;
				this.bin += "1";
			}
			
			if (dec / 2 == 0)
			{
				this.bin += String.valueOf(dec % 2);
				
				break;
			}
		}
		
		this.bin = complete_bin(this.bin);
		this.bin = this.reflect_string(this.bin);
		
		return this.bin;
	}
	
	public String reflect_string(String str_to_reflect)
	{
		String reflected_string = "";
		
		for (int i = str_to_reflect.length() - 1; i >= 0; i--)
		{
			reflected_string += str_to_reflect.charAt(i);
		}
		
		return reflected_string;
	}
	
	public String complete_bin(String bin_to_complete)
	{
		String completed_bin = bin_to_complete;
		
		while (completed_bin.length() % 4 != 0)
		{
			completed_bin += "0";
		}
		
		return completed_bin;
	}
	
	public String dec_to_oct(int dec)
	{
		while (true)
		{
			if (dec % 8 == 0)
			{
				dec = dec / 8;
				this.oct += "0";
			}
			else if (dec % 8 == 1)
			{
				dec = dec / 8;
				this.oct += "1";
			}
			else if (dec % 8 == 2)
			{
				dec = dec / 8;
				this.oct += "2";
			}
			else if (dec % 8 == 3)
			{
				dec = dec / 8;
				this.oct += "3";
			}
			else if (dec % 8 == 4)
			{
				dec = dec / 8;
				this.oct += "4";
			}
			else if (dec % 8 == 5)
			{
				dec = dec / 8;
				this.oct += "5";
			}
			else if (dec % 8 == 6)
			{
				dec = dec / 8;
				this.oct += "6";
			}
			else if (dec % 8 == 7)
			{
				dec = dec / 8;
				this.oct += "7";
			}
			
			if (dec / 8 == 0)
			{
				if (dec % 8 != 0)
				{
					this.oct += String.valueOf(dec % 8);
				}
				
				break;
			}
		}
		
		this.oct = this.reflect_string(this.oct);
		
		return this.oct;
	}
	
	public String dec_to_hex(int dec)
	{
		while (true)
		{
			if (dec % 16 == 0)
			{
				dec = dec / 16;
				this.hex += "0";
			}
			else if (dec % 16 == 1)
			{
				dec = dec / 16;
				this.hex += "1";
			}
			else if (dec % 16 == 2)
			{
				dec = dec / 16;
				this.hex += "2";
			}
			else if (dec % 16 == 3)
			{
				dec = dec / 16;
				this.hex += "3";
			}
			else if (dec % 16 == 4)
			{
				dec = dec / 16;
				this.hex += "4";
			}
			else if (dec % 16 == 5)
			{
				dec = dec / 16;
				this.hex += "5";
			}
			else if (dec % 16 == 6)
			{
				dec = dec / 16;
				this.hex += "6";
			}
			else if (dec % 16 == 7)
			{
				dec = dec / 16;
				this.hex += "7";
			}
			else if (dec % 16 == 8)
			{
				dec = dec / 16;
				this.hex += "8";
			}
			else if (dec % 16 == 9)
			{
				dec = dec / 16;
				this.hex += "9";
			}
			else if (dec % 16 == 10)
			{
				dec = dec / 16;
				this.hex += "A";
			}
			else if (dec % 16 == 11)
			{
				dec = dec / 16;
				this.hex += "B";
			}
			else if (dec % 16 == 12)
			{
				dec = dec / 16;
				this.hex += "C";
			}
			else if (dec % 16 == 13)
			{
				dec = dec / 16;
				this.hex += "D";
			}
			else if (dec % 16 == 14)
			{
				dec = dec / 16;
				this.hex += "E";
			}
			else if (dec % 16 == 15)
			{
				dec = dec / 16;
				this.hex += "F";
			}
			
			if (dec / 16 == 0)
			{
				if (dec % 16 == 10)
				{
					this.hex += "A";
				}
				else if (dec % 16 == 11)
				{
					this.hex += "B";
				}
				else if (dec % 16 == 12)
				{
					this.hex += "C";
				}
				else if (dec % 16 == 13)
				{
					this.hex += "D";
				}
				else if (dec % 16 == 14)
				{
					this.hex += "E";
				}
				else if (dec % 16 == 15)
				{
					this.hex += "F";
				}
				else
				{
					if (dec % 16 != 0)
					{
						this.hex += String.valueOf(dec % 16);
					}
				}
				
				break;
			}
		}
		
		this.hex = this.reflect_string(this.hex);
				
		return this.hex;
	}
}
