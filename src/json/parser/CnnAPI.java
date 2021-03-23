package json.parser;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

    public static void main(String[] args) throws IOException, JSONException {
//        String apiKey = "9c66701b5f2b46d8bca3ad6ceb22f5e2";
//        String URL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=" + apiKey;
//
//        JSONObject rootObject = new JSONObject(new String(Files.readAllBytes(new File("src/json/parser/data.json").toPath())));
//        rootObject.getJSONArray(URL);



        // Continue implementing here..
        Employee e1 = new Employee("mrahman@gmail.com" ,"Matiur Rahman" ,"400k" ,"Finance");
        Employee e2 = new Employee("mrahman@gmail.com" ,"Rohan Rahman" ,"100k", "Engineering");
        Employee e3 = new Employee("kafil@gmail.com" ,"Kafil", "200k" ,"Backend End Team");
        Employee e4 = new Employee( "Dave@gmail.com" ,"David Lenard" ,"140k" ,"Engineering");
        Employee e5 = new Employee( "rivera@gmail.com", "Rivera Dupp" ,"150k", "Finance");
        Employee e6 = new Employee("Anand@gmail.com", "Anand Thakkar", "120k" ,"SDET");
        Employee e7 = new Employee("sumay@gmail.com" ,"Sumaya Akbar", "200k" ,"Finance");
        Employee e8 = new Employee("mrahman@gmail.com" ,"Mizanur Rahman" ,"400k" ,"Finance");
        Employee e9 = new Employee("mrahman2@gmail.com" ,"Mizanur Rahman" ,"405k", "Finance");
        Employee e10 = new Employee("mdtaque@gmail.com" ,"rifat taque" ,"400k" ,"QA");
        Employee e11 = new Employee("mdtaque@gmail.com" ,"rifat taque" ,"400k" ,"QA");
        ArrayList<Employee> news = new ArrayList<>();
        news.add(e1);
        news.add(e2);
        news.add(e3);
        news.add(e4);
        news.add(e5);
        news.add(e6);
        news.add(e7);
        news.add(e8);
        news.add(e9);
        news.add(e10);
        news.add(e11);

        Iterator it = news.iterator();

        while (it.hasNext()){
            Employee em = (Employee) it.next();
            System.out.println(em.getEmpEmail()+" "+em.getEmpName()+" "+em.getSalary()+" "+em.getDepartment());
        }



    }

}
