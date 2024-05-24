
# Report

## Each commit described

1. JsonTask
JsonTask.java added from the previous assignment. 

2. AboutActivity
Activity created for the about page. This includes activity_about.xml, AboutActivity.java and an entry in AndroidManifest.xml.
The java file was forgotten until the Recycler Adapter was created. 

3. Toolbar Button
Adds a button to the MainActivity, containing logic to redirect you to the about page.
Initially this looks horrible because the button is placed wrongly in the xml. this is fixed in the next commit.

4. Toolbar Button both ways
Implements the same button the same way in the AboutActivity, redirecting you back to the main activity.
Also fixes the position of both buttons so they fit nicely inside the toolbar. 

5. Successful JSON retrieval
This commit enables internet access and successfully retrieves the data from the internet. 
The JsonFile.java was added here but is later removed. 
It also changes the title to a semi-appropriate name "Meso-American Temples".

6. Temple class
The temple class is created to enable demarshalling of the JSON. It contains the required variables and a simple toString() override. 

7. Gson
A list of temples is created to contain the demarshalled data. Using the Gson library the data is put into objects of type 'temple'. 

8. Recycler Adapter + forgotten file
AboutActivity is added to git here. 
A whole new class 'MyAdapter' is added for the RecyclerView. This implementation has a single TextView displaying the toString() of each temple. 
recycler_view_item.xml contains a simple monospaced layout for the text. 

9. Working recyclerView
The centered TextView in the main activity is now replaced with a RecyclerView. 
The setTempleList method inside MyAdapter is modified to properly display the content using notifyDataSetChanged();

10.  titles
Modifies MyAdapter to contain an additional text view for titles for each temple. 
This also requires an additional TextView to be added to recycler_view_item.xml, and a small getter for the temple name.

11. formatting
Changes colors of the toolbar and the app icon, with other small changes.
Realization that the data are pyramids, not temples, so title gets changed.

12. Pyramidification
Changes all mentions of temples to pyramids. 

