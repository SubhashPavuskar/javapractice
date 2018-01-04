package com.tecnotree.home.practice.anounymousclass;

import java.util.ArrayList;

public class MusicSystem
{
	Speaker speaker = new Speaker()
	{
		public void speakerPlaying()
		{
			System.out.println("Playing Speaker sound");
		}
		
		/*public void speakerAddtionSoundSet()
		{
			System.out.println("Playing speaker Addtion Sound Set");
		}*/
	};
	
	public void PlayingMusic()
	{
		speaker.speakerPlaying();
		//speaker.speakerAddtionSoundSet();
	}

	public static void main(String[] args)
	{
		MusicSystem musicSystem = new MusicSystem();
		musicSystem.PlayingMusic();
		//ArrayList<E>
		Radio radio = new Radio()
		{
			@Override
			public void playRadio()
			{
				System.out.println("Playing radio");
			}
		};
	}
}
