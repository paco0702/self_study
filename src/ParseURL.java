package self_S;

import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class ParseURL {
	public static void main (String [] args ) throws Exception {
		
		URL aURL = new URL (" http:// example.com:80/docs/books/tutorial" + " /index.html?name=networking#DOWNLOADING");
		
		System.out.println(" protocl = " + aURL.getProtocol()); 
		System.out.println(" authority = "+ aURL.getAuthority());
		System.out.println(" host = " + aURL.getHost());
		System.out.println(" port = " + aURL.getPort()); 
		System.out.println(" path = " + aURL.getQuery());
		System.out.println(" query = " + aURL.getQuery()); 
		System.out.println(" filename = " + aURL.getFile());
		System.out.println(" ref = " + aURL.getRef());
	
		try {
			URL myURL = new URL(" http://example.com");
			URLConnection myURLConnection = myURL.openConnection();
			myURLConnection.connect();
		}catch (MalformedURLException e) {
//			new URL() failed
		}
	}
}
