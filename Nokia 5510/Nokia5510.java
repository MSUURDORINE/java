import java.util.Scanner;
public class Nokia5510{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String mainMenu  = """
List of menu Functions
1. Phone book
2. Message
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Music
9. Games
10. Calculator
11. Reminders
12. Clock
13. Profiles
14. Services
15. SIM services
""";

		System.out.println(mainMenu);
		int mainMenuChoice = input.nextInt();

		switch(mainMenuChoice){
			case 1: System.out.println("Phone book");
				String phoneBookMenu = """
1. Search
2. Service Nos.
3. Add name 
4. Erase 
5. Edit 
6. Copy
7. Assign tone 
8. Send b'card
9. Options
10. Speed dials
11. Voice tags
""";
				System.out.println(phoneBookMenu);
				int phoneBookMenuChoice = input.nextInt();

				switch(phoneBookMenuChoice){
					case 1: System.out.println("Search"); break;
					case 2: System.out.println("Service Nos."); break;
					case 3: System.out.println("Add name"); break;
					case 4: System.out.println("Erase"); break;
					case 5: System.out.println("Edit"); break;
					case 6: System.out.println("Copy"); break;
					case 7: System.out.println("Assign tone"); break;
					case 8: System.out.println("Send b'card"); break;
					case 9: System.out.println("Options");
						String optionMenu = """
	1. Memory in use 
	2. Type of view
	3. Memory status
	""";                	
						System.out.println(optionMenu);
						int optionMenuChoice = input.nextInt();

						switch(optionMenuChoice){
							case 1: System.out.println("Memory in use"); break;
							case 2: System.out.println("Type of view"); break;
							case 3: System.out.println("Memory status"); break;
							default: System.out.println("Invalid input"); break;

						}

						break;
					case 10: System.out.println("Speed dials"); break;
					case 11: System.out.println("Voice tags"); break;
					default: System.out.println("Invalid input"); break;

				}

				break;
			case 2: System.out.println("Message"); 
				String messageMenu = """
1. Write messages
2. Inbox 
3. Outbox 
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number 
10. Service command editor
""";
				System.out.println(messageMenu);
				int messageMenuChoice = input.nextInt();

				switch(messageMenuChoice){
					case 1: System.out.println("Write messages"); break;
					case 2: System.out.println("Inbox"); break;
					case 3: System.out.println("Outbox"); break;
					case 4: System.out.println("Picture messages"); break;
					case 5: System.out.println("Templates"); break;
					case 6: System.out.println("Smileys"); break;
					case 7: System.out.println("messages settings"); 
						String messageSettingsMenu = """
1. Set1 
2. Common
""";
						System.out.println(messageSettingsMenu);
						int messageSettingsMenuChoice = input.nextInt();

						switch(messageSettingsMenuChoice){
							case 1: System.out.println("Set1"); 
								String set1Menu = """
1. Message centre number
2. Message sent as 
3. Message validityMessage sent as 
3. Message validity
""";
								System.out.println(set1Menu);
								int set1MenuChoice = input.nextInt();

								switch(set1MenuChoice){
									case 1: System.out.println("Message centre number"); break;
									case 2: System.out.println("Message sent as" ); break;
									case 3: System.out.println("Message validity"); break;
									default: System.out.println("Invalid input"); break;

								}
									
								break;
							case 2: System.out.println("Common"); 
								String commonMenu = """
1. Delivery reports
2. Repiy via same centre
3. Character support 
""";
								System.out.println(commonMenu);
								int commonMenuChoice = input.nextInt();

								switch(commonMenuChoice){
									case 1: System.out.println("Delivery reports"); break;
									case 2: System.out.println("Repiy via same centre"); break;
									case 3: System.out.println(" Character support"); break;
									default: System.out.println("Invalid input"); break;
								}

								break;
							default: System.out.println("Invalid input"); break;

						} 
			

						break;
					case 8: System.out.println("Info service"); break;
					case 9: System.out.println("Voice mailbox number"); break;
					case 10: System.out.println("Service command"); break;
					default: System.out.println("Invalid input"); break;
				}
				break;	
			case 3: System.out.println("Chat"); break;
			case 4: System.out.println("Call register");
				String callRegister = """
1.Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
6. Show call cost 
7. Call cost settings
8. Prepaid credit
""";
				System.out.println(callRegister);
				int callRegisterMenuChoice = input.nextInt();


				switch(callRegisterMenuChoice){
					case 1: System.out.println("Missed calls"); break;
					case 2: System.out.println("Received calls"); break;
					case 3: System.out.println("Dialled numbers"); break;
					case 4: System.out.println("Erase recent call lists"); break;
					case 5: System.out.println("Show call duration"); 
						String showCallDurationMenu = """
1. Last call duration
2. All calls duration
3. Received calls duration
4. Dialled calls duration
5. Clear timers
""";
						System.out.println(showCallDurationMenu);
						int showCallDurationMenuChoice = input.nextInt();

						switch(showCallDurationMenuChoice){
							case 1: System.out.println("Last call duration"); break;
							case 2: System.out.println("All calls duration"); break;
							case 3: System.out.println("Received calls duration"); break;
							case 4: System.out.println("Dialled calls duration"); break;
							case 5: System.out.println("Clear timers"); break;	
							default: System.out.println("Invalid input"); break;
						}	
						break;
					case 6: System.out.println(" Show call cost "); 
						String showCallCost = """
1. Last call cost
2. All calls cost
3. Clear counters
""";
						System.out.println(showCallCost);
						int showCallCostMenuChoice = input.nextInt();

						switch(showCallCostMenuChoice){
							case 1: System.out.println("Last call cost"); break;
							case 2: System.out.println(" All calls cost"); break;
							case 3: System.out.println("Clear counters"); break;	
							default: System.out.println("Invalid input"); break;

						}
						break;
					case 7: System.out.println("Call cost settings"); 
						String callCostSetting = """
1. Call cost limit
2. Show cost in                         
""";

						System.out.println(callCostSetting);
						int callCostSettingMenuChoice = input.nextInt();

						switch (callCostSettingMenuChoice){
							case 1: System.out.println(" Call calls cost"); break;
							case 2: System.out.println(" Show cost in "); break;	
							default: System.out.println("Invalid input"); break;
						}	
						break;
					case 8: System.out.println(" Prepaid credit"); break;
					default: System.out.println("Invalid input"); break;
					}
			 	break;
			case 5: System.out.println("Tones");
				String tonesMenu = """
1. Ringing tone 
2. Ringing Volume
3. Incoming Call alert 
4. Message alert tone
5. Keypad tones
6. Warning tones 
7. Vibrating alert
8. Screen Saver  
""";
				System.out.println(tonesMenu);
				int tonesMenuChoice = input.nextInt();

				switch(tonesMenuChoice){
					case 1: System.out.println(" Ringing tone"); break;
					case 2: System.out.println("Ringing Volume"); break;
					case 3: System.out.println("Incoming Call alert"); break;
					case 4: System.out.println("Message alert tone"); break;
					case 5: System.out.println("Keypad tones"); break;
					case 6: System.out.println(" Warning tones"); break;
					case 7: System.out.println("Vibrating alert");break;
					case 8: System.out.println("Screen Saver");break;	
					default: System.out.println("Invalid input"); break;
				}
		 		break;
			case 6: System.out.println("Settings");
				String settingsMenu = """
1. Call settings
2. Phone Settings
3. Security Settings
4. Restore factory settings
""";
				System.out.println(settingsMenu);
				int settingMenuChoice = input.nextInt();

				switch(settingMenuChoice){
					case 1: System.out.println("Call settings");
						String callSetting = """

1. Automatic redial
2. Speed dialling
3. Call wating options
4. Own number sending
5. Phone line in use 
6. Automatic answer
"""; 
						System.out.println(callSetting);
						int callSettingMenuChoice = input.nextInt();

						switch(callSettingMenuChoice){
							case 1: System.out.println("Automatic redial"); break;
							case 2: System.out.println("Speed dialling"); break;
							case 3: System.out.println("Call wating options"); break;
							case 4: System.out.println("Own number sending"); break;
							case 5: System.out.println("Phone line in use"); break;
							case 6: System.out.println("Automatic answer"); break;
							default: System.out.println("Invalid input"); break;

						}       
						break;
					case 2: System.out.println("Phone Settings");
						String phoneSettingMenu = """
1. Language
2. Call info display
3. Welcome note 
4. Network selection  
5. Comfirm SIM service
""";
						System.out.println(phoneSettingMenu); 
						int phoneSettingMenuChoice = input.nextInt();

						switch(phoneSettingMenuChoice){
							case 1: System.out.println("Language"); break;
							case 2: System.out.println(" Call info display"); break;
							case 3: System.out.println(" Welcome note"); break;
							case 4: System.out.println("Network selection"); break;
							case 5: System.out.println("Comfirm SIM service"); break;
							default: System.out.println("Invalid input"); break;
						}
					 break;
					case 3: System.out.println("Security Settings"); 
						String securitySettingMenu = """
1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Security level
6. Change access code
""";
						System.out.println(securitySettingMenu);
						int securitySettingMenuChoice = input.nextInt();

						switch(securitySettingMenuChoice){
							case 1: System.out.println("PIN code request"); break;
							case 2: System.out.println("Call barring service"); break;
							case 3: System.out.println("Fixed dialling"); break;
							case 4: System.out.println("Closed user group"); break;
							case 5: System.out.println("Settings level"); break;
							case 6:	System.out.println("Change access code"); break;
							default: System.out.println("Invalid input"); break;
						}
						break;
					case 4: System.out.println("Restore factory settings"); break;
					default: System.out.println("Invalid input"); break;
				}
				break;
			case 7: System.out.println("Call divert");break;
			case 8: System.out.println("Music");
				String musicMenu = """
1. Music player
2. Radio
3. Recorder
4. Track lists
""";
					System.out.println(musicMenu);
					int musicMenuChoice = input.nextInt();

					switch(musicMenuChoice){
						case 1: System.out.println("Music player"); break;
						case 2: System.out.println("Radio"); break;
						case 3: System.out.println("Recorder"); break;
						case 4: System.out.println("Track lists"); break;
						default: System.out.println("Invalid input"); break;

					}
				break; 
			case 9: System.out.println("Games");break; 
			case 10: System.out.println("Calculator");break; 
			case 11: System.out.println("Reminders");break;
			case 12: System.out.println("Clock");
				String clockMenu = """
1. Alarm clock
2. Clock settings
3. Date settings
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
""";
					System.out.println(clockMenu);
					int clockMenuChoice = input.nextInt();

					switch(clockMenuChoice){
						case 1: System.out.println("Alarm clock"); break;
						case 2: System.out.println("Clock settings"); break;
						case 3: System.out.println("Date settings"); break;
						case 4: System.out.println("Stopwatch"); break;
						case 5: System.out.println("Countdown timer"); break;
						case 6: System.out.println("Auto update of date and time"); break;
						default: System.out.println("Invalid input"); break;

					}
				break; 
			case 13: System.out.println("Profiles");break; 
			case 14: System.out.println("Services");break; 
			case 15: System.out.println("SIM services");break; 
			default: System.out.println("Invalid input"); break;				
	    }
    }
}

