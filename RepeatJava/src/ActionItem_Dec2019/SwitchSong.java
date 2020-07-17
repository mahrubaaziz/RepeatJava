package ActionItem_Dec2019;
//7. Using Switch Method Create a program where you have an artist(ex. Adele/Fall Out Boys/Bridge to Grace)
//and List of songs/track. it should contain 17 songs/tracks.
//You should modify the script in order to achieve the following in each run
 //-Print all the songs/tracks.
 //-Print Only songs/track 15  
 //-Print Only songs/track 19

public class SwitchSong {

	public static void main(String[] args) {
		int song =19;
		
		String songString;
		switch(song){
		
		case 1: 
			songString ="Taylor Swift";
			System.out.println("Taylor/Ready for it");//without break statement it will print all songs list
			break;
		case 2:
			System.out.println("Taylor/Don't blame me");
			break;
		case 3:
			System.out.println("Taylor/I did something bad");
			break;
		case 4:
			System.out.println("Taylor/Sad beautiful tragic");
			break;
		case 5:
			System.out.println("Taylor/King of my heart");
			break;
		case 6:
			System.out.println("Talor/Gateaway car");
			break;
		case 7:
			System.out.println("Taylor/Call it without you want");
			break;
		case 8:
			System.out.println("Taylor/Dancing with our hands");
			break;
		case 9:
			System.out.println("Taylor/All too well");
			break;
		case 10:
			System.out.println("Taylor/This is why we can't");
			break;
		case 11:
			System.out.println("Taylor/State of grace");
			break;
		case 12:
			System.out.println("Taylor/ We are never ever");
			break;
		case 14:
			System.out.println("Taylor/Stay stay stay");
			break;
		case 15:
			System.out.println("Taylor/Starlight");
			break;
		case 16:
			System.out.println("Taylor/Begin again");
			break;
		case 17:
			System.out.println("Taylor/The lucky one");
			break;
		default :
			System.out.println("The song is not in the list");
		
		}
		
	}

}
