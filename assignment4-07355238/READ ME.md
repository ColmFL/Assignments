DESIGN RATIONALE

	The design philosophy used in this application is the Model View Controller pattern. This design pattern separates the application into three components so as to provide quick development. This pattern is more modular and so is simpler to extend. One begins by developing the model component. This entails creating the data structures which the view will render and the controller will manipulate. The next component to develop is the view component. The view component contains GUIs which the user sees, but which know nothing of the other components. The final component to develop is the controller component. This holds all of the methods which manipulate the model and update the view. 
	The system is designed on the Open and Closed principle. It is closed to further changes but is open to extension. This explains the use of the abstract class BroadcastMedia. This will enable extension, but not modification.
	

TEST SCENARIOS

***FilmTest***
			
	There are two tests contained in this test class. The first is a create and test method. This tests that the constructor works correctly and is designed to ensure that Film objects are created correctly. The second test is a setter test to test that the setDescription method works correctly.
			
***TVShowTest***
	
	There are two tests contained in this test class. The first is a create and test method. This tests that the constructor works correctly and is designed to ensure that TVShow objects are created correctly. The second test is a setter test to test that the setDescription method works correctly. 
	
***ProfileTest***

	There are two tests contained in this test class. The first is a create and test method. This tests that the constructor works correctly and is designed to ensure that Profile objects are created correctly. The second test is a setter test to test that the setName method works correctly.
	
***PeopleTest***

	There are two tests contained in this test class. The first is a create and test method. This tests that the constructor works correctly and is designed to ensure that Profile objects are created correctly. The second test is a setter test to test that the setPid method works correctly.
	
***GenreTest***

	There are two tests contained in this test class. The first is a create and test method. This tests that the constructor works correctly and is designed to ensure that Profile objects are created correctly. The second test is a setter test to test that the setGid method works correctly.
	
***CatalogueTest***

	There are two tests contained in this test class. The first is a create and test method. This tests that the constructor works correctly and is designed to ensure that Profile objects are created correctly. The second test is a setter test to test that the setGenres method works correctly.	
	
***IntegrationTest***

	
		
	

USER GUIDE

	The following is a brief guide for users on how to use their Media Catalogue. 

***Start-up/Video Catalogue***

	On opening the Media Catalogue application, the user will first see the Video Catalogue screen. This screen contains a user's catalogue. A default profile is displayed on opening the application. The default profile or a selected profile will display the user name in the top-right corner of the window. Four buttons are available on the left. From top to bottom these are: 'Switch Profile', 'Add New', 'List By Year', and finally 'List By Genre'. These buttons are detailed below. The rest of the window is populated with the film and tv series titles, their corresponding years of release, and their corresponding genres.
	
***Item Details***
	
	An items details can be viewed by clicking on a media title in the 'Video Catalogue' window. These titles are highlighted in blue to mark them for users. Once a title is clicked, the 'Item Details' window will open. This window will display details of the item in the following fields: 'Title', 'Description', 'Year', 'Genre', 'Director', and 'Cast'. To exit this menu, the user can simply click the 'Back' button.
	
***Switch Profile/Profile Selection***
	
	Once the 'Switch Profile' button is pressed, the list of available profiles are now displayed for the user. The application currently supports four profiles and so these are labelled on four buttons. The user simply clicks the button representing their profile and the Profile Selection window will close. Then the Video Catalogue will re-appear with the new profile having populated the window. 
	
***Add New/Add Item***
	 
	 The user may wish to extend their media library. This is facilitated by pressing the 'Add New' button in the Video Catalogue. On clicking this button, the 'Add Item' window will appear. This allow the user to fill the following fields: 'Title', 'Description', 'Year', 'Genre', 'Director', and 'Cast'. A check-box in the bottom-left corner can be checked to identify the entry as a tv series. Once the 'Save' button is clicked, the menu will close and the new entry will be saved to the user's catalogue. 
	 
***List By Year***

	 Once the 'List By Year' button is pressed, the 'List By Year' menu will appear. This menu will display all of a user's library items according to the year of release. The user can exit this menu by closing the 'List By Year' window.
	 
***List BY Genre***

	 Once the 'List by Genre' button is pressed, the 'List By Genre' menu will appear. This menu will display all of a user's library items according to the genres associated with the item. The user can exit this menu by closing the 'List By Genre' window.
	
INCLUSION OF PHYSICAL MEDIA

	It will be possible to extend the system to add physical media items to the library. This can be achieved by creating another class which will inherit attributes from BroadcastMedia.

SYSTEM EXTENSION

	The most useful way which the system can be extended would be to include functionality to add profiles. The system currently serves four users with a profile each, but with current profile allocation in other account-based media services being higher, this application should seek to follow this trend. To illustrate the point, a quick search reveals that Disney+ serves seven user profiles. Netflix serves five. Finally, Amazon Prime serves six. Bringing this application up to these industry standard levels would therefore be desirable.
	This could be achieved by creating a method which would add Profile objects to the 'profiles' ArrayList.
	